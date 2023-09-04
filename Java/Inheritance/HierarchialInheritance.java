public class HierarchialInheritance {
    public static void main(String[] args) {
        H_3 h = new H_3();
        h.h_3();
        h.h_1();
        h.h_2();
    }
}

class H_1 {
    void h_1() {
        System.out.println("h1");
    }
}

class H_2 extends H_1 {
    void h_2() {
        System.out.println("h2");
    }
}

class H_3 extends H_1 {
    void h_3() {
        System.out.println("h3");
    }
}