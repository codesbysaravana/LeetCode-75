import java.util.*;

class Solution {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int a : asteroids) {
            boolean alive = true;

            while (alive && a < 0 && !stack.isEmpty() && stack.peek() > 0) {
                int top = stack.peek();

                if (top < -a) {
                    stack.pop(); // top asteroid destroyed
                    continue;    // check again
                } else if (top == -a) {
                    stack.pop(); // both destroyed
                }
                alive = false; // current asteroid destroyed
            }
            if (alive) stack.push(a);
        }
        
        // Convert stack to int[]
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("The size: ");
        int n = sc.nextInt();

        int[] inputAsteroids = new int[n];
        for(int i = 0; i < n; i++) {
            inputAsteroids[i] = sc.nextInt();
        }

        int[] answer = asteroidCollision(inputAsteroids);
        System.out.println(Arrays.toString(answer));

        sc.close();
    }
};
