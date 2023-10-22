public class OverridingExceptions {
    public static void main(String[] args) {
        InnerOverridingExceptions_1 ioe = new InnerOverridingExceptions_1();
        try {
            ioe.m();
            System.out.println("In try");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

}

class InnerOverridingExceptions {
    void m() {
        System.out.println("HI");
    }
}

class InnerOverridingExceptions_1 extends InnerOverridingExceptions {
    void m() throws ArithmeticException {
        // throw new ArithmeticException();
        System.out.println("Hi");
    }
}