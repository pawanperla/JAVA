import java.util.*;

// Automatically Sorts the Elements Given
public class PriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.add("P");
        pq.add("a");
        pq.add("p");
        // pq.add(1);

        System.out.println("head Element : " + pq.element());
        System.out.println("Head Element : " + pq.peek());

        // Iterator itr = pq.iterator();
        // while (itr.hasNext()) {
        // System.out.print(itr.next() + " ");
        // }

        for (String s : pq) {
            System.out.println(s);
        }
    }
}
