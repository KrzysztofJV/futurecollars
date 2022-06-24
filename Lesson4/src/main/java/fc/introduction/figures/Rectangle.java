package fc.introduction.figures;

public class Rectangle extends Square{

    public final double height;

    public Rectangle(double width, double height) {
        super(width);
        this.height = height;
        if (height <= 0) throw new RuntimeException("Error: the sides of the rectangle must be greater than zero.");
    }

    @Override
    public double getArea() {
        System.out.println("The area of rectangle is ");
        return height*width;
    }

    @Override
    public double getPerimeter() {
        System.out.println("The perimeter of rectangle is ");
        return (2*width)+(2*height);
    }
}
