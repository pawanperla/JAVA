public class Stobogrammatic {

	// Stobogrammatic Number

	public static boolean stobo(String s) {
		StringBuilder n = new StringBuilder();
		int l = s.length();
		for (int i = 0; i < l; i++) {
			char x = s.charAt(i);
			if (x == '1') {
				n.insert(0, '1');
			} else if (x == '0') {
				n.insert(0, '0');
			} else if (x == '6') {
				n.insert(0, '9');
			} else if (x == '9') {
				n.insert(0, '6');
			} else if (x == '8') {
				n.insert(0, '8');
			}

		}

		return n.toString().equals(s);
	}

	public static void main(String[] args) {
		if (stobo("69")) {
			System.out.println("It is a Strobogrammatic number");
		} else {
			System.out.println("It is not a Strobogrammatic number");
		}
	}

}
