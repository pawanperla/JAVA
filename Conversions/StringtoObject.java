public class StringtoObject {
    public static void main(String[] args) {

        // String to Object

        String s1 = "hello";
        // Object o1 = s1;
        // System.out.println(o1);

        // object to String
        A a = new A();
        String s2 = a.toString();
        System.out.println(s2);

        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.toString());
    }
}

class A {

}
