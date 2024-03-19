/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode f =head, s=head;
        boolean cy = false;
        if(head == null)return null;
        while(f!=null && s !=null && f.next!=null){
            f = f.next.next;
            s = s.next;
            if(f == s)
                {cy = true;
                break;}
        }
        
        if(f == s && cy == true){
            s = head;
            if(f!=s){
                while(f.next !=s.next){
                    f=f.next;
                    s=s.next;
                }
                return f.next;
            }else{
                return f;
            }
            
        } else 
        return null;
        
    }
}