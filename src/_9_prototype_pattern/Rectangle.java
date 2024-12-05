package _9_protype_pattern;


public class Rectangle extends Shape{

    int width;
    int height;

    Rectangle(){}

    Rectangle(Rectangle rectangle){
        super(rectangle);
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    @Override
    Shape copy() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Rectangle) || !super.equals(obj)) return false;
        Rectangle rectangle = (Rectangle) obj;
        return rectangle.width == this.width && rectangle.height == this.height;
    }
}
