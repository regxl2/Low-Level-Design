package _9_prototype_pattern;

public class Main {

    public static void isEqual(Object obj1, Object obj2){
        if(obj1.equals(obj2)){
            System.out.println("both  are equal");
        }
        else{
            System.out.println("both are not equal");
        }
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.x = 10;
        circle1.y = 20;
        circle1.color = "Yellow";
        circle1.radius = 5;
        Circle circle2 = (Circle) circle1.copy();
        isEqual(circle1, circle2);
        circle2.radius = 4;
        isEqual(circle1, circle2);

        Rectangle rectangle1 = new Rectangle();
        rectangle1.x = 10;
        rectangle1.y = 20;
        rectangle1.color = "Red";
        rectangle1.width = 10;
        rectangle1.height = 20;
        Rectangle rectangle2 = (Rectangle) rectangle1.copy();
        isEqual(rectangle1, rectangle2);
        rectangle1.x = 20;
        isEqual(rectangle1, rectangle2);
        rectangle2.x = 20;
        isEqual(rectangle1, rectangle2);
    }
}
