public class ThrowKeyWord {
    public static void main(String[] args) {
        validate(13);

        try {
            NewMethod();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    static void validate(int age) {
        try {
            if (age > 18) {
                throw new ArithmeticException("Not Eligible");
            } else {
                System.out.println("Eligible");
            }
        } finally {
            System.out.println("No catch block in finally");
        }
    }

    static void NewMethod() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException();
    }
}
