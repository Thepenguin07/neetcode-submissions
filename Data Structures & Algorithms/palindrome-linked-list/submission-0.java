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
        ListNode f=head,s=head;
        while(f!=null&&f.next!=null){
            f=f.next.next;
            s=s.next;
        }
        ListNode p=null;
        while(s!=null){
         ListNode t=s.next;
         s.next=p;
        p=s;
        s=t;
        }
        ListNode l=head;
        while(p!=null){
            if(p.val!=l.val)return false;
            p=p.next;
            l=l.next;
        }
        return true;
    }
}