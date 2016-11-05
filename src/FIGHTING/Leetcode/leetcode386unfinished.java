package FIGHTING.Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by dean on 11/1/2016.
 */
public class leetcode386unfinished {
    public List<Integer> lexicalOrder(int n) {
        int[] nums=new int[n+1];
        for(int i=1;i<=n;i++){
            nums[i]=i;
        }
        int mod=1;
//        int nn=n;
//        while(nn!=0){
//            nn/=10;
//            mod*=10;
//        }
//        mod/=10;
        while(n!=0){
            nums=radixSort(nums,mod);
            mod++;
            n/=10;
        }
        List<Integer> l=new ArrayList<Integer>();
        for(int i=1;i<nums.length;i++){
            l.add(nums[i]);
        }
        return l;
    }
    public int[] radixSort(int[] l,int digitPosition){
        int[] copy=new int[l.length];
        int[] counting=new int[10];
        for(int i=0;i<l.length;i++){
            counting[getNum(l[i],digitPosition)]++;
        }
        for(int i=1;i<counting.length;i++){
            counting[i]=counting[i-1]+counting[i];
        }

        for(int i=l.length-1;i>=0;i--){
            int num=getNum(l[i],digitPosition);

            copy[counting[num]-1]=l[i];
            counting[num]--;
        }
        return copy;
    }
    public int getNum(int num,int n){
        String s=String.valueOf(num);
        if(n>s.length()) return -1;
        else return s.charAt(n-1)-'0';
    }
}
