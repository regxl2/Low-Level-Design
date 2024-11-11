package _4_factory_abstractfactory_pattern;

// Factory pattern is useful in those cases where we have to create
// dynamically create the object the of the class.

enum ShapeType{
    CIRCLE,
    RECTANGLE,
    SQUARE
}

interface Shape {
    void draw();
}

class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}

class Square implements Shape{
    @Override
    public void draw(){
        System.out.println("Square");
    }
}

class ShapeFactory{
    static Shape createShape(ShapeType shapeType){
        if(shapeType == ShapeType.CIRCLE) return new Circle();
        else if(shapeType == ShapeType.RECTANGLE) return new Rectangle();
        return new Square();
    }
}

public class FactoryPattern {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.createShape(ShapeType.CIRCLE);
        circle.draw();

        Shape rectangle = ShapeFactory.createShape(ShapeType.RECTANGLE);
        rectangle.draw();

        Shape square = ShapeFactory.createShape(ShapeType.SQUARE);
        square.draw();
    }
}
