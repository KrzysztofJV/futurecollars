package fc.introduction.figures;

public class Circle extends Shape{

    private final double piNumber = 3.14;
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
        if (radius <= 0) throw new RuntimeException("Error: the radius of the circle must be greater than zero.");
    }

    @Override
    public double getArea() {
        System.out.println("The area of circle is ");
        return piNumber*(Math.pow(radius,2));
    }

    @Override
    public double getPerimeter() {
        System.out.println("The perimeter of circle is");
        return 2*piNumber*radius;
    }
}
