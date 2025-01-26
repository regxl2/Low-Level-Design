package _9_prototype_pattern;


// Say you have an object, and you want to create an exact copy of it.
// How would you do it? First, you have to create a new object of the same class.
// Then you have to go through all the fields of the original object and copy their values over to the new object.
// Nice! But there’s a catch. Not all objects can be copied that way because some of the object’s fields
// may be private and not visible from outside the object itself.

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
