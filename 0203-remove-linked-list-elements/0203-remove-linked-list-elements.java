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
    public ListNode removeElements(ListNode head, int val) {
         //1. recursive approach
        if(head == null)
            return head;
        ListNode newNext = removeElements(head.next, val);
        if(head.val == val) {
            return newNext;
        } else {
            head.next = newNext;
            return head;
        }
    }
        
        
        //2.iterative approach
//         ListNode dummy = new ListNode(0);
//         dummy.next=head;
        
//         ListNode current = dummy;
        
//         while(current.next != null){
//             if(current.next.val==val){
//                 current.next= current.next.next;
//             }
//             else{
//                 current=current.next;
//             }
//         }
        
//         return dummy.next;
//     }
}