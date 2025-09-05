import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {
    public static List<Integer> spiralMatrix(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int top = 0;
        int left = 0;
        int right = matrix[0].length -1;
        int bottom = matrix.length -1;

        while( top <= bottom && left <= right ) {
            for(int col=left; col<=right; col++) {
                list.add(matrix[top][col]);
            }
            top++;

            for(int row=top; row<=bottom; row++) {
                list.add(matrix[row][right]);
            }
            right--;

            if(top <= bottom) {
                for(int col=right; col>=left; col--) {
                    list.add(matrix[bottom][col]);
                }
                bottom--;
            }

            if(left <= right) {
                for(int row=bottom; row>=top; row--) {
                    list.add(matrix[row][left]);
                }
                left++;
            }
        }

        return list;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        List<Integer> res = spiralMatrix(matrix);
        System.out.println(res);
        sc.close();
    }
}
