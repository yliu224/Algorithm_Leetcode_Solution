package FIGHTING.Leetcode.BitManipulation;

/**
 * Created by yliu224 on 10/23/16.
 */
public class leetcode137 {
    public int singleNumber(int[] nums) {
        int ans=0,sum=0;;
        for(int i=0;i<32;i++){
            sum=0;
            for(int j=0;j<nums.length;j++){
                if(((nums[j]>>i)&1)==1){
                    sum++;
                    sum%=3;
                }
            }
            ans|=sum<<i;//sum must be 1 or 0!!!
        }
        return ans;
    }
}
