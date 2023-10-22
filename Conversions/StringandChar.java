public class StringandChar {
    public static void main(String[] args) {

        // String to Char
        String s = "hello";
        char c = s.charAt(0);
        System.out.println(c);

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println();

        // char to String

        char c1 = 'f';
        System.out.println(Character.toString(c1));
        System.out.println(String.valueOf(c1));

    }
}
