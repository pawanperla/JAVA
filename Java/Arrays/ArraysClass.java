import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {

        int[] intArr = { 73, 12, 45, 88, 29, 64, 3, 55, 17, 37, 91, 8, 50, 67, 22, 96, 41, 7, 58, 2 };
        int[] intArr2 = { 1, 2, 3, 4, 5 };
        // int[] intArr3 = { 73, 12, 45, 88, 29, 64, 3, 55, 17, 37, 91, 8, 50, 67, 22,
        // 96, 41, 7, 58, 2 };

        // asList() Method

        System.out.println("Integer Array as List: " + Arrays.asList(intArr));

        // sort() Method

        Arrays.sort(intArr);
        for (int i : intArr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // binarySearch() Method

        System.out.println("Binary Search on given Key at index = " + Arrays.binarySearch(intArr, 67));

        // compare(array 1, array 2) Method

        System.out.println(Arrays.compare(intArr, intArr2));

        // gives 1 if not same
        // gives 0 if same;

        // deepEquals(Object[] a1, Object[] a2) Method

        int intArr4[][] = { { 10, 15, 22 } };
        int intArr5[][] = { { 10, 15, 22 } };

        System.out.println("Integer Arrays on comparison using Equals Method : " + Arrays.equals(intArr4, intArr5));
        System.out.println(
                "Integer Arrays on comparison using deepEquals Method: " + Arrays.deepEquals(intArr4, intArr5));

        // toString() Method

        System.out.println("1D Arrays to String : " + Arrays.toString(intArr));

        // deepToString(Object[] a) Method

        System.out.println("2D Arrays to String : " + Arrays.deepToString(intArr4));

        // equals(array1, array2) Method

        System.out.println("Equals Method : " + Arrays.equals(new int[] { 1, 2, 3 }, new int[] { 1, 2, 3 }));

        // fill(originalArray, fillValue) Method

        int[] intArr6 = { 1, 2, 3 };
        Arrays.fill(intArr6, 22);
        System.out.println(Arrays.toString(intArr6));

        // mismatch(array1, array2) Method

        int[] intArr7 = { 1, 9, 7, 8, 4 };
        System.out.println(Arrays.mismatch(intArr6, intArr7));

        // parallelSort(originalArray) Method
        // works like merge sort

        Arrays.parallelSort(intArr7);
        for (int i : intArr7) {
            System.out.print(i + " ");
        }

        // sort(T[] a, int fromIndex, int endIndex) Method

        int[] intArr8 = { 1, 20, 4, 22, 7, 16, 33, 4, 8, 12, 9, 3 };
        Arrays.sort(intArr8, 5, 11);
        for (int i : intArr8) {
            System.out.print(i + " ");
        }
    }
}
