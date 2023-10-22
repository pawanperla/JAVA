public class AbstractClass {
    public static void main(String[] args) {
        InnerAbstractClass iac = new InnerAbstractClass();
        iac.run();
    }

}

abstract class Bike {
    abstract void run() {
        System.out.println("In abstarct method");
    }
}

class InnerAbstractClass extends Bike {
    void run() {
        System.out.println("Running");
    }
}