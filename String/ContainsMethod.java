public class ContainsMethod {
    public static void main(String[] args) {

        String s1 = "PAWAN";
        System.out.println(s1.contains("AWA"));

        String s2 = "I am from India";
        // System.out.println(s2.contains(null)); //You will get Error

        String s3 = "SRIRAM SITA";
        System.out.println(s3.endsWith("A"));
        System.out.println(s3.endsWith("SITA"));

        String s4 = "abc.com";
        System.out.println(s4.endsWith(".com"));

        System.out.println(s4.startsWith("def"));
        System.out.println(s4.startsWith("a"));
    }
}
