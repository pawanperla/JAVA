public class MutlipleCatchBlock {
    public static void main(String[] args) {
        try {
            // int a = 100 / 0;
            // int[] arr = { 1, 2, 3 };
            // int b = arr[10];
            // int a = 100 / 0;
            String s = null;
            int l = s.length();
            // System.out.println(b);
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println(e1);
        } catch (NullPointerException e2) {
            System.out.println(e2);
        } catch (ArithmeticException e3) {
            System.out.println(e3);
        }
        // catch (Exception e) {
        // System.out.println(e);
        // }
    }
}
