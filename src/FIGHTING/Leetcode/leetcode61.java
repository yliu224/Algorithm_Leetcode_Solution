package FIGHTING.Leetcode;

import FIGHTING.DataStructure.ListNode;

/**
 * Created by dean on 1/18/17.
 */
public class leetcode61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return head;
        ListNode tail=head;

        int len=0;
        while(tail.next!=null){
            tail=tail.next;
            len++;
        }
        tail.next=head;
        k=k%len;
        int steps=len-k;
        while(steps>0){
            steps--;
            head=head.next;
        }
        ListNode newHead=head.next;
        head.next=null;

        return newHead;

    }
}
