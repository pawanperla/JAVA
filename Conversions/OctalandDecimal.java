public class OctalandDecimal {
    public static void main(String[] args) {

        // octal to decimal

        String o1 = "432";
        System.out.println(Integer.parseInt(o1, 8));

        // decimal to octal

        int d1 = 282;
        System.out.println(Integer.toOctalString(d1));
    }
}
