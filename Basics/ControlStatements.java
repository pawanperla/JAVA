public class ControlStatements {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		if(a+b>40) {
			System.out.println("Hello");
		}
		
		else if(a + b == 30) {
			
			System.out.println("Java");
		}
		
		else {
			System.out.println("Pawan");
		}
	
		String s = "Vij";
		
		if(s == "Hyd") {
			System.out.println("Hyd");
		}
		
		else if (s == "Gun") {
			
			System.out.println("Gun");
		}
		
		else {
			System.out.println(s);
		}
		
		int num = 500;
		
		if(num>100) {
			
			if(num>500) {
				System.out.println(">500");
			}
			
			else if(num > 400) {
				System.out.println(">400");
			}
			
			else {
				System.out.println("<250");
			}
			
		}
		
		else if(num <100) {
			
			System.out.println("<100");
		}
		
		else {
		System.out.println("hi");
		}
		
	}
}
