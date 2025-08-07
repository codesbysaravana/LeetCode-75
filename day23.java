import java.util.Scanner;

class Solution {
    // Function to calculate the highest altitude reached during the trip
    public static int largestAltitude(int[] gain) {
        int current = 0;           // This keeps track of the current altitude, starting at sea level (0)
        int maxAltitude = 0;       // This will store the highest altitude seen so far, initialized to 0

        // Loop through each net gain in altitude
        for (int i = 0; i < gain.length; i++) {
            current += gain[i];    // Add the current gain to the ongoing altitude
            if (current > maxAltitude) {
                maxAltitude = current;  // Update maxAltitude if the current altitude is greater
            }
        }

        return maxAltitude;        // Return the highest altitude reached
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner needs System.in passed
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] gain = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element: ");
            gain[i] = sc.nextInt();
        }

        int result = largestAltitude(gain); // Call the function and store the result
        System.out.println("The highest altitude reached is: " + result); // Print result
    }
}
