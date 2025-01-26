package _10_adapter_pattern;


// RoundHole(Client) is compatible with RoundPegs(Target)
class RoundHole {
    double radius;
    RoundHole(double radius){
        this.radius = radius;
    }
    double getRadius(){
        return radius;
    }
    public boolean fits(RoundPeg peg){
        return this.getRadius()>=peg.getRadius();
    }
}
