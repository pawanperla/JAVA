public class getBytesMethod {
    public static void main(String[] args) {
        String s1 = "A";
        byte[] a = s1.getBytes();
        for (int i : a) {
            System.out.println(a[i]);
        }
    }
}