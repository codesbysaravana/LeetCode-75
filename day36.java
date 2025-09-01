import java.util.*;

class Solution {
    public static int maxOnes(int[] nums) {
        if(nums.length == 1) {
            int num = nums[0];
            return num;
        }

        int zeroCount = 0;
        int left = 0;
        int res = 0;

        for(int right = 0; right<nums.length; right++) {
            if(nums[right] == 0) {
                zeroCount++;
            }

            while(zeroCount > 1) {
                if(nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            res = Math.max(res, right - left); //cuz we need the length of subarray;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int result = maxOnes(nums);
        System.out.println(result);

        sc.close();
    }
}