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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null; 
        // THE BELOW CODE HAS TIME COMPLEXITY OF O(N+N/2)
        // int count = 0;
        // ListNode temp = head;
        // while(temp!=null){
        //     count ++;
        //     temp = temp.next;
        // }
        // int ans = (count / 2);
        // temp = head;
        // while(temp != null){
        //     ans--;
        //     if(ans == 0) {
        //     temp.next = temp.next.next;
        //     break;
        // }
        // temp = temp.next;
        // }
        // return head;

        // TORTOISE HARE SOLUTION 
        ListNode slow = head;
        ListNode fast = head;
        fast = fast.next.next;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}