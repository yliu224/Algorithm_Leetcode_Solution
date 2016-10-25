package FIGHTING.Leetcode.LinkList;

import FIGHTING.DataStructure.ListNode;

/**
 * Created by dean on 10/24/2016.
 */
public class leetcode2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean carry=false;
        ListNode node1=l1,node2=l2;
        ListNode output=new ListNode(0);
        ListNode outputHead=output;
        int tmp;
        while(l1!=null&&l2!=null){
            carry=calculate(l1.val+l2.val,carry,output);
            output=output.next;//you can change the object which is pointed by the reference(output),but you can't change the reference(output) itself
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            carry=calculate(l1.val,carry,output);
            l1=l1.next;
        }
        while(l2!=null){
            carry=calculate(l2.val,carry,output);
            l2=l2.next;
        }

        if(carry){
            output.next=new ListNode(1);
        }
        return outputHead.next;
    }
    public boolean calculate(int tmp,boolean carry,ListNode output){
        if(carry) tmp++;
        if(tmp>=10){
            carry=true;
            tmp-=10;
        }
        else{
            carry=false;
        }
        output.next=new ListNode(tmp);
        return carry;
    }
}
