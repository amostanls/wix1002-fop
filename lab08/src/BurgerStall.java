public class BurgerStall {
    public static int totalSold = 0;
    private String id;
    private int burgerSold;

    public BurgerStall(String id) {
        this.id = id;
        this.burgerSold = 0;
    }

    public BurgerStall(String id, int amount) {
        this.id = id;
        this.burgerSold = amount;
        totalSold += amount;
    }

    public void sold(int amount) {
        burgerSold += amount;
        totalSold += amount;
    }

    public static void getTotalSold() {
        System.out.println("Total burger sold: "+totalSold);
    }

    public void display() {
        System.out.println("Burger Stall "+id+" has sold "+ burgerSold +" burgers");
    }
}
