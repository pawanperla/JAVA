import java.util.ArrayList;

public class RightRotateArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        rotate(arr, 2);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static int[] rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        ArrayList<Integer> al = new ArrayList();

        for (int i = n - 1; i >= n - k; i--) {
            al.add(nums[i]);
        }
        for (int i : al) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = n - 1; i >= n - 1 - k; i--) {
            nums[i] = nums[i - k];
        }

        int j = al.size() - 1;
        for (int i = 0; i < k; i++) {
            nums[i] = al.get(j);
            j = j - 1;
        }
        return nums;

    }
}
