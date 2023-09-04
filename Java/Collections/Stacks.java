import java.util.*;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> s = new Stack<String>();
        s.push("s");
        s.push("t");
        s.push("a");
        s.push("c");
        s.push("k");

        Iterator itr = s.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        s.pop();
        Iterator itr1 = s.iterator();
        while (itr1.hasNext()) {
            System.out.print(itr1.next() + " ");
        }
        System.out.println();
        System.out.println("Location of t : " + s.search("t"));
        System.out.println(s.peek());
        for (String st : s) {
            System.out.print(st + " ");
        }
    }
}
