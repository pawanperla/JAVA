public class trycatchfinally {
    public static void main(String[] args) {

        int data = 25;
        int zero = 0;
        try {
            int c = data / zero;
        } catch (ArithmeticException e) {
            System.out.println("Resolving Exception " + e);
            System.out.println(data / (zero + 2));
        }
        try {
            int c = 100 / 0;
        } catch (ArithmeticException e) {
            // int d = 100 / 0;
            // System.out.println();
        }
        System.out.println("Rest");
        try {
            int f = 10 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("HI found an exception");
            System.out.println(e);
        } finally {
            System.out.println("Finally is always Executed");
        }
        int[] arr = { 1, 2, 3, 4, 5 };
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally is always Executed");
        }
    }
}
