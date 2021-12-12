import java.util.Scanner;

public class l5q6 {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows of Pascal Triangle to generate: ");
        int n = new Scanner(System.in).nextInt();

        int[][] pascal = new int[n][n];
        pascal[0][0]=1;
        for(int i=1; i<n; i++) {
            for(int j=0; j<n; j++) {
               pascal[i][j] += pascal[i - 1][j]; // value on top
               if (j > 0) pascal[i][j] += pascal[i - 1][j - 1]; // value of the left on the top
            }
        }

        System.out.println("The Pascal Triangle with "+n+" rows");
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(pascal[i][j]+" ");
            }
            System.out.println();
        }
    }
}
