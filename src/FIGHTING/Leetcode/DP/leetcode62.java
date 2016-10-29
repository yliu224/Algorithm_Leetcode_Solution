package FIGHTING.Leetcode.DP;

/**
 * Created by yliu224 on 10/29/16.
 */
public class leetcode62 {
    public int uniquePaths(int m, int n) {
        int[][] map=new int[m][n];
        map[m-1][n-1]=1;
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i==m-1&&j==n-1) continue;
                if(i+1<m) map[i][j]+=map[i+1][j];
                if(j+1<n) map[i][j]+=map[i][j+1];
            }
        }
        return map[0][0];
    }
}
