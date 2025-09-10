import java.util.*;

// Node definition
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {

    // BRUTE FORCE reverse using ArrayList
    public static ListNode revListBruteforce(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;

        // dump values into list
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }

        // rebuild in reverse order
        ListNode dummy = new ListNode(0);
        ListNode newCurr = dummy;
        for (int i = list.size() - 1; i >= 0; i--) {
            newCurr.next = new ListNode(list.get(i));
            newCurr = newCurr.next;
        }

        return dummy.next; // new head
    }

    // OPTIMIZED in-place reversal
    public static ListNode revList(ListNode head) {
        ListNode prev = null;   // reversed list so far
        ListNode curr = head;   // current node

        while (curr != null) {
            ListNode temp = curr.next; // save next
            curr.next = prev;          // flip link
            prev = curr;               // move prev
            curr = temp;               // move curr
        }

        return prev; // new head
    }
}

public class day42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input number of nodes
        System.out.print("Enter number of nodes: b");
        int n = sc.nextInt();

        // build linked list
        System.out.println("Enter " + n + " node values:");
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        ListNode head = dummy.next;

        // reverse list (choose method)
        ListNode reversed = Solution.revList(head);
        // ListNode reversed = Solution.revListBruteforce(head); // try brute force

        // print reversed list
        System.out.print("Reversed list: ");
        curr = reversed;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();

        sc.close();
    }
}
