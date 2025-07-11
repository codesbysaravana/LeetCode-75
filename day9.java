class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;

        for (int i = 0; i < len; i++) {
            // Step 1: Check if this spot is empty (0)
            if (flowerbed[i] == 0) {

                // Step 2: Check if the left neighbor is empty or out of bounds (start of array)
                boolean emptyLeft = (i == 0 || flowerbed[i - 1] == 0);

                // Step 3: Check if the right neighbor is empty or out of bounds (end of array)
                boolean emptyRight = (i == len - 1 || flowerbed[i + 1] == 0);

                // Step 4: If both neighbors are empty, we can plant a flower here
                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1; // Plant the flower
                    n--;              // One less flower to plant

                    // Step 5: If we planted all required flowers, return true
                    if (n == 0) {
                        return true;
                    }
                }
            }
        }

        // Step 6: If loop ends and we still need to plant more, return false
        return n <= 0;
    }
}
