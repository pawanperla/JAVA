
public class Loops {
	
	public static void main(String[] args) {
		
		int c = 0;
		
		for(int i = 0;i < 50 ;i++) {
			c = c+i;
		}
		
		System.out.println(c);
		
		// for each loop
		
		int[] array = {1,2,3,4,5};
		
		for (int i : array) {
			System.out.print(i + " ");
		}
		
		String[] s = {"A","B","C","D","E"};
		
		for (String str : s) {
			
			System.out.print(str + " ");
		}
		
		int j = 0 ;
		System.out.println();
		
		while(j <5) {			
			if(j %2 == 0) {

				System.out.print(j + " ");
			}
			
			j = j+1;
		}
		
		System.out.println();
		int k = 0;
		
		do {
			System.out.print(k);
			k = k+1;
		}
		while(k<10) ;
		
		System.out.println();

		for (int i = 0 ; i < k ; i ++) {
			
			System.out.print(i + " ");
			
			if(i==6) {
				break;
			}
		}
		
		System.out.println();
	
		for (int i = 0 ; i <= k ; i ++) {
			
			if(i==4) {
				continue;
			}
			
			System.out.print(i + " ");
		}

	}
}
