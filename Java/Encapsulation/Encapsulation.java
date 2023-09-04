public class Encapsulation {
    public static void main(String[] args) {
        Car c = new Car("Benz", "SUV", 2022);
        System.out.println(c.getmake());
        System.out.println(c.getmodel());
        System.out.println(c.getyear());
        System.out.println("After changing input values by using set methods :");
        c.setmake("Cheverolet");
        c.setmodel("Design");
        c.setyear(2004);
        System.out.println(c.getmake());
        System.out.println(c.getmodel());
        System.out.println(c.getyear());
    }
}

class Car {
    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year) {
        // this.make = make;
        this.setmake(make);
        // this.model = model;
        this.setmodel(model);
        // this.year = year;
        this.setyear(year);
    }

    String getmake() {
        return make;
    }

    String getmodel() {
        return model;
    }

    int getyear() {
        return year;
    }

    void setmake(String make) {
        this.make = make;
    }

    void setmodel(String model) {
        this.model = model;
    }

    void setyear(int year) {
        this.year = year;
    }

}