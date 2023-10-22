public class CovariantReturnType {
    public static void main(String[] args) {
        B b = new B();
        b.m1();
    }
}

class A {

    A m1() {
        System.out.println("Hi Im In A");
        return new A();
    }
}

class B extends A {
    B m1() {
        System.out.println("Hi Im In B");
        return new B();
    }
}