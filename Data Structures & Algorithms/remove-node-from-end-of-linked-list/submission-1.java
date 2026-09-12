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
    public ListNode removeNthFromEnd(ListNode head, int n) {
  if(head==null)return head;
  ListNode r=head;
  int l=1;
  while(r.next!=null){
    r=r.next;
    l++;
  }
  if(l==n)return head.next;
int k=l-n;
if(l==1&&k==0)return null;
ListNode t=head;
while(t!=null){
    if(k==1){
        t.next=t.next.next;
       break;
    }
    t=t.next;
    k--;
}
return head;
    }
}
