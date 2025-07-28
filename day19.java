//SLIDING WINDOW!!

/* public ✅ Easy Problem:
Find the maximum sum of any subarray of size k.

Example:
java
Copy
Edit
Input: nums = [2, 1, 5, 1, 3, 2], k = 3  
Output: 9  
Explanation: Subarray [5,1,3] has the max sum = 9
💡 Sliding Window Idea in Simple Words:
Imagine a window of size k moving across the array.

You add the new element coming into the window.

You subtract the element going out of the window.

This way, you don’t calculate the sum from scratch every time (which saves time). {
    
}
 */




/* ✅ Sliding Window Technique — Basic Structure
🔹 For Fixed-Size Sliding Window (e.g., window size = k)
markdown
Copy
Edit
1. Initialize two variables:
   - `windowSum = 0`
   - `maxSum = 0` (or another result variable depending on the problem)

2. Loop through the first `k` elements:
   - Add each element to `windowSum`

3. Set `maxSum = windowSum` (first window result)

4. Loop from index `k` to the end of the array:
   - Subtract `nums[i - k]` (element going out of window)
   - Add `nums[i]` (element coming into window)
   - Update `maxSum` if needed

5. Return or print the result



Checkk:
        ❌ What Needs Improvement?
            1. You're summing all elements in the array initially:
            for(int i = 0; i < nums.length; i++) {
                windowSum = windowSum + nums[i];
            }
            This is incorrect, because you should only sum the first k elements to initialize the first window.
 */





/* 
 ✅ For Variable-Size Sliding Window (when window size depends on a condition)
markdown
Copy
Edit
1. Initialize:
   - `windowStart = 0`
   - `windowSum = 0`
   - Result variable (e.g., `minLength = Integer.MAX_VALUE`)

2. Loop with `windowEnd` from 0 to end of array:
   - Add `nums[windowEnd]` to `windowSum`

3. While `windowSum >= target` (or some condition is met):
   - Update result (e.g., `minLength = min(...)`)
   - Subtract `nums[windowStart]` from `windowSum`
   - Increment `windowStart` (shrink the window from left)

4. After loop, return or print result */








class Main {
    public static double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;
        
        // Step 1: Sum the first k elements first (eg: k=3) elemts 
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        // Step 2: Set initial maxSum
        double maxSum = windowSum;

        // Step 3: Slide the window
        for (int i = k; i < nums.length; i++) {
            windowSum = windowSum - nums[i - k] + nums[i]; // slide the window //getting old element out window and adding new in
            maxSum = Math.max(maxSum, windowSum);          // update max
        }

        // Step 4: Return average
        return maxSum / k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 3;
        System.out.println(findMaxAverage(nums, k)); // Correct usage
    }
}