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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode t = head;
        ListNode p = head;
        int i = 0;
        if(t.next==null) 
            return null;
        //count
        while(t!=null){
            t=t.next;
            i++;
        }
        
        //if out of index
        if(i-n<0) 
            return null;
        
        // if at start
        if(i-n==0) {
            p=p.next;
            return p;
            }
        
        int j = 0;
        ListNode prev;
        while(p!=null){
            prev = p;
            p=p.next;
            if(j==(i-n-1)){
                prev.next = p.next;
            }
            j++;
        }
        return head;
    }
//         ListNode start = new ListNode(0);
//         start.next = head;
//         ListNode slow = start, fast = start;

//         //Move fast in front so that the gap between slow and fast becomes n
//         for(int i=1; i<=n+1; i++)   {
//             fast = fast.next;
//         }
//         //Move fast to the end, maintaining the gap
//         while(fast != null) {
//             slow = slow.next;
//             fast = fast.next;
//         }
//         //Skip the desired node
//         slow.next = slow.next.next;
//         return start.next;
//     }
}