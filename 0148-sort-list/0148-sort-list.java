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
 import java.util.Arrays;
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
        return head;
        int count = 0; 
        ListNode temp = head;
        while(temp != null){ 
            count ++; 
            temp = temp.next; 
        } 
        int arr[] = new int[count]; 
        temp = head;
        for(int i=0;i<arr.length;i++){
           arr[i] = temp.val;
           temp = temp.next;
        }
        Arrays.sort(arr);
        temp = head;
        int i = 0; 
        while(temp != null){
            temp.val = arr[i];
             i++; 
             temp = temp.next; 
        } 
        return head;
    }
}