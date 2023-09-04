import java.util.*;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<String, String>();

        hm.put("Z", "A");
        hm.put("Y", "B");
        hm.put("X", "C");
        hm.put("W", "D");
        hm.put("V", "E");

        System.out.println(hm);
        hm.remove("X");
        System.out.println(hm);
        System.out.println(hm.get("V"));
        // hm.clear();
        int s = hm.size();
        System.out.println(s);
        hm.replace("V", "Z");
        System.out.println(hm);
        System.out.println(hm.containsKey("M"));
        System.out.println(hm.containsValue("A  "));

        // for (Map.Entry m : hm.entrySet()) {
        // System.out.println(m.getKey() + " " + m.getValue());
        // }

        for (String a : hm.keySet()) {
            System.out.print(a + " ");
            System.out.println(hm.get(a));
        }
    }
}
