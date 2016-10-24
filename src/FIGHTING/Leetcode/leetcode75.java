package FIGHTING.Leetcode;

/**
 * Created by dean on 10/24/2016.
 */
public class leetcode75 {
    public void sortColors(int[] nums) {
        if(nums.length<=1) return;
        if(nums.length==2){
            if(nums[0]>nums[1]) swap(nums,0,1);
            return ;
        }
        int zero=0,one=1,two=nums.length-1;

        while(one<two){
            if(zero==one) one++;
            if(nums[one]==2){
                if(nums[two]!=2) swap(nums,one,two);
                else two--;
            }
            else if(nums[one]==0){
                if(nums[zero]!=0) swap(nums,one,zero);
                else zero++;
            }
            else{
                if(nums[two]==0){
                    if(nums[zero]==0) swap(nums,one,two);
                    else swap(nums,zero,two);
                }
                else if(nums[two]==1&&nums[zero]==2){
                    swap(nums,zero,two);
                }
                else if(nums[two]==2&&nums[zero]==2){
                    swap(nums,zero,one);
                }
                one++;
            }
        }
    }
    private void swap(int[] nums,int one,int two){
        int tmp=nums[one];
        nums[one]=nums[two];
        nums[two]=tmp;
    }
}
