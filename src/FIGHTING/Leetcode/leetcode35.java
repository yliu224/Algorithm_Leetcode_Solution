package FIGHTING.Leetcode;

/**
 * Created by yliu224 on 10/29/16.
 */
public class leetcode35 {
    public int searchInsert(int[] nums, int target) {
        int l=0,r=nums.length-1,mid;
        while(l<r){
            mid=(l+r)/2;
            if(nums[mid]>target){
                r=mid-1;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else {
                return mid;
            }
        }
        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! edge case!!!!!!!!!!!!!!!!!
        if(nums[l]>=target) return l;
        else return l+1;
    }
}
