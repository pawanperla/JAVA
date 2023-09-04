
public class ContinueStatement {
	
	public static void main(String[] args) {
		
		// continue statement in for loop
		
		for(int i = 1 ; i < 10 ; i++) {
			
			if(i == 5) {
				continue;
			}
			
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// continue statement in inner for loop
		
		for(int i = 0 ; i <= 3; i++) {
			
			for (int j = 0 ; j <= 3 ; j++) {
				
				if(i == 2 && j == 2) {
					
					continue;
				}
				
				System.out.println(i+" "+j);
			}
		}
		
		// continue statement in while loop
		
		int i = 1;
		
		while(i<10) {
			
			if(i == 6) {
				i++;
				continue;
			}
			
			System.out.println(i);
			i++;
		}
		
	}
	
}
