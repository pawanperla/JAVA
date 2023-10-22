import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };

        int n = matrix.length;
        int m = matrix[0].length;

        // Transpose

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < m; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        // reverse

        for (int i = 0; i < n; i++) {
            // for (int j = 0; j < m / 2; j++) {
            // int temp = matrix[i][m - 1];
            // matrix[i][m - 1] = matrix[i][j];
            // matrix[i][j] = temp;
            // }
            int first = 0;
            int last = matrix[i].length - 1;
            while (first < last) {
                int temp = matrix[i][last];
                matrix[i][last] = matrix[i][first];
                matrix[i][first] = temp;
                first++;
                last--;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // System.out.println();
    }
}
