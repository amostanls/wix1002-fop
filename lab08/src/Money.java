public class Money {
    private double amount;
    static final int[] notes = {10000,5000,1000,500,100};
    static final int[] cents = {50, 20, 10, 5};
    private int[] amount_notes = new int[notes.length];
    private int[] amount_cents = new int[cents.length];

    public Money(double amount) {
        this.amount = roundoff(amount);
    }

    private double roundoff(double amount) {
        int tmp = (int)(amount * 100);
        double res = amount;
        if(tmp%5==0)return res;
        // remaining ones (last digit) = [1,2,3,4,6,7,8,9]
        if(tmp%10<=2) {
            // tmp%10 = [1,2]
            tmp -= tmp%10;
        }else if(tmp%10<=7) {
            // tmp%10 = [3,7]
            tmp -= tmp%10;
            tmp += 5;
        }else {
            // tmp%10 = [8,9]
            tmp -= tmp%10;
            tmp += 10;
        }
        res = (double) tmp/100;
        return res;
    }

    private void calc() {
        int tmp = (int)(this.amount*100);
        for(int i=0; i<notes.length; i++) {
            int cnt = tmp / notes[i];
            tmp -= notes[i]*cnt;
            amount_notes[i] = cnt;
        }
        for(int i=0; i<cents.length; i++) {
            int cnt = tmp / cents[i];
            tmp -= cents[i]*cnt;
            amount_cents[i] = cnt;
        }
    }

    public void display() {
        calc();
        System.out.printf("%.2f\n",this.amount);
        for(int i=0; i<amount_notes.length; i++) {
            System.out.printf("RM %d: %d\n", notes[i]/100, amount_notes[i]);
        }
        for(int i=0; i<amount_cents.length; i++) {
            System.out.printf("RM %.2f: %d\n", (double)cents[i]/100, amount_cents[i]);
        }
        for(int i=0; i<40; i++)
            System.out.print("-");
        System.out.println();
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void add(Object object) {
        Money tmp = (Money) object;

        Money res = new Money(amount+tmp.getAmount());
        System.out.println(res.getAmount());
    }

    public void subtract(Object object) {
        Money tmp = (Money) object;

        Money res = new Money(amount-tmp.getAmount());
        System.out.println(res.getAmount());
    }
}
