import java.util.Random;
import java.util.Scanner;

public class l5q5 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new int[20];
        for(int i=0; i<20; i++) {
            arr[i] = rnd.nextInt(101);
        }

        System.out.println("A list of 20 random integers within 0 and 100");
        for(int i=0; i<20; i++) {
            if(i>0) System.out.print(", ");
            System.out.print(arr[i]);
        }
        System.out.println();

        // sort in descending order
        boolean done = true;
        do {
            done = true;
            for(int i=0; i<20-1; i++) {
                // put -1 because arr[19] cannot compare with arr[20], 19 comparisons in total
                if(arr[i] < arr[i+1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    done = false;
                }
            }
            //done = true when arr[i]>=arr[i+1]
        }while(!done);

        System.out.println("Array in descending order");
        for(int i=0; i<20; i++) {
            if(i>0) System.out.print(", ");
            System.out.print(arr[i]);
        }
        System.out.println();

        System.out.print("Enter a number to search: ");
        int num = new Scanner(System.in).nextInt();

        // Linear Search
        {
            boolean found = false;
            int cnt = 0;            // number of comparisons
            for(int i=0; i<20; i++) {
                cnt++;
                if(arr[i]==num) {
                    found = true;
                    break;
                }
            }
            if(found) {
                System.out.println(num+" found");
            }else {
                System.out.println(num+" not found");
            }
            System.out.println("Linear Search - "+cnt+" comparison(s)");
        }

        // Binary Search
        {
            boolean found = false;
            int cnt = 0;         // number of comparisons
            int lo = 0, hi = 19; // indices
            while(lo<=hi) {
                cnt++;
                int mid = (lo+hi)/2;
                if(arr[mid]==num) {
                    found = true;
                    break;
                }else if(arr[mid]>num){
                    // arr is in descending order
                    // arr[mid]>num, num should be on the right (smaller)
                    lo = mid+1;
                }else {
                    // arr[mid]<num, num should be on the left (bigger)
                    hi = mid-1;
                }
            }
            // big picture
            // 0 1 2 3 4 5 6* 7 8 9 10, lo = 0, hi = 10, mid = 5
            // 0 1 2 3 4 5| 6* 7 8 9 10, lo = 6, hi = 10, mid = 8
            // 0 1 2 3 4 5| 6* 7 |8 9 10, lo = 6, hi = 7, mid = 6

            // why lo<=hi ?
            // num is not in the array
            // lo == hi
            // mid = (lo+hi)/2 = lo
            // Case 2: arr[mid]>num
            // lo = mid + 1
            // lo > hi
            // Case 3: arr[mid]<num
            // hi = mid - 1
            // lo > hi

            if(found) {
                System.out.println(num+" found");
            }else {
                System.out.println(num+" not found");
            }
            System.out.println("Binary Search - "+cnt+" comparison(s)");
        }
    }
}
