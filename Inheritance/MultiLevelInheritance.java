public class MultiLevelInheritance {
    public static void main(String[] args) {

        new MultiLevelInheritance_3().mli_1();

    }
}

class MultiLevelInheritance_1 {
    int mli_1 = 100;

    void mli_1() {
        System.out.println("Hello");
    }
}

class MultiLevelInheritance_2 extends MultiLevelInheritance_1 {
    int mli_2 = 200;

    void mli_2() {
        System.out.println("Hi");
    }
}

class MultiLevelInheritance_3 extends MultiLevelInheritance_2 {
    int mli_3 = 300;

    void mli_3() {
        System.out.println("How are you");
    }
}