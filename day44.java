import java.util.*;

class day44 {
/*     public static List<List<Integer>> BruteForcethreesum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> list = new ArrayList<>();

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int k=j+1; k<n; k++) {
                    List<Integer> triplets = Arrays.asList(nums[i],  nums[j], nums[k]);
                    Collections.sort(triplets);
                    list.add(triplets);
                }
            }
        }

        return new ArrayList<>(list);
    } */

    public static List<List<Integer>> threesum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();

        for(int i=0; i<n; i++) {
            int left = i+1;
            int right = n-1;


            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0) {
                    set.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }

                else if(sum > 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }

        List<List<Integer>> res = threesum(nums);
    }
}