import java.util.Stack;

class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if(!minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public int peek() {
        return stack.peek();
    }

    public void pop() {
        int removed = stack.pop();
        if(removed == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}


public class day51 {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(5);
        minStack.push(2);
        minStack.push(10);
        minStack.push(1);
        minStack.push(3);

        System.out.println("Top element: " + minStack.top()); // 3
        System.out.println("Current Min: " + minStack.getMin()); // 1

        minStack.pop();  // remove 3
        minStack.pop();  // remove 1 (was the min)

        System.out.println("After popping two elements:");
        System.out.println("Top element: " + minStack.top()); // 10
        System.out.println("Current Min: " + minStack.getMin()); // 2
    }
}