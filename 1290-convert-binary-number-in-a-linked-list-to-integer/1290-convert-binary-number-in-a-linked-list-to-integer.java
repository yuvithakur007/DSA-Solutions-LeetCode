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
    public int getDecimalValue(ListNode head) {     
        int ans = 0;
        for(ListNode temp =  head;temp!=null;temp=temp.next){
            ans =  (ans<<1)+temp.val;
        }                
        return ans;        
    }
}

// class Solution {
//     public int getDecimalValue(ListNode head) {
//         int res = 0;
        
//         while(head!=null){
//             res = res<<1 | head.val;   // res = res*2 + head.val;
//             head = head.next;
//         }
        
//         return res;
//     }
// }

// do {
//     result = (result << 1) + head.val;
// } while((head = head.next) != null);