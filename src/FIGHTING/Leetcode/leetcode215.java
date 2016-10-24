package FIGHTING.Leetcode;

/**
 * Created by dean on 10/24/2016.
 */
public class leetcode215 {
    int findno=-1;
    public int findKthLargest(int[] nums, int k) {
        if(nums.length==1) return nums[0];
        quicksort(nums,0,nums.length-1,k);
        if(findno==-1) findno=0;
        return nums[findno];
    }
    public void quicksort(int[] nums,int l,int r,int k){
        if(findno!=-1) return ;
        if(l>r) return ;
        int pivot=partition(nums,l,r);
        int position=(pivot-0+1);
        if(position==k){
            findno=pivot;
            return ;
        }
        else if(position>k){
            quicksort(nums,l,pivot-1,k);
        }
        else{
            quicksort(nums,pivot+1,r,k);
        }
    }
    private int partition(int[] nums,int l,int r){
        if(l==r) return l;
        int key=nums[r];
        int end=r;
        r--;
        while(l<r){
            if(nums[l]<key){
                exchange(nums,l,r);
                r--;
            }
            else{
                l++;
            }
        }
        if(nums[l]>=key){
            l++;
        }
        exchange(nums,l,end);
        return l;
    }
    private void exchange(int[] nums,int l,int r){
        int tmp=nums[l];
        nums[l]=nums[r];
        nums[r]=tmp;
    }
}
