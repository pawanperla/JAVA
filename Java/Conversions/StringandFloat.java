public class StringandFloat {
    public static void main(String[] args) {

        // String to Float

        String s = "23.5656";
        float f = Float.parseFloat(s);
        System.out.println(f);
        System.out.println(Float.valueOf(s));

        // Float to String

        float f1 = 23.45F;
        System.out.println(String.valueOf(f1));
        String s1 = Float.toString(f1);
        System.out.println(s1);

    }
}
