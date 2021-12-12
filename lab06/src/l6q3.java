import java.util.Arrays;

public class l6q3 {
    public static void main(String[] args) {
        int[] a = {1234, 17000, 10000, 10, 456456, 3423, 4545, 2342341, 11612, 99};
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
    public static int[] reverse(int[] arr) {
        for(int i=0; i<10; i++) {
            int x = arr[i];
            int res = 0;
            while (x > 0) {
                res *= 10;
                res += x % 10;
                x /= 10;
            }
            arr[i] = res;
        }
        return arr;
    }
}
