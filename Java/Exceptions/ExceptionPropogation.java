import java.io.IOException;

public class ExceptionPropogation {
    public static void main(String[] args) {
        try {
            p();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        ExceptionPropogation c = new ExceptionPropogation();

        try {
            c.C();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("Exception handled");
        }

    }

    static void m() {
        int a = 100 / 0;
    }

    static void n() {
        m();
    }

    static void p() {
        n();
    }

    void A() {
        throw new ArrayIndexOutOfBoundsException();
    }

    void B() {
        A();
    }

    void C() {
        B();
    }
}
