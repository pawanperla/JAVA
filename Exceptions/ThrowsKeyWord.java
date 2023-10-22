public class ThrowsKeyWord {
    public static void main(String[] args) {
        ThrowsKeyWord k = new ThrowsKeyWord();
        k.p();
    }

    void m() throws ArithmeticException {
        // int a = 200/0;
        throw new ArithmeticException();
    }

    void p() {
        try {
            m();
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Exception Handled");
        } finally {
            System.out.println("Finally Block");
        }
    }
}
