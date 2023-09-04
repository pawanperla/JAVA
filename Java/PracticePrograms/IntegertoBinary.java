import java.util.Scanner;

public class IntegertoBinary {

	// Integer to binary
	public static String tobin(int x) {
		StringBuilder sb = new StringBuilder();

		while (x > 0) {
			sb.insert(0, x % 2);
			x = x / 2;
		}
		return sb.toString();

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(tobin(x));
	}

}
