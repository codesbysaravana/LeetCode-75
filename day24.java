import java.util.*;

class Solution {
    public int pivotIndex(int[] nums) {
        int pivot = 0;       // Not really needed, but you can keep it if you want clarity
        int rightSum = 0;    // Will store the sum of numbers to the right of current index
        int leftSum = 0;     // Will store the sum of numbers to the left of current index
        int totalSum = 0;    // Sum of all elements in the array

        // Step 1: Calculate the total sum of all elements in the array
        for (int i : nums) {
            totalSum += i;
        }

        // Step 2: Loop through the array to find the pivot index
        // The pivot index is where leftSum == rightSum
        for (int i = 0; i < nums.length; i++) {
            
            // rightSum at this index = total sum - left sum - current element
            // Why? Because totalSum = leftSum + nums[i] + rightSum
            rightSum = totalSum - leftSum - nums[i];
            
            // Step 3: Check if leftSum equals rightSum
            if (leftSum == rightSum) {
                return i; // Found the pivot index, return it immediately
            }
            
            // Step 4: Update leftSum by adding the current element
            // This will be used in the next iteration
            leftSum += nums[i];
        }

        // Step 5: If no pivot index found, return -1
        return -1;
    }
}
