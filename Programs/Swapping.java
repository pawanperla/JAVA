public class Swapping {
    public static void main(String[] args) {
        int n = 100;
        System.out.println((n & 0X0F) << 4 | (n & 0xF0) >> 4);
    }
}
