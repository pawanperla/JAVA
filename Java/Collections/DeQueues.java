import java.util.*;

public class DeQueues {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<String>();
        dq.add("a");
        dq.add("b");

        System.out.println("Normal : ");
        for (String s : dq) {
            System.out.print(s + " ");
        }

        System.out.println();
        System.out.println("After offerFirst : ");
        dq.offerFirst("Pawan");
        for (String s : dq) {
            System.out.print(s + " ");
        }

        System.out.println();
        System.out.println("After offerLast : ");
        dq.offerLast("Hii");
        for (String s : dq) {
            System.out.print(s + " ");
        }

        System.out.println();
        System.out.println("After pollFirst : ");
        dq.pollFirst();
        for (String s : dq) {
            System.out.print(s + " ");
        }

        System.out.println();
        System.out.println("After pollLast : ");
        dq.pollLast();
        for (String s : dq) {
            System.out.print(s + " ");
        }

    }
}
