package FIGHTING.Leetcode;

import java.util.*;

/**
 * Created by dean on 10/24/2016.
 */
public class leetcode398 {
    Map<Integer,List<Integer>> ml;
    Random r;
    public leetcode398(int[] nums) {
        ml=new HashMap<Integer,List<Integer>>();
        r=new Random();

        int cnt=0;
        for(Integer i:nums){
            if(!ml.containsKey(i)){
                ml.put(i,new ArrayList<Integer>());
            }
            List<Integer> l=ml.get(i);
            l.add(cnt);
            cnt++;
        }
    }

    public int pick(int target) {
        List<Integer> l=ml.get(target);
        return l.get(r.nextInt(l.size()));
    }
}
