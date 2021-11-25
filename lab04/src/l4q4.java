import java.util.Scanner;

public class l4q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the year of your calendar: ");
        int year = in.nextInt();

        System.out.print("Enter the first day of the year (0 for Sunday, 1 for Monday, ... , 6 for Saturday): ");
        int fday = in.nextInt();
        int days = 31+28+31+30+fday;
        // days: days which has passed

        //A leap year is exactly divisible by 4 except for century years (years ending with 00).
        //The century year is a leap year only if it is perfectly divisible by 400.
        if(year%4==0) {
            if(year%100!=0) {
                days++;
            }else {
                //century year
                if (year%400==0)days++;
            }
        }

        String[] month_names = {"May", "June", "July", "August"};
        int[] month_days = {31,30,31,31};
        String[] dow_names = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        for(int i=0; i<4; i++) {
            System.out.println(month_names[i]+" "+year);
            //first line
            for(int j=0; j<28; j++)
                System.out.print("-");
            System.out.println();

            //day of week
            for(int j=0; j<7; j++)
                System.out.printf("%s\t",dow_names[j]);
            System.out.println();

            //second line
            for(int j=0; j<28; j++)
                System.out.print("-");
            System.out.println();

            int left = days%7; //from previous month
            int start = 1;
            boolean done = false;
            for(int j=0; j<6 && !done; j++) {
                for(int k=0; k<7; k++) {
                    if(left>0) {
                        // _ _ _ 1 2 3 4
                        left--;
                        System.out.print("\t");
                    }else if(done) {
                        // 30 31 _ _ _ _ _
                        System.out.print("\t");
                    }else if(start<=month_days[i]) {
                        System.out.printf("%d\t", start);
                        start++;
                    }

                    if(start>month_days[i]) {
                        done = true;
                    }
                }
                System.out.println();
            }

            //third line
            for(int j=0; j<28; j++)
                System.out.print("-");
            System.out.println();
            System.out.println();

            days += month_days[i];
        }
    }
}
