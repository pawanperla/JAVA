public class MultiDimensionalArray {
    public static void main(String[] args) {

        // declaring a multidimensional array

        int[][] arr = new int[2][2];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int[][] clone = arr.clone();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(clone[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(arr.equals(clone));

        // addition of mutlidimensional matrices

        int add[][] = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                add[i][j] = arr[i][j] + clone[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }

    }
}
