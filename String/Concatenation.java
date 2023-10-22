import java.util.StringJoiner;

public class Concatenation {
    public static void main(String[] args) {

        // using + operator

        String a = "Pawan";
        String b = " Perla";
        System.out.println(a + b);

        String c = 30 + 30 + "JAVA" + 40 + 40;
        System.out.println(c);

        String d = "Java" + 30;
        System.out.println(d);

        String e = 30 + "JAVA";
        System.out.println(e);

        String f = "30" + "JAVA";
        System.out.println(f);

        String g = "30" + "50" + "JAVA";
        System.out.println(g);

        String h = "JAVA" + "30" + "50";
        System.out.println(h);

        // using concat already done in previous codes

        // using String Builder

        StringBuilder sb = new StringBuilder("JAI");
        StringBuilder sb1 = new StringBuilder(" HANUMAN");
        sb.append(sb1);
        sb.append(" SRIRAM");
        System.out.println(sb);

        // using String Joiner

        StringJoiner sj = new StringJoiner(" . . ");
        sj.add("Pawan");
        sj.add("Phanieswar");
        // String n = sj.toString();
        // System.out.println(n);
        System.out.println(sj);
    }
}
