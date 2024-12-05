package _9_protype_pattern;

public class Circle extends Shape{
    int radius;

    Circle(){}

    Circle(Circle circle){
        super(circle);
        this.radius = circle.radius;
    }

    @Override
    Shape copy() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Circle) || !super.equals(obj)) return false;
        Circle circle = (Circle) obj;
        return circle.radius == this.radius;
    }
}
