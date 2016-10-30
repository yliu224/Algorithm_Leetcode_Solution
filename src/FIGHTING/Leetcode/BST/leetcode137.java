package FIGHTING.Leetcode.BST;

import FIGHTING.DataStructure.TreeNode;

import java.util.Stack;

/**
 * Created by yliu224 on 10/29/16.
 */
public class leetcode137 {
    Stack<TreeNode> s;
    public leetcode137(TreeNode root) {
        s=new Stack<TreeNode>();
        findLeftMost(root);
    }
//    public BSTIterator(TreeNode root) {
//        s=new Stack<TreeNode>();
//        findLeftMost(root);
//    }
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !s.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode n=s.pop();
        findLeftMost(n.right);
        return n.val;
    }
    private void findLeftMost(TreeNode node){
        while(node!=null){
            s.push(node);
            node=node.left;
        }
    }
}
