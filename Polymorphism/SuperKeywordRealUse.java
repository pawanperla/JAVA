import javax.print.attribute.standard.MediaSize.NA;

public class SuperKeywordRealUse {
    public static void main(String[] args) {
        B1 b1 = new B1("A", 18, 12222);
        b1.display();
    }
}

class A1 {
    String Name;
    int age;

    A1(String Name, int age) {
        this.Name = Name;
        this.age = age;
    }
}

class B1 extends A1 {
    int salary;

    B1(String Name, int age, int salary) {
        super(Name, age);
        this.salary = salary;
    }

    void display() {
        System.out.println(Name + " " + age + " " + salary);
    }

}
