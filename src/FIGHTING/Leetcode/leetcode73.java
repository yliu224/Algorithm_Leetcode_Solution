package FIGHTING.Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yliu224 on 10/31/16.
 */
public class leetcode73 {//try space O(1)!!
    public void setZeroes(int[][] matrix) {
        List<Integer> rows=new ArrayList<Integer>();
        List<Integer> columns=new ArrayList<Integer>();

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    columns.add(j);
                }
            }
        }

        for(int i:rows){
            setRow(i,matrix);
        }
        for(int j:columns){
            setColumn(j,matrix);
        }

    }
    public void setRow(int index,int[][] matrix){
        for(int i=0;i<matrix[0].length;i++){
            matrix[index][i]=0;
        }
    }
    public void setColumn(int index,int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            matrix[i][index]=0;
        }
    }
}
