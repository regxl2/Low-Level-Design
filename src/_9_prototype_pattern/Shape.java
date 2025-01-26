package _9_prototype_pattern;

import java.util.Objects;

abstract class Shape {
    int x;
    int y;
    String color;

    Shape(){}

    Shape(Shape obj){
        this.x = obj.x;
        this.y = obj.y;
        this.color = obj.color;
    }

    abstract Shape copy();

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Shape)) return false;
        Shape shape = (Shape) obj;
        return shape.x == this.x && shape.y == this.y && Objects.equals(this.color, shape.color);
    }
}
