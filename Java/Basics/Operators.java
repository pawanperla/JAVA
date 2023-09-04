
public class Operators {

	public static void main(String[] args) {
		
		System.out.println("Unary Operations");
		System.out.println();
		
		int a = 10;
		System.out.println(a);
		System.out.println(a++); // just increments the value
		System.out.println(++a); // increments and prints the value too
		int b = 15;
		System.out.println(~b);
		System.out.println();
		
		System.out.println("Arithmetic Operations");
		System.out.println();
		
		int c = 20;
		int d = 30;
		
		System.out.println(c+d);
		System.out.println(c-d);
		System.out.println(c*d);
		System.out.println(c/d);
		System.out.println(c%d);
		
		
		System.out.println("Logical Operations");
		System.out.println();
		
		System.out.println(c>d || c/d == 2);
		System.out.println(c>d || c/d == 0); // OR operation
		System.out.println(c>d && c/d == 0); // AND operation
		System.out.println(c<d && c/d == 0); // AND operation
		
		int e = d+5;
		int f = c-4;
		
		System.out.println();
		System.out.println(e);
		System.out.println(f);
		
	}

}
