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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode t1 = head.next;
        int sum = 0;
        while(t1!=null){
            if(t1.val == 0){
                  ListNode add = new ListNode(sum);
                  temp.next = add;
                  temp = temp.next;
                  sum = 0;
            }
            else sum += t1.val;
            t1 = t1.next;
        }
        return dummy.next;
    }
}