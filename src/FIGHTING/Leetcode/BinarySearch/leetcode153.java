package FIGHTING.Leetcode.BinarySearch;

/**
 * Created by yliu224 on 10/29/16.
 */
public class leetcode153 {
    public int findMin(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.min(nums[0],nums[1]);
        int l=0,r=nums.length-1,m;
        while(l<r){
            if((r-l)==1) return Math.min(nums[l],nums[r]);//details!!!
            m=(l+r)/2;
            if(nums[l]<nums[r]) return nums[l];
            else if(nums[m]>nums[l]) l=m;//details!!!
            else if(nums[m]<nums[r]) r=m;//details!!!
        }
        return nums[l];
    }
}
