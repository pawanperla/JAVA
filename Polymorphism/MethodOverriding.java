public class MethodOverriding {
    public static void main(String[] args) {
        Q q = new Q();
        q.run();
    }
}

class P {
    void run() {
        System.out.println("Run In P");
    }
}

class Q extends P {
    void run() {
        System.out.println("Run in Q");
    }
}
