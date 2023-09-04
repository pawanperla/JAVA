// private = accessible only within the class

import mypack.*;

public class AccessModifiers extends newclasspackage {
    public static void main(String[] args) {
        Aclass a = new Aclass(); // for constructor also you will get error
        a.method1();
        // System.out.println(a.data); // You will get ct error
        // a.method2(); // You will get ct error

        newclasspackage ncp = new newclasspackage();
        ncp.msg();
        // ncp.display();
    }
}

class Aclass {
    private int data = 100;

    void method1() {
        System.out.println(data);
    }

    private void method2() {
        System.out.println("Private method");
    }

    // private Aclass(int a, int b) {
    // System.out.println(a + b);
    // }
}