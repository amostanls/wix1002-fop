public class Square extends Shape {
    private double length;

    public Square() {
        super("Square", 0, 0);
    }

    public void setLength() {
        System.out.print("Length of square (in m): ");
        length = in.nextDouble();
    }

    public void calcPerimeter() {
        setPerimeter(4 * length );
    }

    public void calcArea() {
        setArea(length * length);
    }
}
