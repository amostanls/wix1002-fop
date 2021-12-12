public class l6q4 {
    public static void main(String[] args) {
        System.out.println(euclid(24,8));
        System.out.println(euclid(8,24));
        System.out.println(euclid(200, 625));
        System.out.println(euclid(625, 200));
    }

    public static int euclid(int a, int b) {
        if(b==0)return a;
        return euclid(b, a%b);
    }
}
