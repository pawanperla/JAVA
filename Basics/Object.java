
public class Object {

	public static void main(String[] args) {
		
		Object object = new Object();
		
		System.out.println(object.id);
		System.out.println(object.name);

		A c = new A();
		
		c.insert(20,30);
		c.display();
		c.insert(40,50);
		c.display();
	
	}
	
	int id = 9164;
	String name = "Pawan";
}

class A {
	
	int a;
	int b;
	
	public void insert(int a , int b) {
		this.a = a;
		this.b = b;
	}
	
	public void display() {
		System.out.println(a + " " + b);
	}
}