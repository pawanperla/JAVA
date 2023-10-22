public class Aggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address a1 = new Adress("Vij");
		new Employee(9164, a1, "Pawan").display();

	}

}

class Employee {

	int id;
	Address address;
	String Name;

	Employee(int id, Address adress, String Name) {

		this.address = address;
		this.id = id;
		this.Name = Name;
	}

	void display() {

		System.out.println(id + " : " + Name);
		System.out.println(address.city);
	}

}