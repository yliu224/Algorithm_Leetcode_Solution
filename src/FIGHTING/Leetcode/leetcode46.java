package FIGHTING.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by dean on 10/23/2016.
 */
public class leetcode46 {
    List<List<Integer>> ll;
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l.add(nums[i]);
        }
        ll=new ArrayList<List<Integer>>();
        backtracking(l,new ArrayList<Integer>());
        return ll;
    }
    public void backtracking(List<Integer> l,List<Integer> output){
        if(l.size()==0){
            List<Integer> o=new ArrayList<>(output.size());
            for(Integer i:output){
                o.add(i);
            }
            ll.add(o);
            return ;
        }
        int tmp=0;
        for(int i=0;i<l.size();i++){
            tmp=l.get(i);
            l.remove(i);
            output.add(tmp);
            backtracking(l,output);
            output.remove(output.size()-1);
            l.add(i,tmp);
        }
    }
}
