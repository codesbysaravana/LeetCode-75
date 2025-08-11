import java.util.*;

class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }

        List<Integer> diff1 = new ArrayList<>();
        List<Integer> diff2 = new ArrayList<>();

        // elements in nums1 but not in nums2
        for (int i : set1) {
            if (!set2.contains(i)) {
                diff1.add(i);
            }
        }

        // elements in nums2 but not in nums1
        for (int i : set2) { // FIXED: should loop over set2
            if (!set1.contains(i)) {
                diff2.add(i);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(diff1);
        result.add(diff2);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the first array: ");
        int size1 = sc.nextInt();

        int[] nums1 = new int[size1];
        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < size1; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of the second array: ");
        int size2 = sc.nextInt();

        int[] nums2 = new int[size2];
        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < size2; i++) {
            nums2[i] = sc.nextInt();
        }

        List<List<Integer>> ans = findDifference(nums1, nums2);
        System.out.println(ans);

        sc.close();
    }
}
