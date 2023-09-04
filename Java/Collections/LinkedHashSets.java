import java.util.*;

// Unique ELements only and order is maintained

public class LinkedHashSets {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet();
        lhs.add("Java");
        lhs.add("is");
        lhs.add("a");
        lhs.add("good");
        lhs.add("Language");
        lhs.add("Language");

        for (String i : lhs) {
            System.out.print(i + " ");
        }

        System.out.println();
        lhs.remove("a");
        for (String i : lhs) {
            System.out.print(i + " ");
        }
    }
}
