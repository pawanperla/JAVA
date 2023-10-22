public class ConcatMethod {
    public static void main(String[] args) {

        String s1 = "Pawan ";
        String s2 = "Perla";
        String s3 = "Phanieswar ";

        s1.concat(s2);
        System.out.println(s1);

        s1 = s1.concat(s2);
        s2 = s2.concat(s1);
        System.out.println(s1);
        System.out.println(s2);

        String s4 = s1.concat(s3).concat(s2);
        System.out.println(s4);

    }
}
