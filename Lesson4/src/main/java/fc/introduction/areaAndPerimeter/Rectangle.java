package fc.introduction.areaAndPerimeter;

public class Rectangle implements AreaAndPerimeter {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        if (width<=0 || height<=0) throw new RuntimeException("Error: the sides of rectangle must be grater then zero.");
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (2 * width) + (2 * height);
    }
}
