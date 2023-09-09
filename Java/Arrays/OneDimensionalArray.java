public class OneDimensionalArray {
    public static void main(String[] args) {

        // declaring array

        int[] arr = new int[10];
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // another type of declaration

        int[] a = { 'a', 'b', 'c', 'd', 'e' };
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

    }
}
