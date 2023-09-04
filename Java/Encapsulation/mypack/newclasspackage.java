package mypack;

// if you keep public access modifier only then it will be accesed in other class

public class newclasspackage {
    public void msg() {
        System.out.println("Hi you are in another package");
    }

    protected void display() {
        System.out.println("In Protected void method");
    }
}
