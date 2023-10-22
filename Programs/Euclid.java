package FAT;

//Euclid's ALgorithm
public class Euclid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int g = Euclid(125, 25);
		System.out.println(g);

	}

	public static int Euclid(int a, int b) {
		if (a == 0) {
			return b;
		} else {
			return Euclid(b % a, a);
		}
	}

}
