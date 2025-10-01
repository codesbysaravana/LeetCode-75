import java.util.*;

class day45 {
    public static int robHelper(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return nums[0];

        //we are using as dp[i+1] and dp[i+2];
        //so extra as n+2
        int[] dp = new int[n+2];

        //iterate from backward
        for(int i=n-1; i>=0; i--) {
            int rob = nums[i] + dp[i+2];
            int skip = dp[i+1];

            dp[i] = Math.max(rob, skip);
        }

        return dp[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }

        int res = robHelper(nums);
        System.out.println(res);
        sc.close();
    }
}

//think rob the i+2 house
// skip the i+1 house


/* 
public int rob(int[] nums) {
    int prev1 = 0; // cor`responds to dp[i+1]
    int prev2 = 0; // corresponds to dp[i+2]
    for (int i = nums.length - 1; i >= 0; i--) {
        int curr = Math.max(nums[i] + prev2, prev1);
        prev2 = prev1;
        prev1 = curr;
    }
    return prev1; // after loop this equals dp[0]
} */