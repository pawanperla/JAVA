package FAT;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Pratcice {
//    //Binary to Integer
//    public static int toInteger(String s) {
//        int res = 0;
//        int n = s.length();
//        for (int i = n - 1; i >= 0; i--) {
//            if (s.charAt(i) == '1') {
//                res += Math.pow(2, n - i - 1);
//            }
//        }
//
//        return res;
//    }

    //Integer to Binary
//    public static String toBinary(int x) {
//        StringBuilder res = new StringBuilder();
//        while (x > 0) {
//            res.insert(0, x % 2);
//            x /= 2;
//        }
//
//        return res.toString();
//    }

    //Strobogrammatic Number
//    public static boolean isStrobo(String num) {
//        StringBuilder res = new StringBuilder();
//        for (int i = 0; i < num.length(); i++) {
//            char x = num.charAt(i);
//            if (x == '1') {
//                res.insert(0, '1');
//            } else if (x == '0') {
//                res.insert(0, '0');
//            } else if (x == '6') {
//                res.insert(0, '9');
//            } else if (x == '9') {
//                res.insert(0, '6');
//            } else if (x == '8') {
//                res.insert(0, '8');
//            }
//        }
//        return res.toString().equals(num);
//    }

    //Euler Phi Theorem
    public static int Euler(int n) {
        double res = n;
        for (int i = 2; i * i <= n; ++i) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                }
                res *= (1.0 - (1.0 / (double) i));
            }
        }

        if (n > 1) {
            res -= res / n;
        }
        return (int) res;
    }

    //Chinese Remainder Theorem
//    public static int ChineseRemainder(int[] num, int[] rem) {
//        int M = 1, res = 0;
//        for (int i = 0; i < num.length; i++) {
//            M *= num[i];
//        }
//
//        for (int i = 0; i < num.length; i++) {
//            int prefix = M / num[i];
//            res += rem[i] * prefix * Inverse(prefix, num[i]);
//        }
//
//        return res % M;
//    }
//
//    public static int Inverse(int a, int m) {
//        for (int i = 1; i < m; i++) {
//            if ((a % m) * (i % m) % m == 1) {
//                return i;
//            }
//        }
//        return 1;
//    }

    //Product Of Array Except Self
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length, prod = 1;
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            prod *= nums[i];
            p[i] = prod;
        }

        prod = 1;
        for (int i = n - 1; i > 0; i--) {
            p[i] = p[i - 1] * prod;
            prod *= nums[i];
        }
        p[0] = prod;
        return p;
    }


    public static ArrayList<Integer> Fact(int n) {
        int res = 1, count = 1;
        ArrayList<Integer> res1 = new ArrayList<>();
        while (res <= n) {
            res1.add(res);
            res *= ++count;
        }
        return res1;
    }
//
//    public static boolean isPalindrome(String s) {
//        String res = "";
//        for (int i = 0; i < s.length(); i++) {
//            res = s.charAt(i) + res;
//        }
//        return res.equals(s);
//    }


//    public static String longestPalindrome(String s) {
//        String ans = "";
//        int max = 0;
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i; j < s.length(); j++) {
//                String res = s.substring(i, j + 1);
//                if (isPalindrome(res)) {
//                    if (j - i + 1 > max) {
//                        max = j - i + 1;
//                        ans = res;
//                    }
//                }
//            }
//        }
//        return ans;
//    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }

    public static int gcd1(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd1(b, a % b);
    }

    //Binary Palindrome
//    public static boolean IsBinaryPalindrome(int res) {
//        int left = 0, right = Integer.toString(res).length() - 1;
//        while (left <= right) {
//            if ((res >> (left - 1) & 1) != (res >> (right - 1) & 1)) {
//                return false;
//            }
//
//            left++;
//            right--;
//        }
//        return true;
//    }

    //Multiplication of two numbers without multiplication operator
    public static int Multiply(int a, int b) {
        int ans = 0;
        while (b > 0) {
            ans += ((b & 1) == 1) ? a : 0;
            b >>= 1;
            a <<= 1;
        }
        return ans;
    }


    //Karastuba algorithm
    public static long Kasturba(long x, long y) {
        if (x < 10 && y < 10) {
            return x * y;
        }
        long n = Math.max(String.valueOf(x).length(), String.valueOf(y).length()), n1 = n / 2;
        long a = x / (long) Math.pow(10, n1), b = x % (long) Math.pow(10, n1), c = y / (long) Math.pow(10, n1), d = y % (long) Math.pow(10, n1);
        long s1 = Kasturba(a, c);
        long s2 = Kasturba(b, d);
        long s4 = Kasturba(a + c, b + d) - s1 - s2;
        return s1 * (long) Math.pow(10, n) + s4 * (long) Math.pow(10, n1) + s2;
    }


    //Alice Apple tree
    public static int AliceAppleTree(int n) {
        int res = 0, count = 0;
        while (res <= n) {
            count++;
            res += 12 * count * count;
        }

        return 8 * count;
    }

    //Longest Sequence of 1's after flipping a bit atmost once
    public static int Longest(String s1) {
        int max = 0, left = 0, right = 0, count0 = 0;
        while (right < s1.length()) {
            if (s1.charAt(right) == '0') {
                count0++;
            }
            if (count0 > 1) {
                if (s1.charAt(left) == '0') {
                    count0--;
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }

    //Swapping two nibbles in a byte
    public static int Swapping(int n) {
        int res = 0;
        for (int i = 4; i > 0; i--) {
            res += n >> (i - 1) & 1;
            res <<= 1;
        }

        for (int i = 8; i > 5; i--) {
            res += n >> (i - 1) & 1;
            res <<= 1;
        }
        return res;
    }

    //Maximum product subArray
    public static int maxProduct(int[] nums) {
        int curr = 1, max = Integer.MIN_VALUE, n = nums.length;
        for (int i = 0; i < n; i++) {
            curr *= nums[i];
            max = Math.max(max, curr);

            if (curr == 0) {
                curr = 1;
            }
        }

        curr = 1;
        for (int i = n - 1; i >= 0; i--) {
            curr *= nums[i];
            max = Math.max(max, curr);
            if (curr == 0) {
                curr = 1;
            }
        }
        return max;
    }

    //Max product subArray
    public static int maxProduct1(int[] nums) {
        int max = Integer.MIN_VALUE, curr = 1;
        for (int i = 0; i < nums.length; i++) {
            curr *= nums[i];
            max = Math.max(curr, max);
            if (curr == 0) {
                curr = 1;
            }
        }

        curr = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            curr *= nums[i];
            max = Math.max(curr, max);
            if (curr == 0) {
                curr = 1;
            }
        }
        return max;
    }


    //Left Rotation of an array
    public static int[] leftRotate(int[] arr, int k) {
        int n = arr.length;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
        return arr;
    }


    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    //Right Rotation of an array
    public static int[] rightRotate(int[] arr, int k) {
        int n = arr.length;
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - k - 1);
        reverse(arr, 0, n - 1);
        return arr;
    }

    //Max Sum of Hour glass in a matrix
    public static int MaxSum(int[][] matrix) {
        int curr = 0, max = Integer.MIN_VALUE, m = matrix.length, n = matrix[0].length;
        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                curr = (matrix[i - 1][j - 1] + matrix[i - 1][j] + matrix[i - 1][j + 1] + matrix[i][j] + matrix[i + 1][j - 1] + matrix[i + 1][j] + matrix[i + 1][j]);
                max = Math.max(max, curr);
            }
        }
        return max;
    }


    //Move Hyphen's to the Beginning
    public static String Move(String ans) {
        String ans1 = "";
        for (int i = 0; i < ans.length(); i++) {
            if (ans.charAt(i) == '-') {
                ans1 = '-' + ans1;
            } else {
                ans1 += ans.charAt(i);
            }
        }
        return ans1;
    }

    public static boolean isPalindrome(String s1, int left, int right) {
        while (left <= right) {
            if (s1.charAt(left) != s1.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

    //Manacher's Algorithm - O(N^2)
    public static String Manacher(String s) {
        String ans = "";
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrome(s, i, j)) {
                    if (max < j - i + 1) {
                        max = j - i + 1;
                        ans = s.substring(i, j + 1);
                    }
                }
            }
        }

        return ans;

    }

    //Manacher's Algorithm - O(N)

    //Weighted Substring
    public static ArrayList<String> Count(String s1,int target){
        int count = 0;
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++){
            String s = "";
            int sum = 0;
            for (int j = i; j < s1.length(); j++){
                sum += (s1.charAt(j) - 'a') + 1;
                s += s1.charAt(j);
                if (sum <= target){
                    count++;
                    res.add(s);
                }
            }
        }

        res.add(String.valueOf(count));
        return res;
    }

    public static void main(String[] args) {


        System.out.println(Math.sqrt(16));
        System.out.println(Math.round(17.4));
        System.out.println(Math.ceil(17.3));

        String s = "Satya pranay";
        s = s.replace("a", "s");

        System.out.println(s);

        Scanner input = new Scanner(System.in);

//        int x = input.nextInt();
//        int square = x * x, temp = square;
//        int n = 0;
//        while (temp > 0) {
//            temp = temp / 10;
//            n++;
//        }
//
//        int p = (int) Math.pow(10, n);
//        int q = square / p;
//        int r = square % p;
//        System.out.println((q == r) ? "It is a Kaprekar number" : "It is not a Kaprekar number");

        int ch = 'b';
        System.out.println(ch);

        char in = 124;
        System.out.println(in);
//        //        Scanner in2 = new Scanner(System.in);
//        int x2 = in2.nextInt();
//        int y = in2.nextInt();
//        System.out.println((12 * y - x2) >= 0 ? ("Profit = " + (12 * y - x2)) : "Loss = " + (x2 - 12 * y));


        if (isStrobo("98689")) {
            System.out.println("It is a Strobogrammatic number");
        } else {
            System.out.println("It is not a Strobogrammatic number");
        }

        int x1 = 20;
        for (int i = 1; i <= x1; i++) {
            System.out.println("phi( " + i + " ) = " + Euler(i));
        }

        int[] num = {3,4,5},rem = {2,3,1};
        System.out.println("Smallest number which follow the given conditions is " + ChineseRemainder(num,rem));

        int[] arr1 = {1,2,3,4};
        int[] ans = productExceptSelf(arr1);
        System.out.println(Arrays.toString(ans));

        System.out.println(Fact(24));

        String s1 = "babad";
        System.out.println(longestPalindrome(s1));

        System.out.println(s1.substring(0,2));

        System.out.println(gcd(24,16));
        System.out.println(gcd1(24,16));

        System.out.println(IsBinaryPalindrome(9));

        System.out.println("Multiplication of these two numbers are " + Multiply(9,8));

        int a = 7,b = 5,c = 30;
        int x = c / 30;
        int res = a + x;
        System.out.println(res / b);

        System.out.println("Longest sequence of 1's is " + Longest(toBinary(15)));

        System.out.println("Resulted number after swapping the two nibbles in the given number = " + Swapping(10));

        int[] arr = {4,0,2,6};
        System.out.println(maxProduct(arr));
        System.out.println(maxProduct1(arr));

        System.out.println("Resulted number after swapping the two nibbles in the given number = " + ((100&0X0F)<<4|(100&0XF0)>>4));

        System.out.println("Resulted number is " + toBinary((100 & 15) << 4 | (100 & 240) >> 4));
        System.out.println("Binary number = " + toInteger("101"));
        String s2 = "101";
        System.out.println("Perimeter required = " + AliceAppleTree(55));
        int[] arr2 = {1,2,3,4,5};
        System.out.println(Arrays.toString(rightRotate(arr2,2)));
        int[] arr3 = {1,2,3,4,5};
        System.out.println(Arrays.toString(leftRotate(arr3,2)));
        System.out.println(Euler(245));
        System.out.println(Swapping(313));
        System.out.println((313 & 15 << 4) | (313 & 240 >> 4));
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int[][] mat2 = {
                {-225,-54,-54},
                {-44,-54,-46},
                {-466,-54,-646}
        };
        System.out.println("Maximum sum = " + MaxSum(matrix));
        System.out.println("Maximum sum of Hour glass = " + MaxSum(mat2));
        System.out.println("Resulted String = " + Move("Face-prep - sithi-sathi-uysvjvhJv-vgvjhsuv-kbfsjh-bjh"));
        System.out.println("Longest Palindromic substring = " + Manacher("aoba"));

        System.out.println(Count("abdc",9));
    }
}

