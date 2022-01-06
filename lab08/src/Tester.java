public class Tester {
    public static void main(String[] args) {
//       q1();
//        q2();
//        q3();
//        q4();
//        q5();
//        q6();
        q7();
    }

    static void q1() {
        Number a = new Number();
        Number b = new Number(5);
        Number c = new Number(4, 50);

        a.display();
        a.displayEven();
        a.displayPrime();
        a.displayMax();
        a.displayMin();
        a.displayAverage();
        a.displaySquare();
        System.out.println();

        b.display();
        b.displayEven();
        b.displayPrime();
        b.displayMax();
        b.displayMin();
        b.displayAverage();
        b.displaySquare();
        System.out.println();

        c.display();
        c.displayEven();
        c.displayPrime();
        c.displayMax();
        c.displayMin();
        c.displayAverage();
        c.displaySquare();
        System.out.println();
    }

    static void q2() {
        BankAccount account = new BankAccount("Ali", "020202024321", "A000000", 500.00);
        account.withdraw(1000.00);
        account.deposit(600.00);
        account.withdraw(1000.50);
        account.displayCurrentBalance();
        account.deposit(-100);
        account.displayCurrentBalance();
        account.deposit(200.50);
        account.displayCurrentBalance();
    }

    static void q3() {
        WeightCalculator weightCalculator = new WeightCalculator(20,175);
        weightCalculator.display();
    }

    static void q4() {
        Fraction fraction = new Fraction(17, 31);
        fraction.displayLowestTerm();
    }

    static void q5() {
        Game player1 = new Game("Player1");
        Game player2 = new Game("Player2");
        do {
            player1.roll();
            player1.display();
            if(player1.getScore() >= 100) break;
            player2.roll();
            player2.display();
//            if(player2.getScore() >= 100) break;

            // separate the rounds
            for(int i=0; i<40; i++) System.out.print("-");
            System.out.println();

        } while(player1.getScore()<100 && player2.getScore()<100);

        if(player1.getScore()>=player2.getScore()) {
            System.out.println(player1.getName() + " wins!");
        }else {
            System.out.println(player2.getName() + " wins!");
        }
    }

    static void q6() {
        BurgerStall stall1 = new BurgerStall("000001", 10);
        BurgerStall stall2 = new BurgerStall("000002", 12);
        BurgerStall.getTotalSold();
        stall1.sold(5);
        BurgerStall.getTotalSold();
        stall2.sold(25);
        stall1.display();
        stall2.display();
        BurgerStall.getTotalSold();
        stall1.getTotalSold();
        stall2.getTotalSold();
    }

    static void q7() {
        Money wallet1 = new Money(173.11);
        Money wallet2 = new Money(155.17);
        wallet1.display();
        wallet2.display();
        System.out.println(wallet1.getAmount());
        wallet1.add(wallet2);
        System.out.println(wallet1.getAmount());
        wallet1.subtract(wallet2);
        System.out.println(wallet1.getAmount());
    }
}
