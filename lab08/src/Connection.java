public class Connection {
    private static int cnt = 0;

    public Connection() {
        cnt++;
    }

    public void disconnect() {
        cnt--;
    }

    public static void display() {
        System.out.println("The number of connection is " + cnt);
    }
}
