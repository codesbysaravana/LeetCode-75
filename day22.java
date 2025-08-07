class Solution {
    public int longestSubarray(int[] nums) {
        int zeroCount = 0;       // Counts how many 0s are in the window
        int left = 0;            // Left end of the window
        int maxLen = 0;          // Stores max window length found

        for(int right = 0; right < nums.length; right++) {
            // If we find a 0 at the current right end, count it
            if(nums[right] == 0) {
                zeroCount++;
            }

            // If we have more than 1 zero in our current window, move the left pointer
            while(zeroCount > 1) {
                // If the element at left was a zero, reduce the zeroCount
                if(nums[left] == 0) {
                    zeroCount--;
                }
                // Move the window forward
                left++;
            }

            // We calculate max length of the current window
            // right - left + 1 = total elements in window
            maxLen = Math.max(maxLen, right - left + 1);
        }

        // We must delete **one** element, so we subtract 1
        // Even if the array has all 1s, we have to delete one.
        return maxLen - 1;
    }
}
