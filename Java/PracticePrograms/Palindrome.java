import java.util.Scanner;

// Palindrome
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if (Palindrome(s)) {
			System.out.println("yes");
		} else {
			System.out.println("NO");
		}
	}

	public static Boolean Palindrome(String s) {
		String res = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			res = res + s.charAt(i);
		}

		return res.equals(s);
	}

}
