package _10_adapter_pattern;

// RoundPegs are compatible with RoundHoles.

class RoundPeg {
    double radius;
    RoundPeg(){}
    RoundPeg(double radius){
        this.radius = radius;
    }
    double getRadius(){
        return radius;
    }
}
