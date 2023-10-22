public class Final {
    public static void main(String[] args) {
        Fianl f = new Final();
        f.run();
        // You will get Error
        B2 b2 = new B2();
        b2.abc();
    }

    final int a = 500;

    void run() {
        a = 2000;
        System.out.println(a);
    }
}

class A3 {
    final void abc() {
        System.out.println("Running");
    }
}

class B3 extends A3 {
    void abc() {
        System.out.println("Im Running");
    }
}