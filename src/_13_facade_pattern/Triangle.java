package _13_facade_pattern;

public class Triangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Triangle::draw()");
    }
}
