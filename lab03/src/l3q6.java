import java.util.Scanner;

public class l3q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of circle (0,0): ");
        double radius = sc.nextInt();
        System.out.print("Enter coordinate-x: ");
        int x = sc.nextInt();
        System.out.print("Enter coordinate-y: ");
        int y = sc.nextInt();

        // Assumption: x,y,radius >=1
        // 2^2 = 4 > 2
        // 0.5^2 = 0.25 < 0.5

        // distance is point (x,y) to (0,0), distance_2 = distance ^ 2
        // rad is radius, rad_2 = rad ^ 2
        double distance_2 = (double) x*x + (double) y*y;
        double rad_2 = radius * radius;

        if(distance_2 < rad_2) {
            System.out.println("The point is inside the circle");
        }else if(distance_2 == rad_2) {
            System.out.println("The point is on the circle");
        }else{
            System.out.println("The point is outside the circle");
        }
    }
}
