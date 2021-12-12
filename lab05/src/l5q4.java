public class l5q4 {
    public static void main(String[] args) {
        int[][] matrix = {{1,5,7},
                          {3,6,9},
                          {5,3,8}};
        System.out.println("3 by 3 Matrix");
        for(int[] x : matrix) {
            for(int y : x) {
                System.out.print(y + " ");
            }
            System.out.println("");
        }

        /*
        what we want:
        5 3 1
        3 6 5
        8 9 7
         */

        // 1 (0,0) -> (0,2)
        // 5 (0,1) -> (1,2)
        // 7 (0,2) -> (2,2)
        // 3 (1,0) -> (0,1)
        // ...
        // (x,y) -> (y, 2-x)

        int[][] rotated_matrix = new int[3][3];
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                rotated_matrix[j][2-i] = matrix[i][j];
            }
        }

        System.out.println("After rotates 90 degrees clockwise");
        for(int[] x : rotated_matrix) {
            for(int y : x) {
                System.out.print(y + " ");
            }
            System.out.println("");
        }
    }
}
