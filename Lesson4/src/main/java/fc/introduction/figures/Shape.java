package fc.introduction.figures;

public abstract class Shape {

    public abstract double getArea();
    public abstract double getPerimeter();


    public static void main(String[] args) {
        Square square = new Square(-4);
        System.out.println(square.getArea());
    }
}
