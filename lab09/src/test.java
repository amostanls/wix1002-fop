//tutorial 09

public class test {
    public static void main(String[] args) {
        Student1 student1 = new Student1("ABC", new String[]{"Math", "Science"});
        Teacher teacher = new Teacher("Mr. Lim", new String[]{"English"});
//        if(compare(student1, teacher)) {
//            System.out.println("nice");
//        }else {
//            System.out.println("not nice");
//        }

//        if(isClass(student1)) {
//            System.out.println("Nice");
//        }else {
//            System.out.println("Not nice");
//        }
        PurchaseSystem purchaseSystem = new PurchaseSystem("XYZ0002", 5.60, 3);
        purchaseSystem.compute();
        purchaseSystem.display();

        SugarPurchase sugarPurchase = new SugarPurchase("ABC1001", 4.50, 10, 0.3);
        sugarPurchase.compute();
        sugarPurchase.display();
    }

    public static boolean compare(Student1 s, Teacher t) {
        if (s.getClass().equals(t.getClass()))
            return true;
        else
            return false;
    }

    public static boolean isClass(Student1 s) {
        if (s instanceof Person)
            return true;
        else
            return false;
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
}

class Teacher extends Person{
    private String[] subjects;

    public Teacher(String name, String[] subjects) {
        super(name);
        this.subjects = subjects;
    }
}

class Student1 extends Person {
    private String[] courses;

    public Student1(String name, String[] courses) {
        super(name);
        this.courses = courses;
    }
}

class Organism {
    protected double size, rate;

    public Organism(double a, double b) {
        size = a;
        rate = b;
    }
}

class Animal extends Organism {
    private double eating;

    public Animal(double a, double b, double c) {
        super(a, b);
        eating = c;
    }

    public void display() {
        System.out.println("Initial size of the organism: " + size);
        System.out.println("Growth Rate: " + rate);
        System.out.println("Eating requirement: " + eating);
    }
}


class PaySystem {
    private double hour, payrate;

    public PaySystem(double h, double r) {
        hour = h;
        payrate = r;
    }

    public double getPay() {
        return hour*payrate;
    }
}

class RegularPay extends PaySystem{

    public RegularPay(double h, double r) {
        super(h, r);
    }
}

class SpecialPay extends PaySystem{

    public SpecialPay(double h, double r) {
        super(h, r);
    }

    @Override
    public double getPay() {
        return super.getPay()*1.3;
    }
}

class PurchaseSystem {
    protected double unitPrice;
    protected int quantity;
    private String productCode;
    protected double totalPrice;

    public PurchaseSystem(String pc, double p, int q) {
        productCode = pc;
        unitPrice = p;
        quantity = q;
    }

    public void compute() {
        totalPrice = unitPrice*quantity;
    }

    public void display() {
        System.out.println("Product Code: " + productCode);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total Price: " + totalPrice);
    }
}

class SugarPurchase extends PurchaseSystem {
    private double weight; //sugar weight

    public SugarPurchase(String pc, double p, int q, double w) {
        super(pc, p, q);
        weight = w;
    }

    @Override
    public void compute() {
        totalPrice = unitPrice*quantity*weight;
    }
}
