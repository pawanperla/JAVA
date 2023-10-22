import java.util.*;

// Unique ELements only and order is not maintained

public class HashSets {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet(); // Unordered

        hs.add("Pawan");
        hs.add("GoodMorning");
        hs.add("HadBreakfast");
        hs.add("Hi");
        hs.add("GoodMorning");

        for (String i : hs) {
            System.out.print(i + " ");
        }

        hs.remove("Hi");
        System.out.println();
        for (String i : hs) {
            System.out.print(i + " ");
        }

        HashSet<String> hSet = new HashSet();
        hSet.add("A");
        hSet.add("B");

        hs.addAll(hSet);
        System.out.println();
        for (String i : hs) {
            System.out.print(i + " ");
        }

        hs.removeAll(hSet);
        System.out.println();
        for (String i : hs) {
            System.out.print(i + " ");
        }

        hs.clear();
        System.out.println("After using clear : ");
        System.out.println();
        for (String i : hs) {
            System.out.print(i + " ");
        }
    }
}
