public class RuntimePolymorphism {
    public static void main(String[] args) {
        A4 a4 = new B4();
        // a4.m1();
        System.out.println(a4.roi());
        System.out.println(a4.a4);
        A4 n = new C4();
        System.out.println(n.roi());
    }
}

class A4 {
    int a4 = 100;

    void m1() {
        System.out.println("Class A");
    }

    int roi() {
        return 0;
    }
}

class B4 extends A4 {
    int a4 = 500;

    void m1() {
        System.out.println("Class B");
    }

    int roi() {
        return 5;
    }
}

class C4 extends A4 {
    int roi() {
        return 3;
    }
}