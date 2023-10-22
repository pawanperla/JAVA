public class DetectCapital {
    public static void main(String[] args) {
        String s = "FlaG";
        // if (detectCapitalUse(s)) {
        // System.out.println("ok");
        // }
        int caps = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                caps = caps + 1;
            }
        }
        System.out.println(caps);
    }

    // static boolean detectCapitalUse(String word) {
    // int caps = 0;

    // for (int i = 0; i < word.length(); i++) {
    // if (Character.isUpperCase(i)) {
    // caps = caps + 1;
    // }
    // }

    // if (caps == 0) {
    // return true;
    // } else if (caps == word.length()) {
    // return true;
    // } else if (caps == 1 && Character.isUpperCase(word.charAt(0))) {
    // return true;
    // }

    // return false;
    // }
}
