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
        ListNode t=head;
        int k=0;
        while(t!=null){
             k++;
             t=t.next;
        }
        ListNode r=head;
        int m=k/2;
            while(r!=null&&m!=0){
                r=r.next;
                m--;
            }
            return r;
    }
}