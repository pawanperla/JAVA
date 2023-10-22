import java.util.Stack;

public class Solution {
    // Function to reverse words in a given string.
    public static void main(String[] args) {
        // code here
        String S = "i.like.this.program.very.much";
        S = S.replace(".", " ");
        String[] arr = S.split(" ");
        String a = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i > 0) {
                a = a + arr[i] + ".";
            } else {
                a = a + arr[i];
            }
        }
        System.out.println(a);

    }
}