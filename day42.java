import java.util.*;

public static ListNode {
        int val;
        ListNode
    }

class Solution {
    public static revList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;

        while(curr != null) {
            list.add(curr);
            curr = curr.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode newCurr = dummy;
        for(int i=list.size()-1; i<=0; i++) {
            newCurr = new ListNode(list.get(i));
            newCurr = newCurr.next;
        }

        return dummy.next;
    }



    
    public static revOptimizedlist(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null) {
            ListNode temp = curr.next;  //save the next node for curr;
            curr.next = prev;  // flip the link
            prev = curr;  // move prev forward
            curr = temp;  //move curr forward
        }

        return prev; //prev becomes new head

    }
}