package FAT;

//swapinbg two nibbles in a byte
public class SwappingNibbles {

	public static void main(String[] args) {

	}

	public static int Swapping(int n) {
		int res = 0;
		for (int i = 4; i > 0; i--) {
			res = res + n >> (i - 1) & 1;
			res = res << 1;
		}
		for (int i = 8; i > 5; i--) {
			res = res + n >> (i - 1) & 1;
			res = res << 1;
		}
		return res;
	}

}
