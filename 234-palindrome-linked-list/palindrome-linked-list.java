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
    public boolean isPalindrome(ListNode head) {
        ListNode Slow = head;
        ListNode Fast = head;

        while(Fast != null && Fast.next != null){
            Slow = Slow.next;   // iske pass mid node hai
            Fast = Fast.next.next;
        }

        ListNode Prev = null;

        while(Slow != null){
            ListNode NextP = Slow.next;
            Slow.next = Prev;
            Prev = Slow;    // It will be head for right linkedllist at end of loop.
            Slow = NextP;
        }
        ListNode Dummy = head;
        while(Prev  != null){
            if(Dummy.val != Prev.val) return false;
            Dummy = Dummy.next;
            Prev = Prev.next;
        }
        return true;
    }
}