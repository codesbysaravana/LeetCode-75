import java.util.*;

class day50 {
    public static int[][] setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // Keep track of which rows and columns need to be zeroed
        boolean[] rowZero = new boolean[m];
        boolean[] colZero = new boolean[n];

        // Step 1: Identify all 0 positions
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }

        // Step 2: Set entire row and column to 0
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rowZero[i] || colZero[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int result[][] = setZeroes(matrix);
        for(int i=0; i<result.length; i++) {
            for(int j=0; j<result[0].length; j++) {
                System.out.println(result[i][j]);
            }
            System.out.println("");
        }

        sc.close();
    }    
}
