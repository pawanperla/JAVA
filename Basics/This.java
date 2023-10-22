public class This {

	public static void main(String[] args) {
			
	//	Aether ai = new Aether(1,2,3);
	//	ai.display();
		
		new Aether(1,2,3).display();
		new Better().n();
		new Better().m();
		
	}

}


class Aether {
	
	int a;
	int b;
	int c;
	
	Aether(int a , int b , int c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	void display() {
		System.out.println(a+b+c);
	}
	
}

class Better {
	
	void m() {
		System.out.println("This is M");
	}
	
	void n() {
		
		System.out.println("This is N");
		this.m();
	}
}












