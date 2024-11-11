package _5_tic_tac_toe;

public class Board {
    int size;
    PlayingPiece [][] board;

    public Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    boolean addPiece(int i, int j, PlayingPiece playingPiece){
        if(board[i][j]!=null){
            System.out.println("This place is already occupied");
            return false;
        }
        board[i][j] = playingPiece;
        return true;
    }

    void printBoard(){
        for(int i =0; i<size; i++){
            for(int j=0; j<size; j++){
                if(board[i][j]==null){
                    System.out.print("-");
                }
                else{
                    System.out.print(board[i][j].pieceType.name());
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
