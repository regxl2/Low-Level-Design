package _13_facade_pattern;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
