public class HexaDecimalandDecimal {
    public static void main(String[] args) {

        // Hexadecimal to decimal

        String h1 = "79";
        int d1 = Integer.parseInt(h1, 16);
        System.out.println(d1);

        // decimal to HexaDecimal

        int d2 = 121;
        System.out.println(Integer.toHexString(d2));
    }
}
