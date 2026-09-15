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
    public ListNode insertionSortList(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode t=head;
        while(t!=null){
            arr.add(t.val);
            t=t.next;
        }
        Collections.sort(arr);
        ListNode c=head;
        for(int n:arr){
           c.val=n;
           c=c.next;
        }return head;
    }
}