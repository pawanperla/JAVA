public class StringBuilders {
    public static void main(String[] args) {
        String a = "RAMA";
        StringBuilder stringBuilder = new StringBuilder("PAWAN");
        stringBuilder.append("ABC");
        System.out.println(stringBuilder);
        stringBuilder.insert(0, "JAVA");
        System.out.println(stringBuilder);
        stringBuilder.replace(1, 3, "HELLO"); // end - 1
        System.out.println(stringBuilder);
        stringBuilder.delete(1, 8); // end - 1
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.equals(a));
    }
}
