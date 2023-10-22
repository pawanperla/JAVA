
public class SwitchCase {

	public static void main(String[] args) {
	
		int day = 3;
		
		String str = "";
		
		switch(day) {
		
		case 1 : str = "Sun";
			break;
		case 2 : str = "Mon";
			break;
		case 3 : str = "Tue";
			System.out.println(str);
			break;
		case 4 : str = "Wed";
			break;
		case 5 : str = "Thu";
			break;
		case 6 : str = "Fri";
			break;
		case 7 : str = "Sat";
			break;
		
		default : System.out.println("Invalid day");
		
		}
		
		//System.out.println(str);
		
		int n = 20;
		
		switch(n) {
			
		case 10 : System.out.println("num = 10");
		case 20 : System.out.println("num = 20");
		case 30 : System.out.println("num = 30");
		
		default : System.out.println("None");
		}
		
		String b = "C";
		int year = 4;
		
		switch(year) {
		
		case 1 : System.out.println("E,M,P,C");
			break;
		case 2 :
			switch(b) {
			
				case "A" : System.out.println("Yellow");
					break;
				case "B" : System.out.println("Pink");
				    break;
				case "C" : System.out.println("OS,DSA,CN");
					break;
				default : System.out.println("None");
			
			}
		case 3 :
			switch(b) {
			
				case "A" : System.out.println("Yellow");
					break;
				case "B" : System.out.println("Pink");
					break;
				case "C" : System.out.println("COA,DBMS,TOC");
					break;
				default : System.out.println("None");
			
			}
		case 4 :
			switch(b) {
			
			case "A" : System.out.println("Yellow");
				break;
			case "B" : System.out.println("Pink");
				break;
			case "C" : System.out.println("DAA,ML,WEB");
				break;
			default : System.out.println("None");
		
			}
		
		}	
	}

}
