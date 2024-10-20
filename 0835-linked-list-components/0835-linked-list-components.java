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
    public int numComponents(ListNode head, int[] nums) {
        int n = nums.length;
        int components = 0;
        Set<Integer> numsSet = new HashSet<>();
        for(int num : nums) {
            numsSet.add(num);
        }
        
        while(head != null) {
            boolean isPresentNode = false;
            while(head != null && numsSet.contains(head.val)) {
                isPresentNode = true;
                head = head.next;
            }
            
            if(isPresentNode) {
                components++;
            } if(head!=null) {
                head = head.next;
            }
        }
        
        return components;
    }
}