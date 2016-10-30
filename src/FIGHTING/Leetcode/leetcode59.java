package FIGHTING.Leetcode;

/**
 * Created by yliu224 on 10/30/16.
 */
public class leetcode59 {
    int cnt=1;
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int rrow=0,rs=0,re=n-1;
        int bcolumn,bs=0,be=0;
        int lrow,ls=0,le=0;
        int tcolumn,ts=0,te=0;
        while(true){
            if(rs>re) break;
            toRight(rrow,rs,re,matrix);
            bcolumn=re;bs=rrow+1;be=n-1-rrow;

            if(bs>be) break;
            toBottom(bcolumn,bs,be,matrix);
            lrow=be;ls=bcolumn-1;le=n-1-bcolumn;

            if(ls<le) break;
            toLeft(lrow,ls,le,matrix);
            tcolumn=le;ts=lrow-1;te=n-1-ts;

            if(ts<te) break;
            toTop(tcolumn,ts,te,matrix);
            rrow=te;rs=tcolumn+1;re=n-1-rs;
        }
        return matrix;
    }
    public void toRight(int row,int start,int end,int[][] matrix){
        for(int i=start;i<=end;i++){
            matrix[row][i]=cnt++;
        }
    }
    public void toLeft(int row,int start,int end,int[][] matrix){
        for(int i=start;i>=end;i--){
            matrix[row][i]=cnt++;
        }
    }
    public void toTop(int column,int start,int end,int[][] matrix){
        for(int i=start;i>=end;i--) matrix[i][column]=cnt++;
    }
    public void toBottom(int column,int start,int end,int[][] matrix){
        for(int i=start;i<=end;i++) matrix[i][column]=cnt++;
    }
}
