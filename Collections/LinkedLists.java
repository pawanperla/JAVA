import java.util.*;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the end of the list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        System.out.println(linkedList);

        // Add an element at a specific position
        linkedList.add(1, "Grapes");
        System.out.println(linkedList);

        // Append all elements from another collection
        LinkedList<String> otherList = new LinkedList<>();
        otherList.add("Lemon");
        otherList.add("Orange");
        System.out.println(otherList);

        linkedList.addAll(otherList);
        System.out.println(linkedList);

        // Get the size of the LinkedList
        System.out.println(linkedList.size());

        // Insert elements at the beginning
        linkedList.addFirst("Strawberry");
        System.out.println(linkedList);

        // Insert elements at the end
        linkedList.addLast("Pineapple");
        System.out.println(linkedList);

        // Retrieve the first and last elements
        String first = linkedList.getFirst();
        System.out.println(first);

        String last = linkedList.getLast();
        System.out.println(last);

        // Get an element by index
        System.out.println(linkedList.get(3));

        // Find the index of an element
        System.out.println(linkedList.indexOf("Banana"));

        // Find the last index of an element
        System.out.println(linkedList.lastIndexOf("Pineapple"));

        // Remove elements
        linkedList.remove("Cherry");
        linkedList.remove(0);
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.removeFirstOccurrence("Lemon");
        linkedList.removeLastOccurrence("Lemon");

        System.out.println(linkedList);

        // Replace an element at a specific index
        linkedList.set(1, "Mango");

        // Pop and push elements (as a stack)
        linkedList.push("Watermelon");
        System.out.println(linkedList);
        String popped = linkedList.pop();
        System.out.println(linkedList);
        System.out.println("Popped : " + popped);

        // Peek elements
        System.out.println(linkedList.peekLast());
        System.out.println(linkedList.peekFirst()); // same as peek()

        // Poll elements
        linkedList.pollFirst(); // same as poll()
        System.out.println(linkedList);
        linkedList.pollLast();
        System.out.println(linkedList);

        // Offer elements
        boolean offered = linkedList.offer("Kiwi"); // adds at last same as offerLast()
        boolean offered1 = linkedList.offerFirst("Pawan");
        System.out.println(linkedList);

        // Convert the LinkedList to an array
        String[] array = linkedList.toArray(new String[linkedList.size()]);
        for (String s : array) {
            System.out.print(s + " ");
        }

        // Reverse the Linked List
        System.out.println();
        Iterator itr = linkedList.descendingIterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();
        Collections.sort(linkedList, Comparator.naturalOrder());
        System.out.println(linkedList);

        // Clear the list
        linkedList.clear();

        System.out.println();
        LinkedList<Book> lb = new LinkedList<Book>();
        lb.add(new Book(1, "A", "B", "C", 10));
        lb.add(new Book(1, "A", "B", "C", 10));
        lb.add(new Book(1, "A", "B", "C", 10));
        lb.add(new Book(1, "A", "B", "C", 10));

        for (Book b : lb) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}

class Book {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
