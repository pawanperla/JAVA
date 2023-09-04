public class Comparision {
    public static void main(String[] args) {
        String s1 = "Pawan";
        String s2 = "Perla";

        if (s1.equals(s2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        String s3 = "PAWAN";
        if (s1.equals(s3)) {
            System.out.println("Yes");
        } else if (s1.equalsIgnoreCase(s3)) {
            System.out.println("Letters are same but different cases");
        } else {
            System.out.println("NO");
        }

        String s4 = "SACHINTENDULKAR";

        int a = s1.compareTo(s4); // returns -ve if s1 letters are less than s4
        System.out.println(a);
        int b = s4.compareTo(s1); // returns +ve if s4 letters are more than s1
        System.out.println(b);
    }
}
