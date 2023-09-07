public class StringandLong {
    public static void main(String[] args) {

        // String to Long

        String s = "123445567789";
        long l1 = Long.parseLong(s);
        System.out.println(l1);

        // Long to String

        long l2 = 19993939399L;
        System.out.println(Long.toString(l2));
        System.out.println(String.valueOf(l2));

    }
}
