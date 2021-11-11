import java.util.Scanner;

public class l2q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Take input for temperature_f
        System.out.print("Temperature in Fahrenheit: ");
        double temperature_f = in.nextDouble();

        // Calculate temperature_c
        // Celsius = (Fahrenheit – 32) / 1.8
        double temperature_c = (temperature_f-32)/1.8;

        // Display output
        System.out.printf("%s %.2f\n", "Temperature in Celsius: ", temperature_c);
    }
}
