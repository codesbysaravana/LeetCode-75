import java.util.*;

class Day47 {
    public static int[][] bruteforce(int[][] matrix) {
        // placeholder: you can add logic later
        int row = matrix.length;
        int col = matrix[0].length;

        //first rotate matrix ... store in temp n-->row
        int temp[][] = new int[row][col];
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                temp[j][row-1-i] = matrix[i][j];
            }
        }

        //assign temp back to matrix (in place reversal)
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                matrix[i][j] = temp[i][j];
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];

        // Input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        matrix = bruteforce(matrix);

        // Output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
