package FIGHTING;

import FIGHTING.DataStructure.ListNode;
import FIGHTING.DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by dean on 10/14/2016.
 */
public class BuildHelper {
    private static final String REGEX_INTEGERS="(\\d+)[,\\]]";
    public static TreeNode CreateTreeNode(String s){
        return null;
    }

    /**
     * return an integer array
     * @param s the input should be [1,2,3]
     * @return
     */
    public static int[] CreateIntArray(String s){
        List<Integer> l=new ArrayList<>();
        Pattern p=Pattern.compile(REGEX_INTEGERS);
        Matcher m=p.matcher(s);
        while(m.find()){
            l.add(Integer.parseInt(m.group(1)));
        }
        int[] output=new int[l.size()];
        for(int i=0;i<l.size();i++){
            output[i]=l.get(i);
        }
        return output;
    }

    /**
     * return a link list
     * @param s the input should be [1,2,3]
     * @return
     */
    public static ListNode CreateListNode(String s){
        ListNode l=new ListNode(0);
        ListNode head=l;
        Pattern p=Pattern.compile(REGEX_INTEGERS);
        Matcher m=p.matcher(s);
        while(m.find()){
            l.next=new ListNode(Integer.parseInt(m.group(1)));
            l=l.next;
        }
        return head.next;
    }
}
