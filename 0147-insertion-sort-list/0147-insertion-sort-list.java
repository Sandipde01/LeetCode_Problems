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
   
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy  = new ListNode(-1);
        ListNode prev = dummy;
        ListNode curr =  head;
        ListNode next = head.next;
        dummy.next = head;
        while(next!=null)
        {
            if(curr.val <=next.val)
            {
                curr =  curr.next;
                next = curr.next;
                continue;
            }
            while(prev.next !=null && prev.next.val<next.val)
            {
                prev =  prev.next;
            }
            curr.next= next.next;
            next.next = prev.next;
            prev.next = next;
           
            prev = dummy;
            next = curr.next;
        }
        
        return dummy.next;
    }
}
