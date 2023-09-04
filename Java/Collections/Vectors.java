import java.util.*;

public class Vectors {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("Pawan");
        v.add("SRH");
        v.add("TT");
        v.add(1);
        v.add(2);
        v.addElement("heyy");

        Iterator itr = v.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
