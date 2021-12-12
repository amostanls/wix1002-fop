import java.util.Random;

public class t5q6 {
    public static void main(String[] args) {
//        int num = new Random().nextInt(256);
        int num = 217; //11011001
        boolean[] bits = new boolean[8];

//        for(int i=7; i>=0; i--) {
////            System.out.println(i+" "+(1<<i)+" "+(num&(1<<i)));
//            bits[7-i] = (num & (1<<i))!=0;
//        }
        // 1 << i -> left shift i bits
        // 1 << 0 = 1 =    1 (binary) & 11011001 = 1 -> 1
        // 1 << 1 = 2 =   10 (binary) & 11011001 = 0
        // 1 << 2 = 4 =  100 (binary) & 11011001 = 0
        // 1 << 3 = 8 = 1000 (binary) & 11011001 = 1000 -> 8
        // ...

        //  11011001
        // &00001000
        // ---------
        //  00001000


        // right shift bits
        for(int i=0; i<8; i++) {
//            System.out.println(i+" "+(num>>i)+" "+((num>>i)&1));
            if( ( (num>>i) & 1 ) == 1 ) {
                bits[7-i] = true;
            }else {
                bits[7-i] = false;
            }
        }
        // num = 11011001 (217)
        // i = 0, (num>>0) = 11011001 & 1 = 1
        // i = 1, (num>>1) =  1101100 & 1 = 0
        // i = 2, (num>>2) =   110110 & 1 = 0
        // i = 3, (num>>3) =    11011 & 1 = 1
        // i = 4, (num>>4) =     1101 & 1 = 1
        // ...

        System.out.print(num+"=");
        for(int i=0; i< bits.length; i++) {
            if(bits[i])
                System.out.print("1");
            else
                System.out.print("0");
        }
        System.out.println();
    }
}
