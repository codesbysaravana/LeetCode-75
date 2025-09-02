import java.util.*;

class Solution {
    public static int removeDuplicatesinArrayPlace(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // slow pointer
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];  // place unique element at next index
            }
        }
        return i + 1; // number of unique elements
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int res = removeDuplicatesinArrayPlace(nums);
        System.out.println(res);
    }
}