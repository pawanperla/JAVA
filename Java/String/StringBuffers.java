public class StringBuffers {
    public static void main(String[] args) {
        String a = "RAMA";
        StringBuffer stringBuffer = new StringBuffer("PAWAN");
        stringBuffer.append("ABC");
        System.out.println(stringBuffer);
        stringBuffer.insert(0, "JAVA");
        System.out.println(stringBuffer);
        stringBuffer.replace(1, 3, "HELLO"); // end - 1
        System.out.println(stringBuffer);
        stringBuffer.delete(1, 8); // end - 1
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer.equals(a));
    }
}
