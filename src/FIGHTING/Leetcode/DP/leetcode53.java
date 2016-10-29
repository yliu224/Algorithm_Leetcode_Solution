package FIGHTING.Leetcode.DP;

/**
 * Created by yliu224 on 10/29/16.
 */
public class leetcode53 {
    public int maxSubArray(int[] nums) {
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        int max=dp[0];
        for(int i=1;i<nums.length;i++){
            dp[i]=Math.max(nums[i],dp[i-1]+nums[i]);
            if(dp[i]>max) max=dp[i];
        }
        return max;
    }
}
