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
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         ListNode fast = head;
//         ListNode slow = head;
//         for(int i=0;i<n;i++){
//             fast = fast.next;
//         }
//             if(fast == null) return head.next;
//             while(fast.next != null){
//                 fast = fast.next;
//                 slow = slow.next;
//             }
//             slow.next = slow.next.next;
//             return head;
//         }
//     }

class Solution{
    public ListNode removeNthFromEnd(ListNode head, int n){
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count ++;
            temp = temp.next;
        }
        if(count == n) return head.next;
        int result = count - n;
        temp = head;
        while(temp != null){
            result --;
            if(result == 0) break;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}