package _5_tic_tac_toe.model;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class TicTacToeGame {
    private Deque<Player> players;
    private Board gameBoard;
    private Scanner scanner;

    TicTacToeGame() {
        initializeGame();
    }

    void initializeGame() {
        scanner = new Scanner(System.in);
        gameBoard = new Board(3);
        players = new LinkedList<>();
        Player player1 = new Player("Player1", new PlayingPieceX());
        Player player2 = new Player("Player2", new PlayingPieceO());
        players.add(player1);
        players.add(player2);
    }

    String startGame() {
        int remainingCount = gameBoard.size * gameBoard.size;
        boolean isWinner = false;
        while (!isWinner && remainingCount != 0) {
            gameBoard.printBoard();
            Player player = players.removeFirst();
            System.out.println(player.name + ", please enter the row and column to add piece: ");
            String[] input = scanner.nextLine().trim().split(" ");
            int row, col;
            try {
                row = Integer.parseInt(input[0]);
                col = Integer.parseInt(input[1]);
                if (isWrongInput(row, col)) throw new NumberFormatException();
            } catch (NumberFormatException exception) {
                System.out.println("Please enter the correct input");
                players.addFirst(player);
                continue;
            }
            if (!gameBoard.addPiece(row, col, player.playingPiece)) {
                players.addFirst(player);
                continue;
            }
            isWinner = isThereWinner();
            if (isWinner) {
                gameBoard.printBoard();
                return player.name;
            }
            --remainingCount;
            players.add(player);
        }
        gameBoard.printBoard();
        return "No one is winner, it is Draw";
    }

    private boolean isWrongInput(int row, int col) {
        return row < 0 || row >= gameBoard.size || col < 0 || col >= gameBoard.size;
    }

    private boolean isThereWinner() {
        PlayingPiece[][] board = gameBoard.board;
        int size = gameBoard.size;

        for (int i = 0; i < size; i++) {
            if (board[i][0] != null) {
                PieceType pieceType = board[i][0].pieceType;
                boolean isWinner = true;
                for (int j = 1; j < size; j++) {
                    if (board[i][j] == null || board[i][j].pieceType != pieceType) {
                        isWinner = false;
                        break;
                    }
                }
                if (isWinner) return true;
            }
        }

        for (int j = 0; j < size; j++) {
            if (board[0][j] != null) {
                PieceType pieceType = board[0][j].pieceType;
                boolean isWinner = true;
                for (int i = 1; i < size; i++) {
                    if (board[i][j] == null || board[i][j].pieceType != pieceType) {
                        isWinner = false;
                        break;
                    }
                }
                if (isWinner) return true;
            }
        }

        if (board[0][0] != null) {
            PieceType pieceType = board[0][0].pieceType;
            boolean isWinner = true;
            for (int i = 1; i < size; i++) {
                if (board[i][i] == null || board[i][i].pieceType != pieceType) {
                    isWinner = false;
                    break;
                }
            }
            if (isWinner) return true;
        }

        if (board[0][size - 1] != null) {
            PieceType pieceType = board[0][size - 1].pieceType;
            boolean isWinner = true;
            for (int i = 1; i < size; i++) {
                if (board[i][size - i - 1] == null || board[i][size - i - 1].pieceType != pieceType) {
                    isWinner = false;
                    break;
                }
            }
            if (isWinner) return true;
        }

        return false;
    }
}

