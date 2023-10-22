public class MethodOverloading {
    public static void main(String[] args) {
        add(5, 6);
        add(3, 4, 5);
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}