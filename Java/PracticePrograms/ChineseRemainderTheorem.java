public class ChineseRemainderTheorem {

	public static void main(String[] args) {

		int[] num = { 3, 5, 7 };
		int[] rem = { 2, 4, 5 };
		System.out.println("Smallest number which follow the given conditions is " + ChineseRemainder(num, rem));

	}

	public static int ChineseRemainder(int[] num, int[] rem) {
		// to find M
		int M = 1;

		for (int i = 0; i < num.length; i++) {
			M = M * num[i];
		}

		// to find M1,M2,M3
		int res = 0;
		for (int i = 0; i < num.length; i++) {
			int prefix = M / num[i];
			res = res + rem[i] * prefix * Inverse(prefix, num[i]);
		}

		return res % M;
	}

	public static int Inverse(int a, int m) {
		for (int i = 1; i < m; i++) {
			if ((a % m) * (i % m) % m == 1) {
				return i;
			}
		}

		return 1;
	}
}
