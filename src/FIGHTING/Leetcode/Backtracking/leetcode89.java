package FIGHTING.Leetcode.Backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dean on 10/24/2016.
 */
public class leetcode89 {
    boolean isReturn=false;
    public List<Integer> grayCode(int n) {
        List<Integer> l=new ArrayList<Integer>();
        Map<Integer,Boolean> nums=new HashMap<>();
        nums.put(0,true);
        l.add(0);
        //if(n==0) return l;
        int[] powers=new int[n];
        powers[0]=1;
        for(int i=1;i<n;i++){
            powers[i]=powers[i-1]<<1;
        }


        backtracking(n,nums,powers,l);
        return l;
    }
    public void backtracking(int n,Map<Integer,Boolean> nums,int[] powers,List<Integer> l){
        if(l.size()==powers[powers.length-1]<<1){
            isReturn=true;
            return ;
        }
        int tmp=0;
        for(int i=0;i<powers.length;i++){
            tmp=l.get(l.size()-1)^powers[i];
            if(!nums.containsKey(tmp)){
                l.add(tmp);
                nums.put(tmp,true);

                backtracking(n,nums,powers,l);
                if(isReturn) return;

                l.remove(l.size()-1);
                nums.remove(tmp);
            }

        }
    }
}
