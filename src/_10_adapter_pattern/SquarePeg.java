package _10_adapter_pattern;

// SquarePeg(Adaptee) is not compatible with RoundHole(Client)

public class SquarePeg {
    double width;
    SquarePeg(){}
    SquarePeg(double width){
        this.width = width;
    }
    double getWidth(){
        return width;
    }
}
