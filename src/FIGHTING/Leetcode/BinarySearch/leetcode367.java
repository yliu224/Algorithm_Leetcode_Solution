package FIGHTING.Leetcode.BinarySearch;

/**
 * Created by dean on 11/1/2016.
 */
public class leetcode367 {
    public boolean isPerfectSquare(int num) {
        long l=0,r=num;//LONG!!!! trap!!!!!
        long m;
        while(l<r){
            m=l/2+r/2;
            long p=m*m;
            if(p>num){
                r=m-1;
            }
            else if(p<num){
                l=m+1;
            }
            else return true;
        }
        if(l*l==num) return true;
        else return false;
    }
}
