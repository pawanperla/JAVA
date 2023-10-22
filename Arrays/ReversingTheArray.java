public class ReversingTheArray {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first = first + 1;
            last = last - 1;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
