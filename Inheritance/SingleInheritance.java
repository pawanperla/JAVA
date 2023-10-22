public class SingleInheritance {

    public static void main(String[] args) {
        InnerSingleInheritance ash = new InnerSingleInheritance_1();
        System.out.println(ash.ish);
    }
}

class InnerSingleInheritance {
    int ish = 100;

    void ish() {
        System.out.println("Hi");
    }
}

class InnerSingleInheritance_1 extends InnerSingleInheritance {
    int ish_1 = 200;

    void ish_1() {
        System.out.println("Hello");
    }
}