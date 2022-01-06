public class Rectangle extends Shape{
    private double length, width;

    public Rectangle() {
        super("Rectangle", 0, 0);
    }

    public void setLengthAndWidth() {
        System.out.print("Length of rectangle (in m): ");
        length = in.nextDouble();
        System.out.print("Width of rectangle (in m): ");
        width = in.nextDouble();
    }

    public void calcPerimeter() {
        setPerimeter(2 * length + 2 * width);
    }

    public void calcArea() {
        setArea(length * width);
    }
}
