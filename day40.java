import java.util.*;

class Solution {
    public static List<List<String>> groupAnagram(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // Convert word into sorted form
            char[] c = word.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);

            // Add to map
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(word);
        }

        // Collect all groups
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example: read number of words
        int n = sc.nextInt();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }

        List<List<String>> res = groupAnagram(strs);
        System.out.println(res);

        sc.close();
    }
}
