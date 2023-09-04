import java.util.*;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Hello");
        ll.add("Hi");
        ll.add("Pawan");
        ll.add("SRH");

        Iterator itr = ll.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        LinkedList<String> ll2 = new LinkedList<String>();
        ll2.add("A");
        ll2.add("B");

        ll.addAll(4, ll2);
        System.out.println();
        Iterator itr1 = ll.iterator();
        while (itr1.hasNext()) {
            System.out.print(itr1.next() + " ");
        }

        LinkedList<String> ll3 = new LinkedList<String>();
        ll3.add("C");
        ll.addAll(ll3);
        System.out.println();
        Iterator itr3 = ll.iterator();
        while (itr3.hasNext()) {
            System.out.print(itr3.next() + " ");
        }

        ll.addFirst("Namaste");
        ll.addLast("bagunnava");
        ll.add("Pawan");
        System.out.println();
        Iterator itr4 = ll.iterator();
        while (itr4.hasNext()) {
            System.out.print(itr4.next() + " ");
        }

        ll.remove(2);
        ll.removeAll(ll3);
        // ll.removeLast();
        ll.removeFirst();
        ll.removeFirstOccurrence("Pawan");
        System.out.println();
        Iterator itr5 = ll.iterator();
        while (itr5.hasNext()) {
            System.out.print(itr5.next() + " ");
        }

        // Reverse the Linked List
        System.out.println();
        Iterator itr6 = ll.descendingIterator();
        while (itr6.hasNext()) {
            System.out.print(itr6.next() + " ");
        }

        Collections.sort(ll);
        System.out.println();
        System.out.println("Sorted order of ll : ");
        Iterator iterator = ll.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();
        LinkedList<Book> lb = new LinkedList<Book>();
        Book b1 = new Book(1, "A", "B", "C", 10);
        Book b2 = new Book(1, "A", "B", "C", 10);
        Book b3 = new Book(1, "A", "B", "C", 10);
        Book b4 = new Book(1, "A", "B", "C", 10);

        lb.add(b1);
        lb.add(b2);
        lb.add(b3);
        lb.add(b4);

        for (Book b : lb) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }

        ArrayList l = new ArrayList();
        int[] arr = { 1, 43, 2, 3, 11, 23, 32, 45, 56, 33 };
        for (int i : arr) {
            l.add(i);
        }
        System.out.println(l); // Prints like a list
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
