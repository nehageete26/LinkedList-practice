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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Pair<Integer,ListNode>> minHeap = new PriorityQueue<>((a, b) -> a.getKey() - b.getKey());
        for(int i=0;i<lists.length;i++){
            if(lists[i] != null) minHeap.add(new Pair<>(lists[i].val,lists[i]));
        }
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(!minHeap.isEmpty()){
            Pair<Integer, ListNode> pair = minHeap.poll();
            ListNode node = pair.getValue();
            if(node.next != null){
                minHeap.add(new Pair<>(node.next.val, node.next));
            }
            temp.next = node;
            temp = temp.next;
        }
        return dummy.next;
    }
}