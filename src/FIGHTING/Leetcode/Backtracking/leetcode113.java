package FIGHTING.Leetcode.Backtracking;

import FIGHTING.DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Yiding Liu on 1/16/2017.
 */
public class leetcode113 {
    private List<List<Integer>> ll;
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        ll=new ArrayList<List<Integer>>();
        Stack<Integer> s=new Stack<>();
        if(root==null) return ll;
        DFS(s,root,0,sum);
        return ll;
    }

    public void DFS(Stack<Integer> s,TreeNode node,int sum,int obj){
        boolean isLeaf=true;

        sum+=node.val;
        s.push(node.val);
        if(node.left!=null){
            DFS(s,node.left,sum,obj);
            isLeaf=false;
        }
        if(node.right!=null){
            DFS(s,node.right,sum,obj);
            isLeaf=false;
        }
        if(sum==obj&&isLeaf){
            List<Integer> cp=new ArrayList<>();
            for(Integer i:s){
                cp.add(i);
            }
            ll.add(cp);
        }
        s.pop();
    }
}
