public class CharArrayMethod {
    public static void main(String[] args) {
        String s1 = "HelloWorld";
        char[] ch = s1.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
        System.out.println();
        System.out.println(ch.length);
    }
}
