public class BinaryandDecimal {
    public static void main(String[] args) {

        // Binary to Decimal

        String b1 = "0010101101";
        int decimal = Integer.parseInt(b1, 2);
        System.out.println(decimal);

        // Decimal to Binary

        int d2 = 345;
        String s1 = Integer.toBinaryString(d2);
        System.out.println(s1);
    }
}
