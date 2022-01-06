public class Payment {
    private double amount;
    private String chequeNumber, cardHolderName, expirationDate;
    private int validationCode;

    public Payment() {
    }

    public void payBy(double a) {
        amount = a;
        System.out.println("Total pay by cash is " + amount);
    }

    public void payBy(double a, String c) {
        amount = a;
        chequeNumber = c;
        System.out.println("Total pay by cheque is " + amount);
        System.out.println("Cheque number : " + chequeNumber);
    }


    public void payBy(double a, String c, String ed, int vc) {
        amount = a;
        cardHolderName = c;
        expirationDate = ed;
        validationCode = vc;

        System.out.println("Total pay by credit card is " + amount);
        System.out.println("Card Holder Name : " + cardHolderName);
        System.out.println("Expiration Date : " + expirationDate);
        System.out.println("Validation Code : " + validationCode);
    }
}
