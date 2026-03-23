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
    public ListNode middleNode(ListNode head) {

        
        /* ListNode SlowPointer = head;
        ListNode FastPointer = head;

        while(FastPointer != null && FastPointer.next != null){
            SlowPointer = SlowPointer.next;
            FastPointer = FastPointer.next.next;
        }
        return SlowPointer;  // if linkedlist have odd no of element then SlowPointer returns middle node. 
        // and if linkedlist have even no of elements then SlowPointer will return second middle node.*/

    /* ListNode temp = head;
        int count = 0;
        if(head != null)
        count++;

        while(temp.next != null){
            count++;
            temp = temp.next;
        }

        temp = head;
        int t = count/2;
        if(count%2 == 0){
       while(t > 0){
        temp = temp.next;
        t--;
       }

        }
        if(count%2 !=  0){
         while(t > 0){
             temp = temp.next;
             t--;
       }
        }
        return temp;*/

     ListNode MiddleNodeTracker = head;
     int Count = 0;
     while(head != null){
        if(Count % 2 == 1) MiddleNodeTracker = MiddleNodeTracker.next;
        Count++;
        head = head.next;
     }
     return MiddleNodeTracker;
    }
}



