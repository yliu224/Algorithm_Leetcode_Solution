package FIGHTING.Leetcode.BinarySearch;

/**
 * Created by yliu224 on 10/30/16.
 */
public class leetcode74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int index=0,gap=0,min=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            gap=target-matrix[i][0];
            if(gap>=0&&gap<min){
                min=gap;
                index=i;
            }
        }
        int l=0,r=matrix[0].length-1;
        int m;
        while(l<r){
            m=(l+r)/2;
            if(matrix[index][m]>target){
                r=m-1;
            }
            else if(matrix[index][m]<target){
                l=m+1;
            }
            else return true;
        }
        if(matrix[index][l]==target) return true;
        else return false;
    }
}
