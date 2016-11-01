package FIGHTING.Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yliu224 on 10/31/16.
 */
public class leetcode54 {
    List<Integer> ll;
    public List<Integer> spiralOrder(int[][] matrix) {
        ll=new ArrayList<>();

        int m=matrix.length;

        if(m==0) return ll;
        int n=matrix[0].length;

        int rrow=0,rs=0,re=n-1;
        int bcolumn,bs=0,be=0;
        int lrow,ls=0,le=0;
        int tcolumn,ts=0,te=0;
        while(true){
            if(rs>re) break;
            toRight(rrow,rs,re,matrix);
            bcolumn=re;bs=rrow+1;be=m-1-rrow;

            if(bs>be) break;
            toBottom(bcolumn,bs,be,matrix);
            lrow=be;ls=bcolumn-1;le=n-1-bcolumn;

            if(ls<le) break;
            toLeft(lrow,ls,le,matrix);
            tcolumn=le;ts=lrow-1;te=m-1-ts;

            if(ts<te) break;
            toTop(tcolumn,ts,te,matrix);
            rrow=te;rs=tcolumn+1;re=n-1-rs;
        }
        return ll;
    }
    public void toRight(int row,int start,int end,int[][] matrix){
        for(int i=start;i<=end;i++){
            ll.add(matrix[row][i]);
        }
    }
    public void toLeft(int row,int start,int end,int[][] matrix){
        for(int i=start;i>=end;i--){
            ll.add(matrix[row][i]);
        }
    }
    public void toTop(int column,int start,int end,int[][] matrix){
        for(int i=start;i>=end;i--) ll.add(matrix[i][column]);
    }
    public void toBottom(int column,int start,int end,int[][] matrix){
        for(int i=start;i<=end;i++) ll.add(matrix[i][column]);
    }
}
