import java.util.Scanner;

public class BinarytoInteger {

	// Binary to integer

	public static int toint(String s) {
		int r = 0;
		int l = s.length();

		for (int i = l - 1; i >= 0; i--) {
			if (s.charAt(i) == '1') {
				r = (int) (r + Math.pow(2, l - i - 1));

			}
		}
		return r;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(toint(s));

	}

}
