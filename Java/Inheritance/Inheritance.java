public class Inheritance {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.a);
        System.out.println(a.b);
    }
}

class A extends B {
    int a = 100;
}

class B {
    int b = 200;
}
