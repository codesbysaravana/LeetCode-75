class Solution {
    public int[] productExceptSelf(int[] nums) {
        //creating that answer array with the size of nums
        int[] answer = new int[nums.length];

        int prefix = 1; //These should be initialized as 1 not 0, since anything multiplied by 0 is 0.
        int suffix = 1; //These should be initialized as 1 not 0, since anything multiplied by 0 is 0.
        
        //prefix from i->end
        for(int i=0; i<nums.length; i++) {
            answer[i] = prefix;
            prefix = prefix*nums[i]; // update prefix for next index
        }

        //suffix from end->i
        for(int i=nums.length-1; i>=0; i--) {
            answer[i] = answer[i]*suffix;
            suffix = suffix*nums[i]; // update suffix for next index
        }

        return answer;
    }
}