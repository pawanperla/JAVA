public class Program2 {
    public static void main(String[] args) {
        // int[] f = { 1, 0, 1, 0, 1, 0, 1 };
        // int[] f = { 1, 0, 0, 0, 0, 1 };
        int[] f = { 0, 0, 1, 0, 1 };
        int count = 0;
        for (int i = 1; i < f.length - 1; i++) {
            if (f[i - 1] == 0 && f[i + 1] == 0) {
                if (f[i] != 1) {
                    f[i] = 1;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
