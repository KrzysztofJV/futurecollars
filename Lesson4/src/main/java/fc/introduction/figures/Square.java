package fc.introduction.figures;

public class Square extends Rectangle{

    public Square(double height, double width) {
        super(height, width);
        if (width <= 0) throw new RuntimeException("Error: the side of the square must be greater than zero.");
    }

    @Override
    public double getArea() {
        System.out.println("The area of square is ");
        return (Math.pow(width,2));
    }

    @Override
    public double getPerimeter() {
        System.out.println("The perimeter of square is ");
        return 4*width;
    }
}
