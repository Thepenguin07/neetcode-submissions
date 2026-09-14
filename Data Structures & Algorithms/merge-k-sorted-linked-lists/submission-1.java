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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(ListNode t:lists){
            while(t!=null){
                arr.add(t.val);
                t=t.next;
            }
        }
        Collections.sort(arr);
        ListNode r=new ListNode(0);
        ListNode t=r;
        for(int n:arr){
            ListNode t1=new ListNode(n);
            t.next=t1;
            t=t.next;
        }
        return r.next;
    }
    //tle:
    // ListNode merge(ListNode l1,ListNode l2){ 
    //     ListNode d=new ListNode(0);
    //     ListNode merge=d;
    //     while(l1!=null&&l2!=null){
    //         if(l1.val<l2.val)
    //         {
    //             merge.next=l1;
    //             l1=l1.next;
    //         }
    //         else{
    //              merge.next=l2;
    //             l2=l2.next;
    //         }
    //         merge=merge.next;
    //     }
    //     if(l1!=null)merge.next=l1;
    //     if(l2!=null)merge.next=l2;
    //     return d.next;
    // }
}
