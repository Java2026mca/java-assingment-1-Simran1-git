import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // TODO: Fill an N×N matrix in clockwise spiral order starting from 1
        //       Print each row with values separated by single space
        //       Then print: "Diagonal: X" where X = sum of primary diagonal (top-left to bottom-right)
        //
        // Input: 3
        // Output:
        // 1 2 3
        // 8 9 4
        // 7 6 5
        // Diagonal: 15
          int[][] matrix = new int[n][n];
        
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1;

        while (num <= n * n) {
            // 1. Move Right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // 2. Move Down
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // 3. Move Left
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--;

            // 4. Move Up
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = num++;
            }
            left++;
        }

        // Print Matrix and Calculate Diagonal
        long diagonalSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + (j == n - 1 ? "" : " "));
                if (i == j) {
                    diagonalSum += matrix[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Diagonal: " + diagonalSum);

    }
}
