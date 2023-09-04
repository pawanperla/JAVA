public class SuperKeyword {
    public static void main(String[] args) {
        SuperKeyword_2 ab = new SuperKeyword_2();
        ab.bmethod();
    }
}

class SuperKeyword_1 {
    int a = 100;

    void method1() {
        System.out.println("HI IM IN CLASS 1");
    }

    SuperKeyword_1() {
        System.out.println("Contsructor 1");
    }
}

class SuperKeyword_2 extends SuperKeyword_1 {
    int a = 200;

    void method1() {
        System.out.println("HI IM IN CLASS 2");
    }

    SuperKeyword_2() {
        // super();
        System.out.println("Constructor 2");
    }

    void bmethod() {
        System.out.println(a);
        System.out.println(super.a);
        super.method1();
        method1();
    }
}
