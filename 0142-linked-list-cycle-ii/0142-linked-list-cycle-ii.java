/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        // TC -> O(N) SC = O(N) 
        // HashMap<ListNode, Integer> map = new HashMap<>();
        // ListNode temp = head;
        // while(temp != null){
        //     if(map.containsKey(temp)){
        //         return temp;
        //     }
        //     map.put(temp,1);
        //     temp = temp.next;
        // }

        // tc = o(n) sc = o(1)
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                fast = head;
                while(slow!=fast){
                slow = slow.next;
                fast = fast.next;
                }
                return slow; // or return fast (both are at the starting point of cycle node)
            }
        }
        return null;
    }
}