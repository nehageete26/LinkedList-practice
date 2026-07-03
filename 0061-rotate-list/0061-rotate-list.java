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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        int count = 1;
        ListNode newhead = head;
        ListNode temp = head;
        while(temp.next != null){
            count++;
            temp = temp.next;
        }
        k = k%count;
        if(k%count == 0) return head;
        temp.next = head;
        for(int i=0;i<count-k;i++) temp = temp.next;
        newhead = temp.next;
        temp.next = null;
        return newhead;
    }
}