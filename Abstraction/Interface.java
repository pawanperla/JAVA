public class Interface {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.flee();
        Hawk hawk = new Hawk();
        hawk.hunt();
        // hawk.flee(); // not possible
        Fish fish = new Fish();
        fish.hunt();
        fish.flee();
    }
}

class Rabbit implements Prey {
    public void flee() {
        System.out.println("The rabbit is fleeing");
    }
}

class Hawk implements Predator {
    public void hunt() {
        System.out.println("The hawk is hunting");
    }
}

class Fish implements Prey, Predator {
    public void flee() {
        System.out.println("Fish is fleeing");
    }

    public void hunt() {
        System.out.println("This Fish is hunting");
    }
}

interface Prey {
    void flee();
}

interface Predator {
    void hunt();
}