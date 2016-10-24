package FIGHTING.DP;

/**
 * Created by dean on 10/24/2016.
 */
public class leetcode121 {
    public int maxProfit(int[] prices) {
        if(prices.length<2) return 0;
        if(prices.length==2) return prices[1]-prices[0]<0?0:prices[1]-prices[0];
        int[] Change=new int[prices.length];
        Change[0]=0;
        for(int i=1;i<prices.length;i++){
            Change[i]=prices[i]-prices[i-1];
        }
        int[] r=new int[prices.length];
        r[0]=0;r[1]=Change[1];
        for(int i=2;i<r.length;i++){
            r[i]=Math.max(Change[i],Change[i]+r[i-1]);
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<r.length;i++){
            if(r[i]>max){
                max=r[i];
            }
        }
        if(max<0) return 0;
        else return max;
    }
}
