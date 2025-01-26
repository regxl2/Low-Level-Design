package _10_adapter_pattern;

//Adapter is a structural design pattern, which allows incompatible objects to collaborate.
//The Adapter acts as a wrapper between two objects.
//It catches calls for one object and transforms them to format and interface recognizable by the second object.
//Usage examples: The Adapter pattern is pretty common in Java code.
//It’s very often used in systems based on some legacy code.
//In such cases, Adapters make legacy code work with modern classes.

public class Main {
    public static void printResult(boolean bool){
        if(bool){
            System.out.println("It fits RoundHole");
        }
        else{
            System.out.println("It doesn't fit RoundHole");
        }
    }
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(10);
        RoundPeg roundPeg1 = new RoundPeg(10);
        printResult(roundHole.fits(roundPeg1));
        RoundPeg roundPeg2 = new RoundPeg(11);
        printResult(roundHole.fits(roundPeg2));

        SquarePeg squarePeg1 = new SquarePeg(14.15);
        SquareAdapter squareAdapter1 = new SquareAdapter(squarePeg1);
        printResult(roundHole.fits(squareAdapter1));
        SquarePeg squarePeg2 = new SquarePeg(7);
        SquareAdapter squareAdapter2 = new SquareAdapter(squarePeg2);
        printResult(roundHole.fits(squareAdapter2));
    }
}
