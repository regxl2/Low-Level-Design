package _13_facade_pattern;


//The Facade pattern hides the complexities of the system and provides an interface
//to the client using which the client can access the system. This type of design pattern
//comes under a structural pattern as this pattern adds an interface to existing system to hide its complexities.
//This pattern involves a single class which provides simplified methods
//required by client and delegates calls to methods of existing system classes.

public class FacadeShapeMaker {
    private final Triangle triangle;
    private final Rectangle rectangle;
    private final Square square;

    FacadeShapeMaker(){
        this.rectangle = new Rectangle();
        this.triangle = new Triangle();
        this.square = new Square();
    }

    void drawRectangle(){
        rectangle.draw();
    }

    void drawTriangle(){
        triangle.draw();
    }

    void drawSquare(){
        square.draw();
    }
}
