public class AbstractionExample_1 {
    public static void main(String[] args) {
        Shape sh = new Rectangle();
        sh.draw();
    }
}

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
        System.out.println();
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing Square");
    }
}