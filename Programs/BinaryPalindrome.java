package FAT;

import java.util.Scanner;

//Binary Palindrome
public class BinaryPalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int res = sc.nextInt();
		if (BinaryPalindrome(res)) {
			System.out.println("YES");
		} else {
			System.out.println("No");
		}

	}

	public static Boolean BinaryPalindrome(int res) {
		int left = 0;
		int right = Integer.toString(res).length() - 1;

		while (left <= right) {
			if ((res >> (left - 1) & 1) != (res >> (right - 1) & 1)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
