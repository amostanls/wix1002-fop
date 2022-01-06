public class Tester {
    public static void main(String[] args) {
//        q1();
//        q2();
//        q3();
        q4();
    }

    public static void q1() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLengthAndWidth();
        rectangle.calcPerimeter();
        rectangle.calcArea();
        rectangle.display();

        Square square = new Square();
        square.setLength();
        square.calcPerimeter();
        square.calcArea();
        square.display();

        Circle circle = new Circle();
        circle.setDiameter();
        circle.calcPerimeter();
        circle.calcArea();
        circle.display();
    }

    public static void q2() {
        Student student = new Student("Amos", "Male", "2XXX-XX-XX", "course.txt");
        student.display();
    }

    public static void q3() {
        Lecturer lecturer = new Lecturer("Dr", "Female", "XXXX-XX-XX", "lecturer.txt");
        lecturer.display();
    }

    public static void q4() {
//        Game01 game01 = new Game01("Amos", "Jack");
//        game01.start();

        Game02 game02 = new Game02("ABC", "XYZ");
        game02.start();
    }
}
