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

   static  ListNode rotate(ListNode head){
        if(head==null){return null;}

        ListNode prev=null;
        while(head!=null){
            ListNode temp=head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }
        return prev;
    }
    static int length(ListNode head){
        int len=0;
        while(head!=null){
            len++;
            head=head.next;
        }
        return len;
        
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;
        }
     

        int n=length(head);
        k=k%n;
        if(k==0){
            return head;
        }
        ListNode revhead=rotate(head);
        ListNode end=revhead;
        

        for(int i=1;i<k;i++){
            end=end.next;
        }
        ListNode secondhead=end.next;
        end.next=null;

         revhead=rotate(revhead);

         secondhead=rotate(secondhead);

         end=revhead;

         while(end.next!=null){
            end=end.next;
         

         }
         end.next=secondhead;
         
         return revhead;

    }
}