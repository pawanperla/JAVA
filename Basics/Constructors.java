
public class Constructors {

	public static void main(String[] args) {

		laptop l = new laptop();

		Vehicle v = new Vehicle(4, "SUV");
		v.display();
		Vehicle v1 = new Vehicle(4, "ABC", 2020);
		v1.display();

	}

}

// default constructor --> no parameters

class laptop {

	laptop() {

		System.out.println("My laptop is great");
	}
}

// parametrized constructors --> with parameters

class Vehicle {

	int tyres;
	String Model;
	int year;

	Vehicle(int tyres, String Model) {

		this.tyres = tyres;
		this.Model = Model;

	}

	Vehicle(int tyres, String Model, int year) {

		this.year = year;
		this.tyres = tyres;
		this.Model = Model;

	}

	void display() {

		System.out.println(tyres + " " + Model + " " + year);
	}

}
