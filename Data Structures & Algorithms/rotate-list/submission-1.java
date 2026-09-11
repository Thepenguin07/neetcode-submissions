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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)return null;
        ListNode z=head;
        int l=1;
        while(z.next!=null){
            z=z.next;
            l++;
        }
        k=k%l;
        if(k==0)return head;
        k=l-k;
        ListNode h=head,t=head,r=null;
        while(h!=null){
            k--;
            if(k==0){
               r=h.next;
                h.next=null;
                break;
            }
            h=h.next;
        }
         ListNode newhead=r;
        while(r.next!=null){
            r=r.next;
        }
        r.next=t;
        return newhead;
    }
}