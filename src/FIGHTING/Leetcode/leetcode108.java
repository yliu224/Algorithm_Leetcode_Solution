package FIGHTING.Leetcode;

import FIGHTING.DataStructure.TreeNode;

/**
 * Created by yliu224 on 10/23/16.
 */
public class leetcode108 {
}
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return CreatTree(0,nums.length-1,nums);
    }
    public TreeNode CreatTree(int l,int r,int[] nums){
        if(l<=r){
            int m=(l+r)/2;
            TreeNode node=new TreeNode(nums[m]);
            node.left=CreatTree(l,m-1,nums);
            node.right=CreatTree(m+1,r,nums);
            return node;
        }
        return null;
    }
}
