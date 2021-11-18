public class test {
    public static void main(String[] args) {
        String s1 = "HELLO"; // hello
        String s2 = "hello";
        //https://www.w3schools.com/java/ref_string_comparetoignorecase.asp
        if(s1.compareToIgnoreCase(s2)==0) {
            System.out.println(s1+"\n"+s2);
        }else {
            System.out.println(s2+"\n"+s1);
        }
    }
}
