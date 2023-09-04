public class Exception {
    public static void main(String[] args) {

        try {
            int d = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception is : " + e);
        }

        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Exception is encountered");
        }
    }
}
