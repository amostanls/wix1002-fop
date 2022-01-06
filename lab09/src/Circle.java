public class Circle extends Shape {
    private double diameter;

    public Circle() {
        super("Circle", 0, 0);
    }

    public void setDiameter() {
        System.out.print("Diameter of circle (m): ");
        diameter = in.nextDouble();
    }

    // 2 x pi x r -> pi x (2r)  -> pi x d
    public void calcPerimeter() {
        setPerimeter(Math.PI * diameter);
    }

    // pi x r x r -> pi x (d/2) x (d/2)
    public void calcArea() {
        setArea(Math.PI * (diameter/2) * (diameter/2));
    }
}
