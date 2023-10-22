// Inner class without a name comes under Anonymous inner class

public class AnonymousInnerClass {
    public static void main(String[] args) {

        Person p = new Person() {
            public void eat() {
                System.out.println("P is eating");
            }
        };
        p.eat();

        Person1 p1 = new Person1();
        p1.eat();

        Bikes b = new Bikes() {
            public void vehicle() {
                System.out.println("Vehicle method is overriden");
            }
        };
        b.vehicle();
    }

}

class Person {

    public void eat() {
        System.out.println("HI");
    }

}

class Person1 extends Person {
    // created to see whether this class object has read the overriden method
}

interface Bikes {
    public void vehicle();
}