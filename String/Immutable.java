public class Immutable {
    public static void main(String[] args) {
        String s = "Pawan";
        s.concat("Perla");
        System.out.println(s);

        // String p = "Ram";
        // p = p.concat("Sita");
        // System.out.println(p);

        String p = "a";
        p = p + "b";
        System.out.println(p);
    }
}
