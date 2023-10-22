public class valueOfMethod {
    public static void main(String[] args) {
        boolean bol = true;
        boolean bol2 = false;
        String s1 = String.valueOf(bol);
        String s2 = String.valueOf(bol2);
        System.out.println(s1);
        System.out.println(s2);
        char ch1 = 'A';
        char ch2 = 'B';
        String s3 = String.valueOf(ch1);
        String s4 = String.valueOf(ch2);
        System.out.println(s3);
        System.out.println(s4);
        float f = 10.05f;
        double d = 10.02;
        String s5 = String.valueOf(f);
        String s6 = String.valueOf(d);
        System.out.println(s5);
        System.out.println(s6);
        int i = 13;
        String s7 = String.valueOf(i);
        System.out.println(s7);
    }
}
