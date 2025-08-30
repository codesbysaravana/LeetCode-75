import java.util.*;

class Solution {
    public static int maxSub(int[] nums) {
        if(nums.length == 1) {
            int num = nums[0];
            return num;
        }

        int current = nums[0];
        int bestBag = nums[0];

        for(int i=1; i<nums.length; i++) {
            current = Math.max(nums[i], current + nums[i]);
            bestBag = Math.max(bestBag, current);
        }

        return bestBag;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = maxSub(nums);
        System.out.println("Result is:");
        System.out.println(result);

        sc.close();
    }
}