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
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        /*
        // TC = O(N * 2*1[1 FOR HASHMAP, 1 FOR CHECK AND 1 FOR PUT])
        HashMap<ListNode , Integer> map = new HashMap<>();
        ListNode temp = head;
        while(temp!=null){
            if(map.containsKey(temp)) return true;
            map.put(temp,1);
            temp = temp.next;
        }
        return false;*/
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) //handles both even and odd length and also prevents a NullPointerException
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
}