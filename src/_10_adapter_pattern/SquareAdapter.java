package _10_adapter_pattern;

public class SquareAdapter extends RoundPeg{
    private final SquarePeg squarePeg;
    SquareAdapter(SquarePeg squarePeg){
        this.squarePeg = squarePeg;
    }
    @Override
    double getRadius() {
        return Math.sqrt(2*Math.pow(squarePeg.getWidth(), 2))/2;
    }
}
