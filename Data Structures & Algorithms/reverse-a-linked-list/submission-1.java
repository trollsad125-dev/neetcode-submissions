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
    public ListNode reverseList(ListNode head) {
        return reverseListRecursion(head,null);

    }

    public ListNode reverseListRecursion(ListNode head,ListNode prev){
        
        if(head != null){
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            return reverseListRecursion(temp,prev);
        }
        return prev;
    }
}
