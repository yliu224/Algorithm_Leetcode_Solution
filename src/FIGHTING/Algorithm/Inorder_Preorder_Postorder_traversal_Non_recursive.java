package FIGHTING.Algorithm;

import FIGHTING.DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by dean on 10/14/2016.
 */
public class Inorder_Preorder_Postorder_traversal_Non_recursive {
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> l=new ArrayList<>();
        Stack<TreeNode> s=new Stack<>();
        TreeNode node=root;

        while(node!=null||!s.isEmpty()){
            while(node!=null){
                s.push(node);

                node=node.left;
            }
            node=s.pop();
            l.add(node.val);//Difference
            node=node.right;

        }
        return l;
    }
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> l=new ArrayList<>();
        Stack<TreeNode> s=new Stack<>();
        TreeNode node=root;

        while(node!=null||!s.isEmpty()){
            while(node!=null){
                s.push(node);
                l.add(node.val);//Difference
                node=node.left;
            }
            node=s.pop();

            node=node.right;

        }
        return l;
    }
    public List<Integer> postorderTraversal(TreeNode root){
        TreeNode node=root;
        Stack<TreeNode> s=new Stack<TreeNode>();
        List<Integer> l=new ArrayList<>();

        while(node!=null||!s.isEmpty()){
            while(node!=null){
                l.add(0,node.val);
                s.push(node);
                node=node.right;
            }
            node=s.pop();
            node=node.left;
        }
        return l;
    }
}
