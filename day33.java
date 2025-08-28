import java.util.*;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left < right) {
            int sums = nums[left] + nums[right];
            if(sums == target ) {
                return new int[] {left, right};
            }
            if(sums > target) {
                left++;
            }
            else {
                right--;
            }
        }
        return new int[] {};

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        int[] neww = new int[5];
        neww[0] = 4;
        neww[1] = 4;
        neww[2] = 4;
        neww[3] = 4;
        neww[4] = 4;

        int[] result = twoSum(neww, target);
        
        sc.close();
    }
}