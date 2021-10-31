package L1Q2;

public class test {
    public static void main(String[] args){
//        int i=1;
//        while(i <= 3) {
//            // Iteration 1: i = 1, i <= 3, output i (1), i++
//            // Iteration 2: i = 2, i <= 3, output i (2), i++
//            // Iteration 3: i = 3, i <= 3, output i (3), i++
//            // Iteration 4: i = 4, i <= 3 rejected, break the loop
//            System.out.println(i);
//            i++;
//        }

        int i=1;
        for(; i<=3; ) {
            System.out.println(i);
            i++;
        }
    }
}

/* for loop
int a[] = {42,13,718,1,10};
//          0  1  2  3  4
// a[0] = 42
// a[1] = 13
// a[2] = 718
// a[3] = 1
// a[4] = 10
for(int i=0; i<a.length; i++) {
    // Iteration 1: i = 0, i < 5, output a[0] (42), i++
    // Iteration 2: i = 1, i < 5, output a[1] (13), i++
    // Iteration 3: i = 2, i < 5, output a[2] (718), i++
    // Iteration 4: i = 3, i < 5, output a[3] (1), i++
    // Iteration 5: i = 4, i < 5, output a[4] (10), i++
    // Iteration 6: i = 5, i < 5 rejected, break the loop
    System.out.println(a[i]);
}
 */