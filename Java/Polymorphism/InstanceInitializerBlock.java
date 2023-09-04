public class InstanceInitializerBlock {
    public static void main(String[] args) {
        InstanceInitializerBlock ic = new InstanceInitializerBlock();
        B2 b2 = new B2();
    }

    InstanceInitializerBlock() {
        System.out.println("HI");
    }

    {
        System.out.println("Instance block");
    }

    {
        System.out.println("Instance block 2");
    }
}

class A2 {
    A2() {
        System.out.println("A class");
    }
}

class B2 extends A2 {
    B2() {
        super();
        System.out.println("b class");
    }

    {
        System.out.println("Instance");
    }
}
