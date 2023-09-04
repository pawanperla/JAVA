import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Hi");
        al.add("Hello");
        al.add("Pawan");

        // Iterator itr = al.iterator();
        // while (itr.hasNext()) {
        // System.out.print(itr.next() + " ");
        // }

        for (String i : al) {
            System.out.print(i + " ");
        }

        System.out.println(al.get(0));
        al.set(1, "Bagunnava");

        System.out.println("After Changing");
        for (String i : al) {
            System.out.print(i + " ");
        }
        System.out.println();
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(24);
        al1.add(112);
        al1.add(22);
        al1.add(5);
        for (int i : al1) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("After sorting");
        Collections.sort(al1);
        for (int i : al1) {
            System.out.print(i + " ");
        }
        System.out.println();
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("ABC");
        al2.add("pqrs");
        al2.add("lmno");
        al.addAll(1, al2);
        for (String i : al) {
            System.out.print(i + " ");
        }
        al.remove("lmno");
        al.remove(0);
        al.removeAll(al2);
        System.out.println();
        System.out.println("After Removing");
        for (String i : al) {
            System.out.print(i + " ");
        }

        // ArrayList<Student> all = new ArrayList<Student>();
        // Student s1 = new Student(1);
        // Student s2 = new Student(5);
        // all.add(s1);
        // all.add(s2);

        // System.out.println();
        // for (Student s : all) {
        // System.out.println(s.age);
        // }

        // Iterator itr3 = al2.iterator();
        // while (itr3.hasNext()) {
        // Student st = (Student) itr3.next();
        // System.out.println(st.age);
        // }
        System.out.println(al.isEmpty());
        System.out.println(al.size());
        System.out.println(Collections.max(al));
        Collections.sort(al, Collections.reverseOrder());
        System.out.println();
        System.out.println();
        System.out.println(al);

    }
}

class Student {
    int age;

    public Student(int age) {
        this.age = age;
    }
}