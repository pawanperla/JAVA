import java.util.*;

// Automatically Sorts the Elements Given
public class PriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.offer(1);
        pq.offer(5);
        pq.offer(2);
        pq.offer(11);
        pq.offer(3);
        pq.offer(9);
        pq.offer(4);
        System.out.println(pq);
        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq.element());
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println();

    }
}
