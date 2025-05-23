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
// class Solution {
//     //1. arraylist
//     public static ListNode swapNodes(ListNode head, int k) {
//         ListNode pNode = head;
//         List<ListNode> nodeList = new ArrayList<>();
// 		// store these nodes.
//         while (pNode != null) {
//             nodeList.add(pNode);
//             pNode = pNode.next;
//         }

// 		// swap their values.
//         int len = nodeList.size();
//         int temp = nodeList.get(k - 1).val;
//         nodeList.get(k - 1).val = nodeList.get(len - k).val;
//         nodeList.get(len - k).val = temp;

//         return head;
//     }
// }

//2. two pointer
class Solution {
    public ListNode swapNodes(ListNode head, int k) {		
        ListNode fast = head;
        ListNode slow = head;
        ListNode first = head, second = head;
        
        for(int i = 0; i < k - 1; ++i)
            fast = fast.next;
            
        first = fast;

        while(fast.next != null) {
			slow = slow.next;
            fast = fast.next;
        }
        
        second = slow;
		
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        
        return head;
    }
}