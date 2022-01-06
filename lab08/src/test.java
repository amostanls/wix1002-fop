public class test {
    public static void main(String[] args) {
        Connection connection1 = new Connection();
        Connection connection2 = new Connection();
        Connection connection3 = new Connection();
        connection1.display();
        connection3.disconnect();
        connection2.display();
        connection1.display();
        connection3.display();

        Digit digit = new Digit(4567);
    }
}

