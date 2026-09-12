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
    public int pairSum(ListNode head) {
        if(head==null)return -1;
        ListNode f=head.next,s=head;
        while(f!=null&&f.next!=null){
            f=f.next.next;
            s=s.next;
        }
        ListNode p=null,curr=s.next;
        s.next=null;
        while(curr!=null){
            ListNode t=curr.next;
            curr.next=p;
            p=curr;
            curr=t;
        }
        int max=Integer.MIN_VALUE;
        ListNode z=head;
        while(p!=null){
          max=Math.max(max,p.val+z.val);
          p=p.next;
          z=z.next;
        }
return max;
    }
}