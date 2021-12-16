public class test {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++) {
            System.out.println(i+"th fibonacci number "+fib(i));
        }
        int a = 5; //101
        int b = 7; //111
        int c = a^b; // xor = 010
        System.out.println(c);
        int[] arr1 = {1,4,2};
        int[] arr2 = {3,7,9};
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                int res =arr1[i]^arr2[j];
                System.out.println(i+" "+j+" "+res);
            }
        }
        //fib: [1,1,2,3,5,8,13,...]
    }

    public static int fib(int n) {
        if(n==1)return 1;
        else if(n==2)return 1;
        return fib(n-2)+fib(n-1);
    }
}
