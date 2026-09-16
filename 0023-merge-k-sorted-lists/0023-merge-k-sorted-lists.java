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

        ListNode merge(ListNode h1,ListNode h2){
            if(h1==null && h2==null){
                return null;
            }
            if(h1==null){
                return h2;
            }
            if(h2==null){
                return h1;
            }

            ListNode d=new ListNode(-1);
            ListNode ref=d;
            
            // if(h1.val<h2.val){
            //     ref.next=h1;
            //     h1=h1.next;
            // }
            // else{
            //     ref.next=h2;
            //     h2=h2.next;
            // }
            // ref=ref.next;


           // ListNode t1=h1,t2=h2;

            while(h1!=null && h2!=null){
                if(h1.val < h2.val){
                    ref.next=h1;
                    h1=h1.next;
                }
                else{
                    ref.next=h2;
                    h2=h2.next;
                }
                ref=ref.next;
            }
            if(h1!=null){
                ref.next=h1;

            }
            if(h2!=null){
                ref.next=h2;
            }
            return d.next;
        }

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        ListNode head=lists[0];
        for(int i=1;i<lists.length;i++){
            head=merge(head,lists[i]);
        }
        return head;
       
}
}