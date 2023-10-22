import java.util.*;

// unique elements
// unsorted

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<String, String>();

        hm.put("Z", "A");
        hm.put("Y", "B");
        hm.put("X", "C");
        hm.put("W", "D");
        hm.put("V", "E");

        System.out.println(hm);
        System.out.println(hm.values());
        hm.remove("X");
        System.out.println(hm);

        System.out.println(hm.get("V"));

        int s = hm.size();
        System.out.println(s);

        hm.replace("V", "Z");
        System.out.println(hm);

        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println(hm.isEmpty());
        HashMap<String, String> h2 = new HashMap<String, String>();
        h2.putAll(hm);
        h2.putIfAbsent("AAA", "BBB");
        System.out.println(h2);
        h2.remove("AAA", "BBB");
        System.out.println(h2);
        System.out.println(h2.containsKey("A"));
        System.out.println(h2.containsValue("E"));
        System.out.println(hm.get("V"));
        System.out.println(h2.values());

        // for (String a : hm.keySet()) {
        // System.out.print(a + " ");
        // System.out.println(hm.get(a));
        // }

        // for(Map.Entry<> m : hm.entrySet()) {
        // if(m.getValue() == value) {
        // key = m.getKey();
        // break;
        // }
        // }
        int[] nums = { 1, 3, 1, 9, 2, 7 };
        HashMap<Integer, Integer> hm2 = new HashMap<Integer, Integer>();
        for (int i = 1; i <= 9; i++) {
            hm2.put(i, 0);
        }

        for (int i = 0; i < nums.length; i++) {
            int c = hm2.get(nums[i]);
            c += 1;
            hm2.put(nums[i], c);
        }

        System.out.println(hm2.values());
        Collection<Integer> c = hm2.values();
        ArrayList<Integer> al = new ArrayList<>(c);
        int[] array = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            array[i] = al.get(index);
            index++;
        }
        for (int i : array) {
            System.out.print(i + " ");
        }

    }
}
