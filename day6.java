/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // creating a dummy Listnode
        ListNode current = dummy; //creating a pointer to that dummy
        int carry = 0; //initialize carry func to use the carry functionalities

        ListNode p1 = l1; // creating pointer to l1 
        ListNode p2 = l2; // creating pointer to l2

        while(p1 != null || p2 != null || carry != 0) {
            //need sum for all val add
            int x = (p1 != null)? p1.val : 0; //selecting the val by check if not 0
            int y = (p2 != null)? p2.val : 0; //selecting the val by check if not 0

            int sum = x + y + carry;
            carry = sum/10;

            current.next = new ListNode(sum%10); // attach digit
            current = current.next; // move to the digit we just added

            if (p1 != null) p1=p1.next; //traversing the next l1 pointer
            if (p2 != null) p2=p2.next; //traversing the next l2 pointer
        }
        return dummy.next;
    }
}


//remeber carry ups when ---> sum is >= 10!
// while(current!=null) //common condition for looping in LINKED LIST
//here tho dont just see current see p1 p2 and carry