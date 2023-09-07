public class StringandInt {
    public static void main(String[] args) {

        // String to Int

        String s = "200";
        int i = Integer.parseInt(s);
        System.out.println(i);
        int j = Integer.parseInt(s + 100);
        System.out.println(j);
        System.out.println(i + 100);

        String p = "300";
        int k = Integer.valueOf(s);
        System.out.println(p);

        // Int to String

        int a = 10;
        String s1 = String.valueOf(a);
        System.out.println(s1);
        int b = 200;
        String s2 = String.valueOf(b);
        System.out.println(s2);
        System.out.println(Integer.toString(b));

    }
}
