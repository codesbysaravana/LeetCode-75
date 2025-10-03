import java.util.*;

class day49 {
    public static int maxConsecSequence(int[] nums) {
        if(nums.length == 0) return 0;

        int longest = 0;
        int currstreak = 0;
        int curr = 0;
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }

        for(int num : set) {
            //create a new sequence if old one doesnt exist
            if(!set.contains(num - 1)) {
                currstreak = 1;
                curr = num;
            }
            //if set contains next of chosen num
            while(set.contains(curr + 1)) {
                currstreak++;
                curr++;
            }

            longest = Math.max(longest, currstreak);
        }

        return longest;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = maxConsecSequence(nums);
        System.out.println(result);
        sc.close();
    }
}

/* make set from nums
longest = 0
for each num in set:
    if num-1 not in set:   // start
        streak = 1
        while num+1 in set:
            num++
            streak++
        longest = max(longest, streak)
return longest */