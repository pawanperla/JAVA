import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 };
        int a = majorityElement(nums);
        System.out.println(a);
    }

    static int majorityElement(int[] nums) {
        int majority = nums.length / 2;
        HashMap<Integer, Integer> hm = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                int c = hm.get(nums[i]);
                c = c + 1;
                hm.put(nums[i], c);
            } else {
                hm.put(nums[i], 1);
            }
        }
        int key = 0;
        for (Map.Entry<Integer, Integer> m : hm.entrySet()) {
            if (m.getValue() > majority) {
                key = m.getKey();
            }
        }
        return key;
    }
}
