public class l6q2 {
    public static void main(String[] args) {
        // triangle
        int height_triangle = 10; // height of triangle
        for(int i=0; i<height_triangle; i++) {
            int spaces = height_triangle-1 - i;
            multiPrint(spaces, ' ');
            multiPrint(2*i+1, '*');
            System.out.println();
        }

        multiPrint(40, '-');
        System.out.println();

        // diamond
        int height_diamond = 11; // height of diamond
        // assumption height is always odd
        // upper triangle of diamond
        int upper = (height_diamond+1)/2;
        for(int i=0; i<upper; i++) {
            int spaces = upper-1 - i;
            multiPrint(spaces, ' ');
            multiPrint(2*i+1, '*');
            System.out.println();
        }
        // lower triangle of diamond
        int lower = height_diamond-upper;
        for(int i=lower-1; i>=0; i--) {
            int spaces = upper-1 - i;
            multiPrint(spaces, ' ');
            multiPrint(2*i+1, '*');
            System.out.println();
        }
    }

    public static void multiPrint(int n, char c) {
        for(int i=0; i<n; i++)
            System.out.print(c);
    }
}
