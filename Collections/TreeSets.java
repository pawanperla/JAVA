import java.util.TreeSet;

// sorts the elements
// unique elements only

public class TreeSets {
    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<String>();
        ts.add("Ravi");
        ts.add("Vijay");
        ts.add("Ravi");
        ts.add("Ajay");
        ts.add("Pawan");
        ts.add("Sunil");

        System.out.println(ts);

        System.out.println("Contains Method : " + ts.contains("Ravi"));
        System.out.println("First Element : " + ts.first());
        System.out.println("Last Element : " + ts.last());

        ts.remove("Vijay");
        System.out.println(ts);

        System.out.println("Poll First to Remove First Element : " + ts.pollFirst());
        System.out.println(ts);

        System.out.println("Poll Last to Remove Last Element : " + ts.pollLast());
        System.out.println(ts);

        System.out.println(ts.isEmpty());

        System.out.println(ts.size());

        ts.clear();
        System.out.println(ts);
    }
}
