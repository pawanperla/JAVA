// class created in a method

public class LocalInnerClass {
    static int data = 50; // instance variable

    public static void main(String[] args) {
        // LocalInnerClass lic = new LocalInnerClass();
        // lic.method1();
        method1();
    }

    static void method1() {
        class L {
            int a = 100;

            public void msg() {
                System.out.println("HI Im In InnerClass of L");
                System.out.println(data);
                System.out.println(a);
            }
        }
        L l = new L();
        l.msg();
    }
}
