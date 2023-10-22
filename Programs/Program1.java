import java.util.*;

public class Program1 {
    public static void main(String[] args) {
        String s = "10110?01?010?110?110?0";
        List<String> list = bits(s);
        for (String i : list) {
            System.out.println(i);
        }
        System.out.println(list.size());
    }

    static List<String> bits(String s) {
        List<String> l1 = new ArrayList<String>();
        int qcount = 0;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '?') {
                qcount = qcount + 1;
                al.add(i);
            }
        }
        int combs = (int) Math.pow(2, qcount);
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < combs; i++) {
            String bs = Integer.toBinaryString(i);
            while (bs.length() < qcount) {
                bs = "0" + bs;
            }
            for (int j = 0; j < qcount; j++) {
                int index = al.get(j);
                char replacement = bs.charAt(j);
                sb.setCharAt(index, replacement);
            }
            l1.add(sb.toString());
        }
        return l1;
    }
}
