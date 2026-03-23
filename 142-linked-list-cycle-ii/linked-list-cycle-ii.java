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
      ListNode Slow = head;
      ListNode Fast = head;

      while(Fast != null && Fast.next != null){
        Slow = Slow.next;
        Fast = Fast.next.next;

        if(Slow == Fast){
            Slow = head;
            while(Slow != Fast){
                Slow = Slow.next;
                Fast = Fast.next;
            }
            return Slow;
        }
      }  
      return null;
    }
}