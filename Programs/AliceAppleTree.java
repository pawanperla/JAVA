package FAT;

//ALice Apple Tree
public class AliceAppleTree {

	public static void main(String[] args) {

		int n = 15;
		System.out.println(Alice(n));

	}

	public static int Alice(int n) {
		int res = 0;
		int count = 0;
		while (res <= n) {
			count++;
			res = res + 12 * count * count;
		}

		return 8 * count;
	}
}
