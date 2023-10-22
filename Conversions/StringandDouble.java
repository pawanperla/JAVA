public class StringandDouble {
    public static void main(String[] args) {

        // String to Double
        String s1 = "34566.43";
        double d1 = Double.parseDouble(s1);
        System.out.println(d1);

        // Double to String

        double d2 = 12.3;
        String s2 = String.valueOf(d2);
        System.out.println(s2);
        System.out.println(Double.toString(d2));
    }
}
