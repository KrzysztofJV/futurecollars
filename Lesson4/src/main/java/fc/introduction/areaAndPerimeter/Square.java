package fc.introduction.areaAndPerimeter;

public class Square implements AreaAndPerimeter {

    private final double width;

    public Square(double width) {
        this.width = width;
        if (width<=0) throw new RuntimeException("Error: the width of the square must be greater than zero.");
    }

    @Override
    public double getArea() {
        return (Math.pow(width, 2));
    }

    @Override
    public double getPerimeter() {
        return 4 * width;
    }
}
