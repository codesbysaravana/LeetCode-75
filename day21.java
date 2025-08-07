import java.util.Scanner;

public class day21 {

    public static int longestOnes(int[] nums, int k) {
        int left = 0;
        int zeroCount = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            // Shrink window if too many zeros
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            // Update max length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the binary array elements (0 or 1):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Input k
        System.out.println("Enter the value of k (max zeros you can flip):");
        int k = scanner.nextInt();

        int result = longestOnes(nums, k);
        System.out.println("Maximum number of consecutive 1s after flipping at most " + k + " zeros: " + result);

        scanner.close();
    }
}











class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;         // window start
        int zeroCount = 0;    // how many 0s are inside the current window
        int maxLen = 0;       // answer: max length of valid window (with at most k zeros)

        // 'right' is end of the window
        for(int right = 0; right < nums.length; right++) {

            // If we see a 0, increase zeroCount (since it's in current window now)
            if(nums[right] == 0) {
                zeroCount++;
            }

            // If we have more than 'k' zeros, the window is invalid.
            // We shrink window from the left until it's valid again
            while(zeroCount > k) {
                // if we are removing a 0 from left, decrease zeroCount
                if(nums[left] == 0) {
                    zeroCount--;
                }
                left++; // move window start to the right
            }

            // After above while-loop, window is valid (zeroCount <= k)
            // Calculate current valid window length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
