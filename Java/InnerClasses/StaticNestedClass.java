public class StaticNestedClass {
    public static void main(String[] args) {
        StaticNestedClass.Inner inner = new StaticNestedClass.Inner();
        inner.msg();
        StaticNestedClass.Inner.display();
    }

    static int data = 100;

    static class Inner {
        void msg() {
            System.out.println("data is : " + data);
        }

        static void display() {
            System.out.println("Hi Im Pawan");
        }
    }
}
