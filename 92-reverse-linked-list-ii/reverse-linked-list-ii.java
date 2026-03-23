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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode DummyNode = new ListNode(0);
        DummyNode.next = head;
        ListNode Prev = DummyNode;
        int i = 1;
        while(i < left){
            Prev = Prev.next;
            i++;
        }
        ListNode Curr = Prev.next;
        int j = 0;
        while(j < (right-left)){
            ListNode Nxt = Curr.next;
            Curr.next = Nxt.next;
            Nxt.next = Prev.next;
            Prev.next = Nxt;
            j++;
        }
        return DummyNode.next;
    }
}