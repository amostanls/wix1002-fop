import java.util.Random;

public class Number {
    private int[] arr;
    private Random rnd = new Random();

    public Number(int n, int maximum) {
        arr = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = rnd.nextInt(maximum+1); //[0, maximum]
            // rnd.nextInt(10+1) -> [0,10]
        }
    }

    public Number() {
        this(10, 100);
    }

    public Number(int n) {
        this(n, 100);
    }

    public void display() {
        // display all items
        for(int x:arr) {
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public void displayEven() {
        // display even numbers
        for(int x:arr) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }

    public void displayPrime() {
        for(int x:arr) {
            if(x==0||x==1)continue;
            boolean prime = true;
            for(int i=2; i<x; i++) {
                if(x%i==0)prime=false;
            }
            if(prime) System.out.print(x+" ");
        }
        System.out.println();
    }

    public void displayMax() {
        // method 1
//        int mx = -1; // since all values > -1
//        for(int x:arr) {
//            if(x>mx) mx = x;
//        }
//        System.out.println(mx);

        // method 2
        int mx = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(mx<arr[i])mx = arr[i];
        }
        System.out.println(mx);
    }

    public void displayMin() {
        int mn = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i]<mn) mn = arr[i];
        }
        System.out.println(mn);
    }

    public void displayAverage() {
        double sum = 0, average=0;
        for(int x:arr)
            sum += x;
        average = sum / arr.length;
        System.out.println(average);
    }

    public void displaySquare() {
        // 1, 4, 9, 16, ...
        for(int x:arr) {
            int y = (int)Math.sqrt(x);
            // x = y * y
            // y = sqrt(x)
            // x = 15
            // y = 3.87 -> 3
            // y*y = 9 != 15
            if(y*y==x) {
                System.out.print(x+" ");
            }
        }
        System.out.println();
    }
}
