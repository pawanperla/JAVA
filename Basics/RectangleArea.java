
public class RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		R r = new R();
		
		r.area(20,30);
		r.calc();
		r.area(50, 100);
		r.calc();
		
	}

}

class R {
	
	int length;
	int breadth;
	
	public void area(int length , int breadth ) {
		
		this.length = length;
		this.breadth = breadth;
	}
	
	public void calc() {
		
		System.out.println("Area is : " + length*breadth);
	}
	
}
