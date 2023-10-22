import java.util.*;

public class Vectors {
    public static void main(String[] args) {
        // Create a Vector and add elements
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println(vector);

        // Append all elements from another collection
        Vector<Integer> otherVector = new Vector<>();
        otherVector.add(4);
        otherVector.add(5);
        otherVector.add(6);
        otherVector.add(7);
        otherVector.add(8);
        otherVector.add(11);
        otherVector.add(12);

        vector.addAll(otherVector);
        System.out.println(vector);
        vector.add(6, 998);

        // Append a single element
        vector.addElement(9);
        System.out.println(vector);

        // Get the current capacity of the vector
        int capacity = vector.capacity();
        System.out.println("Capacity of Vector is : " + capacity);

        // Clone the vector
        Vector<Integer> clonedVector = (Vector<Integer>) vector.clone();
        for (int i : clonedVector) {
            System.out.print(i + " ");
        }

        System.out.println();
        // Check if the vector contains a specified element
        boolean contains = vector.contains(5);
        System.out.println(contains);

        // Check if the vector contains all elements from another collection
        boolean containsAll = vector.containsAll(otherVector);
        System.out.println(containsAll);

        // copyInto() - Copy the vector's components into an array
        Integer[] array = new Integer[vector.size()];
        vector.copyInto(array);
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();
        // Get an element at a specified index same as get()
        // int element = vector.elementAt(5);
        // System.out.println(element);

        // Ensure the vector's capacity is at least the specified value
        vector.ensureCapacity(20);

        // Compare two vectors for equality
        boolean equals = vector.equals(otherVector);
        System.out.println(equals);

        // Get the first component of the vector
        int firstElement = vector.firstElement();
        System.out.println(firstElement);

        // Get an element at a specified position
        System.out.println(vector.get(2));

        // hashCode() - Get the hash code value of the vector
        // int hashCode = vector.hashCode();
        // System.out.println(hashCode);

        // Get the index of the first occurrence of an element
        System.out.println(vector.indexOf(5));

        // Insert an element at a specified index
        vector.insertElementAt(69, 1); // same as add
        System.out.println(vector);

        // Check if the vector is empty
        System.out.println(vector.isEmpty());

        // Get the last component of the vector
        System.out.println(vector.lastElement());

        // Get the index of the last occurrence of an element
        System.out.println(vector.lastIndexOf(5));

        // Remove a specified element from the vector
        vector.remove(3);
        System.out.println(vector);

        // Remove elements from the vector that are present in another collection
        vector.removeAll(otherVector);
        System.out.println(vector);

        // Remove the first occurrence of an element from the vector
        // vector.remove(69);
        vector.removeElement(69); // same as remove
        System.out.println(vector);

        // removeElementAt() - Remove an element at a specified index
        // vector.remove(0)
        vector.removeElementAt(0);
        System.out.println(vector);

        // Remove elements that satisfy a given predicate
        vector.removeIf(e -> e % 2 == 0);
        System.out.println(vector);

        // removeRange() - Remove elements within a specified range
        // vector.removeRange(0, 2);

        // Replace elements with the result of applying an operator
        vector.replaceAll(e -> e * 2);
        System.out.println(vector);

        // Retain only elements that are present in another collection
        // vector.retainAll(otherVector);

        // Set the size of the vector
        vector.setSize(3);

        // Replace an element at a specified position
        vector.set(1, 8);
        System.out.println(vector);

        // Set the component at a specified index
        // vector.set(1, 8);
        vector.setElementAt(9, 2);
        System.out.println(vector);

        // Get the number of components in the vector
        System.out.println(vector.size());

        // sort() - Sort the vector according to the order induced by a Comparator
        vector.sort(Comparator.reverseOrder());
        System.out.println(vector);

        // subList() - Get a view of a portion of the vector
        // List<Integer> subList = vector.subList(1, 3);

        // toArray() - Get an array containing all elements in the vector
        Integer[] arrayFromVector = vector.toArray(new Integer[0]);
        for (int i : arrayFromVector) {
            System.out.print(i + " ");
        }

        // Object[] arr = vector.toArray();
        // System.out.println(Arrays.toString(arr));

        System.out.println();
        // toString() - Get a string representation of the vector
        String vectorString = vector.toString();
        System.out.println(vectorString);

        // clear() - Delete all elements from the vector
        vector.clear();
        System.out.println(vector);
    }
}
