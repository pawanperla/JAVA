
public class RealUsageOfThis {

	public static void main(String[] args) {
		
		new Student(1,2,"s").display();;
		
		new Student(1,2,"s",3).display();
	}

}

class Student {
	
	int a ;
	int b ;
	int c ;
	String s;
	
	Student(int a , int b, String s) {
		
		this.a = a;
		this.b = b;
		this.s = s;
	}
	
	void display() {
		System.out.println(a + " " + b + " " + s + " " + c);
	}
	
	Student(int a , int b, String s , int c) {
		
		this(a,b,s); // this must be first statement else compile time error
		this.c = c;
	}
	
}
