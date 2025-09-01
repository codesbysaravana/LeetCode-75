import java.util.*;

class Main {
    public static int[] searchRange(int[] nums,int target) {
        List<Integer> indices = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target) {
                indices.add(i);
            }
        }

        if(indices.isEmpty()) {
            return new int[] {-1,-1};
        }

        int[] res = new int[2];
        res[0] = indices.get(0); //the first elemeent index;
        res[1] = indices.get(indices.size()-1); //the last element index;

        return res;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = searchRange(nums, target);
        System.out.println(result);

        sc.close();
    }
}