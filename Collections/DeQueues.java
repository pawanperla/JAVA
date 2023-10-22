import java.util.*;

public class DeQueues {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<String>();
        dq.add("b");
        dq.addFirst("c");
        dq.addLast("a");
        dq.offerFirst("k");
        dq.offerLast("p");
        dq.offer("m");

        System.out.println(dq);

        System.out.println(dq.peek());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

        System.out.println(dq.pollFirst()); // dq.poll()
        System.out.println(dq.pollLast());
        System.out.println(dq);

        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        System.out.println(dq.contains("b"));

        System.out.println(dq.size());
    }
}
