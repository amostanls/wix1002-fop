import java.util.Scanner;

public class Shape {
    private String name;
    private double perimeter, area;

    public Scanner in = new Scanner(System.in);

    public Shape(String name, double perimeter, double area) {
        this.name = name;
        this.perimeter = perimeter;
        this.area = area;
    }

    public void display() {
        System.out.println("Name: \t\t" + name);
        System.out.printf("Perimeter: \t%.2f m\n", perimeter);
        System.out.printf("Area: \t\t%.2f m^2\n", area);
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
