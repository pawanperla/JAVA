public class NestedTry {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("going to create exception");
                int a = 100 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            try {
                String s = null;
                int a = s.length();
            } catch (NullPointerException e) {
                System.out.println(e);
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Rest");

        try

        {
            try {
                try {
                    int a = 100 / 0;
                } catch (NullPointerException e) {
                    System.out.println(e);
                    System.out.println("Executed in inner");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                System.out.println("Exectued in just outer");
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Executed in Outer");
        }
    }
}
