public class tester {
    public static void main(String[] args) {
        String sample = "abcdefg";
        //               0123456
        System.out.println(sample.substring(0,2));
        System.out.println(sample.substring(1,5));
        System.out.println(sample.substring(4));



//        final int MAX=5;
//        Person[] p = new Person[MAX];
//        Person temp;
//        p[0] = new Person ("Wan Ahmad");
//        p[1] = new Person ("Lim Teng Teng");
//        p[2] = new Person ("Abu Bakar");
//        p[3] = new Person ("Siti Farhane");
//        p[4] = new Person ("Mutu");
//
//        System.out.println("List of participant: ");
//        for(int i=0; i<MAX; i++ )
//            System.out.println(p[i].getName());
//
//        for(int pass=1; pass < p.length; pass++)
//            for(int i=0; i< p.length-1; i++)
//                if (p[i].compareTo(p[i+1])>0) {
//                    temp = p[i];
//                    p[i] = p[i+1];
//                    p[i+1] = temp;
//                }
//
//
//        // p.length -1 instead of p.length
//        //                      5 3 4 1 2
//        // pass = 1, i = 0      3 5 4 1 2
//        // pass = 1, i = 1      3 4 5 1 2
//        // pass = 1, i = 2      3 4 1 5 2
//        // pass = 1, i = 3      3 4 1 2 5
//
//        // pass = 2, i = 0      3 4 1 2 5
//        // pass = 2, i = 1      3 1 4 2 5
//        // pass = 2, i = 2      3 1 2 4 5
//        // pass = 2, i = 3      3 1 2 4 5
//
//        // 1 2 3 4 5 (goal)
//
//        // 5 4 3 2 1 -> 1 2 3 4 5
//        // pass = 1, 4 3 2 1 5
//        // pass = 2, 3 2 1 4 5
//        // pass = 3, 2 1 3 4 5
//        // pass = 4, 1 2 3 4 5
//
//        System.out.println("List of participant in ascending order: ");
//        for(int i=0; i<MAX; i++ )
//            System.out.println(p[i].getName());
    }
}
