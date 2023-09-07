import java.util.*;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<String, String>();

        hm.put("Z", "A");
        hm.put("Y", "B");
        hm.put("X", "C");
        hm.put("W", "D");
        hm.put("V", "E");
        // hm.put("V", "W");

        System.out.println(hm);

        // hm.remove("X");
        // System.out.println(hm);
        // System.out.println(hm.get("V"));
        // // hm.clear();

        // int s = hm.size();
        // System.out.println(s);

        // hm.replace("V", "Z");
        // System.out.println(hm);
        // System.out.println(hm.containsKey("M"));
        // System.out.println(hm.containsValue("A "));

        // // for (Map.Entry m : hm.entrySet()) {
        // // System.out.println(m.getKey() + " " + m.getValue());
        // // }

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
    }
}
