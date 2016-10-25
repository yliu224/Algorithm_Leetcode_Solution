package FIGHTING.Leetcode.DP;

/**
 * Created by dean on 10/24/2016.
 */
public class leetcode122 {
    public int maxProfit(int[] prices) {
        if(prices.length==0) return 0;
        int sum=0;
        //Greedy*********************
        // for(int i=0;i<prices.length-1;i++){
        //     if(prices[i+1]>prices[i]){
        //         sum+=prices[i+1]-prices[i];
        //     }
        // }
        //DP*********************
        int[] c=new int[prices.length];
        c[0]=0;
        for(int i=1;i<prices.length;i++){
            c[i]=prices[i]-prices[i-1];
        }
        int[] dp=new int[prices.length];
        for(int i=1;i<c.length;i++){
            dp[i]=Math.max(dp[i-1]+c[i],dp[i-1]);
        }
        return dp[c.length-1];
    }
}
