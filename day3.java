class Solution {
    public void moveZeroes(int[] nums) {
        int noZeroPos = 0;
        int len = nums.length;
        for(int i=0; i<len; i++) {
            if(nums[i] != 0) {
                nums[noZeroPos] = nums[i];
                noZeroPos++;
            }
        }

        for(int i=noZeroPos; i<len; i++) {
            nums[i] = 0;
        }
    }
}

//remember void means should not return JackShit
//and also this challenge no new aarrayy shift the pos and ele of the existing arrays
// .size() .length .length()

//remeber noZeroPos isincrementing INdex mainly ...after adding non zeroes from start...
//now to add all zeroes from the noZeroPos position till end

//just mainly keeping trrack of the index  thats all BY BUILDING A NEW INDEX AND REWRITING THE ARRAY WITH SAID INDEX




/* 
question

283. Move Zeroes
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0] */