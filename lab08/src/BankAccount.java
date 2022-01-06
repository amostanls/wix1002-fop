public class BankAccount {
    private String name,IC,passport;
    private double amount;

    public BankAccount(String name, String IC, String passport, double deposit) {
        this.name = name;
        this.IC = IC;
        this.passport = passport;
        this.amount = deposit;
    }

    public void deposit(double amount) {
        if(amount<=0) {
            System.out.println("deposit a positive amount");
            return;
        }
        this.amount += amount;
        System.out.println("Deposit "+amount+" successfully");
    }

    public void withdraw(double amount) {
        if(amount<=0) {
            System.out.println("withdraw a positive amount");
            return;
        }
        if(this.amount>=amount) {
            this.amount -= amount;
            System.out.println("Withdraw "+amount+" successfully");
        }else {
            System.out.println("Withdraw "+amount+" unsuccessfully");
        }
    }

    public void displayCurrentBalance() {
        System.out.printf("%s %.2f\n","Balance: RM",amount);
    }
}
