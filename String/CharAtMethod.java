public class CharAtMethod {
    public static void main(String[] args) {
        String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i) + " ");
        }
        System.out.println();
        // System.out.println(string.charAt(26));
        System.out.println(string.charAt(0));
        System.out.println(string.charAt(string.length() - 1));
    }
}
