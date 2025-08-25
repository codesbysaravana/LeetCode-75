import java.util.*;

class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[] n = new int[2];

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                n[0] = left + 1;  // 1-based index
                n[1] = right + 1;
                return n;
            }
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[] {-1, -1}; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter an Element: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter target: ");
        int target = sc.nextInt();

        int[] result = twoSum(numbers, target);

        if (result[0] == -1) {
            System.out.println("No pair found!");
        } else {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }
        sc.close();
    }
}
