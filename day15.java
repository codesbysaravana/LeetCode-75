class Solution {
    public void moveZeroes(int[] nums) {
        //for two pointers
        int zeroMovers = 0;
        
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                nums[zeroMovers] = nums[i];
                zeroMovers++;
            }
        }

        for(int i=zeroMovers; i<nums.length; i++) {
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