import java.util.*;

class day46 {
     public static int[] bruteforce(int[] nums) {
        int n = nums.length;
        int selfprod[] = new int[n];
        Arrays.fill(selfprod, 1);

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i != j) {
                    selfprod[i] = selfprod[i]*nums[j]; 
                }
            }
        }
        return selfprod;
    }


    public static int[] selfproduct(int[] nums) {
        if(nums.length == 0) return nums;
        if(nums.length == 1) return nums;
        
        int n = nums.length;
        int answer[] = new int[n];
        Arrays.fill(answer, 1);

        int preffix = 1;
        for(int i=0; i<n; i++) {
            answer[i] = answer[i]*preffix;
            preffix = preffix*nums[i]; 
        }

        int suffix = 1;
        for(int j=n-1; j<=0; j--) {
            answer[j] = answer[j]*suffix;
            suffix = suffix*nums[j];
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }
        
        //int res[] = bruteforce(nums);
        int res[] = selfproduct(nums);
        for(int i=0; i<res.length; i++) {
            System.out.print(res[i]);
        }

        sc.close();
    }
} 