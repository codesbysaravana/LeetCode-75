class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        // Step 1: Find first decreasing element from the right
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: If such element found, find next bigger and swap
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        // Step 3: Reverse the tail (after i)
        reverse(nums, i + 1, nums.length - 1);
    }

    // Helper to swap values
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Helper to reverse part of array
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}


/* Using pivot and stuff */

/* Notes 
Remeber permutation the max number in list breaks the permutation
and the smallest as the end and start so */
/* 
In this problem TRACK INDICES indices not values */




/* Suppose:
java
Copy
Edit
nums = [1, 2, 3]
👉 All permutations in order are:

csharp
Copy
Edit
[1,2,3]
[1,3,2]
[2,1,3]
[2,3,1]
[3,1,2]
[3,2,1]
If input is [1,2,3] → next is [1,3,2]
If input is [3,2,1] → next is reset to [1,2,3] (because it's the last permutation)

 */