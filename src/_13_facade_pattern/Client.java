package _13_facade_pattern;

public class Client {
    public static void main(String[] args) {
        FacadeShapeMaker shapeMaker = new FacadeShapeMaker();;
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
        shapeMaker.drawTriangle();
    }
}
