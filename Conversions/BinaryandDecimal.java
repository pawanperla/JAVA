import java.math.BigInteger;

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

        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
