public class WeightCalculator {
    private int age;
    private double height, weight_r;
    // weight_r: Recommended weight

    public WeightCalculator(int age, double height) {
        this.age = age;
        this.height = height;
        this.weight_r = (height-100+(double) age/10)*0.9;
    }

    public void display() {
        System.out.println("Age: "+age);
        System.out.println("Height (cm): "+height);
        System.out.printf("%s %.2f\n","Recommended weight (kg):",weight_r);
    }
}
