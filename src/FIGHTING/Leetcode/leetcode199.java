package FIGHTING.Leetcode;

import FIGHTING.DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yliu224 on 10/30/16.
 */
public class leetcode199 {
    //find out every case before coding!!
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null) return new ArrayList<>();
        List<Integer> l=new ArrayList<Integer>();
        findNode(root,1,l);
        return l;
    }
    public void findNode(TreeNode root, int level, List<Integer> l){
        if(root==null) return;
        if(level>l.size()){
            l.add(root.val);
        }
        findNode(root.right,level+1,l);
        findNode(root.left,level+1,l);
    }
}
