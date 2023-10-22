public class AbstractionExample_2 {
    public static void main(String[] args) {
        Bike_1 iac_2 = new InnerAbstractionExample_2();
        iac_2.run();
        iac_2.m1();
    }
}

abstract class Bike_1 {
    Bike_1() {
        System.out.println("this is a bike");
    }

    abstract void m1();

    void run() {
        System.out.println("In abstract class");
    }
}

class InnerAbstractionExample_2 extends Bike_1 {
    void m1() {
        System.out.println("Running");
    }
}