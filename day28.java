import java.util.*;

class Solution {
    public static int equalPairs(int[][] grid) {
        int count = 0; // will store how many matching row-column pairs we find
        int n = grid.length; // since it's n x n, number of rows = number of columns

        // Step 1: Store each row as a List in a HashMap with its frequency
        Map<List<Integer>, Integer> rowMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>(); // create a new list to store row elements
            for (int j = 0; j < n; j++) {
                row.add(grid[i][j]); // add each element from the i-th row
            }
            // if row already exists in map, increase count; otherwise, store it with count 1
            rowMap.put(row, rowMap.getOrDefault(row, 0) + 1);
        }

        // Step 2: For each column, make a list and check if it matches any stored row
        for (int j = 0; j < n; j++) {
            List<Integer> col = new ArrayList<>(); // create a new list for this column
            for (int i = 0; i < n; i++) {
                col.add(grid[i][j]); // add each element from the j-th column
            }
            // if this column matches a row from rowMap, add the frequency to count
            count += rowMap.getOrDefault(col, 0);
        }

        return count; // return total number of matching row-column pairs
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter cols: ");
        int cols = sc.nextInt();

        int[][] grid = new int[rows][cols];

        System.out.println("Enter matrix elements");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                grid[i][j] = sc.nextInt();
            } 
        }

        sc.close();

        int answer = equalPairs(grid);
        System.out.print("The Answer is: ");
        System.out.println(answer);
    }
}

/* 
3-line approach summary
Store each row of the matrix in a HashMap as a list key with its frequency.
For each column, create the same kind of list and check if it exists in the row map.
Add the matching frequency to the result count. */