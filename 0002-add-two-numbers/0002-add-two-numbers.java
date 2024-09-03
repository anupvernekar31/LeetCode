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
        
        ListNode dummy = new ListNode(0);
        ListNode current  = dummy;
        int carry = 0;
        // Traverse both linked lists
        while(l1 !=null || l2 !=null || carry !=0){
             // Get the values of the current nodes (0 if the list has been exhausted)
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            // Calculate the sum of the two digits plus carry
            int total = val1 + val2 + carry;
            // Update carry for the next iteration
            carry = total / 10;
            // Create a new node with the digit (total % 10)
            current.next = new ListNode(total % 10);
            // Move the current pointer to the newly added node
            current = current.next;
            // Move to the next nodes in the lists
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }

        }

        return dummy.next;
        
    }
}