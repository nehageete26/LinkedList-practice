/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // tc -> o(n*__)time for hashmap in black space sc-> o(n)
        // HashMap<ListNode, Integer> map = new HashMap<>();
        // if(headA == null || headB == null) return null;
        // ListNode temp = headA;
        // while(temp!=null){
        //     map.put(temp,1);
        //     temp = temp.next;
        // }
        // temp = headB;
        // while(temp!=null){
        //     if(map.containsKey(temp)){
        //         return temp; 
        //     }
        //     temp = temp.next;
        // }
        // return null;
        if(headA == null || headB == null) return null;
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while(temp1!= temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
            if(temp1 == temp2) return temp1; // or temp2
            if(temp1 == null) temp1 = headB;
            if(temp2 == null) temp2 = headA;
            }
        return temp1; // or temp2
    }
}