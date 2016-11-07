package FIGHTING.Leetcode.Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yliu224 on 11/7/2016.
 */
public class leetcode77 {
    List<Integer> l;
    List<List<Integer>> ll;
    public List<List<Integer>> combine(int n, int k) {
        l=new ArrayList<>();
        ll=new ArrayList<>();

        backTracking(1,n,k);

        return ll;
    }
    public void backTracking(int index,int n,int k){
        if(l.size()==k){
            List<Integer> output=new ArrayList<Integer>();
            for(int i:l){
                output.add(i);
            }
            ll.add(output);
            return;
        }
        if(index>n){
            return;
        }
        for(int i=index;i<=n;i++){
            l.add(i);
            backTracking(i+1,n,k);
            l.remove(l.size()-1);
        }
    }
}
