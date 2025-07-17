class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int n: nums) {
            if(n <= first) {
                first = n;
            } else if(n <= second) {
                second = n;
            } else {
                return true; // found n > second > first
            }
        }
        return false;
    }
}


//first: the smallest number so far
//second: a number larger than first

//🧠 Why We Use Integer.MAX_VALUE Here:
//We're trying to track the smallest values seen so far in the array (first, then second).
//By setting them to the largest number possible at the start, any number in the array will be smaller, so we can update first and second properly.



//think this sum as ---> GREEDY TECHNIQUE!!
//like this
/* ✅ Step 2: Think Like a Human – Greedy Strategy
Imagine you're watching numbers walk past you:
If you’ve seen a small number, hold on to it.
Then you see a number slightly larger — hold that too.
The moment you see a third one even larger → you’ve got your increasing triplet. */







//this is the BRUTE FORCE
/* class Solution {
    public boolean increasingTriplet(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    if(nums[i] < nums[j] && nums[j] < nums[k]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
 */
//remeber check all the possibilities dont return false on first try
