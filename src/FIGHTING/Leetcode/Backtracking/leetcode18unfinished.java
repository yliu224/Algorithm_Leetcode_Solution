package FIGHTING.Leetcode.Backtracking;

import java.util.*;

/**
 * Created by yliu224 on 10/31/16.
 */
public class leetcode18unfinished {//unfinished!!!!!
    List<List<Integer>> l;
    Set<String> set;
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        set=new TreeSet<>();
        l=new ArrayList<List<Integer>>();
        List<Integer> output=new ArrayList<Integer>();

        for(int i=0;i<nums.length;i++){
            if(i!=0&&nums[i]==nums[i-1]) continue;
            output.add(nums[i]);
            backTracking(i+1,nums,target,output);
            output.remove(output.size()-1);
        }


        return l;
    }
    public void backTracking(int start,int[] nums,int target,List<Integer> output){
        if(output.size()==4){
            StringBuilder sb=new StringBuilder();
            List<Integer> a=new ArrayList<>();
            int sum=0;
            for(int i:output){
                sum+=i;
                sb.append(i);
                a.add(i);
            }
            if(sum==target&&!set.contains(sb.toString())){
                l.add(a);
                set.add(sb.toString());
            }

            return ;
        }
        //if(nums.length-start<4) return;
        for(int i=start;i<nums.length;i++){
            output.add(nums[i]);
            backTracking(i+1,nums,target,output);
            output.remove(output.size()-1);
        }
    }
}
