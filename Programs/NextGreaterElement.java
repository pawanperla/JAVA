import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        
        nextGreaterElement(nums1, nums2);
    }

    public static void nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Stack<Integer> st = new Stack<Integer>();
        for (int i : nums2) {
            st.push(i);
        }
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = greater(nums1[i], st);
        }
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    static int greater(int i, Stack<Integer> st) {
        int index = st.search(i);
        int pointer = 1;
        int max = -1;
        while (pointer < index) {
            int ele = st.pop();
            if (ele > i) {
                max = ele;
            }
            pointer++;
        }
        return max;
    }
}
