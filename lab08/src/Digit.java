public class Digit {
    private int num;

    public Digit(int num) {
        this.num = num;
    }

    public int digitMultiplication() {
        int result = 1;
        int tmp = num;
        while(tmp>0) {
            result *= tmp%10; // times the last digit
            tmp /= 10;

            /*
                1st iteration:
                tmp = 134, result = 1*5 = 5
                2nd iteration:
                tmp = 13,  result = 5*4 = 20
                3rd iteration:
                tmp = 1,   result = 20*3 = 60
                4th iteration:
                tmp = 0,   result = 60*1 = 60
            */
        }
        return result;
    }

    public void output() {
        System.out.println("The digit multiplication of : " + num + " is " + digitMultiplication());
    }
}
