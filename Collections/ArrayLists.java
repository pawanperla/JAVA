import java.util.*;

// can contain duplicate elements.
// maintains insertion order.
// non synchronized.
// allows random access because the array works on an index basis.
// manipulation is a little bit slower because a lot of shifting occurs.

public class ArrayLists {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);

        // Insert element 3 at index 1 (second position)
        al.add(1, 3);

        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(4);
        al1.add(5);
        al1.add(6);

        // Append the elements of 'al1' to the end of 'al'
        al.addAll(al1);

        // Insert the elements of 'al1' starting at index 2
        al.addAll(2, al1);

        // Print the ArrayList 'al'
        System.out.println(al);

        // Remove all elements of 'al1' from 'al'
        al.removeAll(al1);

        System.out.println(al);

        // Retrieve and print the element at index 2 in 'al'
        System.out.println(al.get(2));

        // Print the size of 'al'
        System.out.println(al.size());

        // Check if 'al' is empty and print the result
        System.out.println(al.isEmpty());

        // Create an iterator for 'al' and print its elements
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();

        // Find and print the last index of element 2 in 'al'
        System.out.println(al.lastIndexOf(2));

        // Convert 'al1' to an array and print its elements
        Integer[] arr = al1.toArray(new Integer[al1.size()]);
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        // Create a clone of 'al1' and print it
        ArrayList<Integer> al3 = (ArrayList<Integer>) al1.clone();
        System.out.println(al3);

        // Check if 'al3' contains the element 5 and print the result
        System.out.println(al3.contains(5));

        // Find and print the index of the first occurrence of 3 in 'al'
        System.out.println(al.indexOf(3));

        // Remove the element at index 1 from 'al'
        al.remove(1);

        // Print the modified 'al'
        System.out.println(al);

        // Create an ArrayList 'al4' with string elements
        ArrayList<String> al4 = new ArrayList<>();
        al4.add("ABC");
        al4.add("DEF");

        // Print 'al4' and remove the element "DEF"
        System.out.println(al4);
        al4.remove("DEF");

        // Print 'al4' after the removal
        Iterator itr1 = al4.iterator();
        while (itr1.hasNext()) {
            System.out.print(itr1.next() + " ");
        }

        System.out.println();

        // Set elements at index 0 and 1 of 'al'
        al.set(0, 8);
        al.set(1, 9);

        // Print the modified 'al'
        System.out.println(al);

        // Sort 'al' in reverse order and print it
        al.sort(Comparator.reverseOrder());
        System.out.println(al);

        // Create two ArrayLists 'al2' and 'al5' with string elements
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Ravi");
        al2.add("Vijay");
        al2.add("Ajay");
        ArrayList<String> al5 = new ArrayList<String>();
        al5.add("Ravi");
        al5.add("Hanumat");

        // Retain only the elements present in both 'al2' and 'al5' in 'al2'
        al2.retainAll(al5);

        // Print the modified 'al2'
        System.out.println(al2);

        // Create an ArrayList 'all' containing custom objects (Student)
        ArrayList<Student> all = new ArrayList<Student>();
        Student s1 = new Student(1);
        Student s2 = new Student(5);

        // Add Student objects to 'all'
        all.add(s1);
        all.add(s2);

        // Iterate through 'all' and print the 'age' of each Student
        Iterator itr3 = all.iterator();
        while (itr3.hasNext()) {
            Student st = (Student) itr3.next();
            System.out.print(st.age + " ");
        }

        System.out.println();

        // Find and print the maximum value in 'al'
        System.out.println(Collections.max(al));

        System.out.println(al.contains(9));

    }
}

class Student {
    int age;

    public Student(int age) {
        this.age = age;
    }
}