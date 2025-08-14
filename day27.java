import java.util.*;

class Solution {
    public static boolean check(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //HashMap set the values and set the counts
        for(int n : arr) {
            map.put(n, map.getOrDefault(n, 0) +1);
        }

        //Set map to find the uniqueness of said key nd values
        Set<Integer> freqSet = new HashSet<>(map.values());

        return freqSet.size() == map.values().size();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length of Array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.print("Enter Array Element: ");
            arr[i] = sc.nextInt();
        }

        boolean answer = check(arr);
        System.out.println(answer);

        sc.close();
    }
}
