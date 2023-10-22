import java.util.*;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println(s);
        System.out.println(s.search(2)); // top most element is 1 and increases down
        System.out.println(s.search(0));
        int ele = s.get(1);
        System.out.println(ele);
        System.out.println(s.size());

        // for (int i : s) {
        // System.out.print(i + " ");
        // }
        // System.out.println();

        s.pop();
        System.out.println(s);
        System.out.println(s.size());

        int a = s.peek();
        System.out.println(a);

        System.out.println(s);

        int b = s.pop();
        System.out.println(b);

        System.out.println(s);

        System.out.println(s.empty());

        System.out.println(s.search(0));

    }
}
