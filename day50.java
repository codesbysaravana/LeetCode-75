import java.util.*;

class day50 {
        public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        if (matrix == null || row == 0 || col == 0) {
            return; // base case: nothing to rotate
        }
        //for in place rev need temp;
        int temp[][] = new int[row][col];

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(matrix[i][j] == 0) {
                    temp[i][j+1] = 0;
                    temp[i][j-1] = 0;
                    temp[i+1][j] = 0;
                    temp[i-1][j] = 0;
                }
            }
        }

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                matrix[i][j] = temp[i][j];
            }
        }
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
