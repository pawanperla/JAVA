
public class AnonymousObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new multiply().mul(25);
		new factorial().fac(5);
	}

}

class multiply {
	
	public void mul(int a) {
		System.out.println(a*25);
	}
}

class factorial {
	
	void fac(int a) {
		
		int fact = 1;
		for(int i = 1 ; i <= a ; i ++) {
			fact = fact*i;
		}

		System.out.println(fact);
	}
}