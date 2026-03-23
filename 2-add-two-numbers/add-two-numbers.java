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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy1 = l1;
        ListNode dummy2 = l2;
        ListNode head = null;
        ListNode tail = null;
        int carry = 0;
        int sum = 0;

        while(dummy1 != null || dummy2 != null || carry != 0){
            sum = carry;
            if(dummy1 != null){
                sum+=dummy1.val;
                dummy1 = dummy1.next;
            }
            if(dummy2 != null){
                sum+=dummy2.val;
                dummy2 = dummy2.next;
            }
            carry = sum/10;
            int res = sum%10;
            ListNode newNode = new ListNode(res);
            if(tail == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = tail.next;
            }
        }
          return head;
    }
}