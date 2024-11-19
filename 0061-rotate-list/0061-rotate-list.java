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
    
    public ListNode findLastNode(ListNode temp, int k){
        int c =1;
        while(temp!=null){
            if(c == k){
                return temp;
            }
            c++;
            temp=temp.next;
            
        }
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        int length = 1;
        ListNode tail = head;
        while(tail.next !=null){
            length++;
            tail = tail.next;
        }
        
        if(k%length == 0){
            return head;
        }
        
        k = k % length;
        
        tail.next = head;
        
        int cnt = 1;
        ListNode last = findLastNode(head, length - k);
        ListNode newHead = last.next;
        last.next = null;
        return newHead;
    }
}