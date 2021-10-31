package L1Q4;

public class l1q4_adv {
    public static void main(String[] args) {
        System.out.println("^");

        int[] hit = {2500, 1600, 2000, 2700, 3200, 800};
        for(int i = 21; i > 0; i--) {
            System.out.print("|\t");
            checkHori(i, hit);

            System.out.println("");
        }
        System.out.print("+");
        for(int i = 0; i < hit.length; i++) {
            System.out.print("----------------");
        }
        System.out.println(">");
        System.out.println("\t JAN\t FEB\t MAR\t APR\t MAY\t JUN");
    }

    static void checkHori(int y, int[] hit) {
        for(int i = 0; i < hit.length; i++) {
            //2500
            //hit[i]/200 = 12

            if(y == hit[i] / 200 + 2) {
                // y == 12+2 , y = 14
                System.out.print(" "+hit[i] + "\t");
            }else if(y == hit[i] / 200 + 1) {
                // y == 12+1, y = 13
                System.out.print("_____\t");
            }else if(y <= hit[i] / 200) {
                // y <= 12 |  |
                System.out.print("|\t|\t");
            }else {
                // y >= 15
                System.out.print("\t\t");
            }
        }
    }
}
