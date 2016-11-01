package FIGHTING.Leetcode.BinarySearch;

/**
 * Created by yliu224 on 10/31/16.
 */
public class leetcode240 {
    public boolean searchMatrix(int[][] matrix, int target) {

        for(int i=0;i<matrix.length;i++){
            if(binarySearch(matrix[i],target)) return true;
        }
        return false;
    }

    public boolean binarySearch(int[] matrix,int target){
        int l=0,r=matrix.length-1;
        int m;
        while(l<r){
            m=(l+r)/2;
            if(matrix[m]>target){
                r=m-1;
            }
            else if(matrix[m]<target){
                l=m+1;
            }
            else{
                return true;
            }
        }
        if(matrix[l]==target) return true;
        else return false;
    }
}
