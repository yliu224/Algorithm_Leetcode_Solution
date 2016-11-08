package FIGHTING.Leetcode.String;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yliu224 on 11/7/2016.
 */
public class leetcode3 {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals("")) return 0;
        //int[] ch=new int[50];
        Map<Character,Boolean> ch=new HashMap<>();
        char[] c=s.toCharArray();
        int max=-1,cnt=0;
        int i=0,j=0;
        for(i=0,j=0;j<c.length;j++){
            if(!ch.containsKey(c[j])){
                cnt++;
                ch.put(c[j],true);
            }
            else if(ch.get(c[j])==false){
                cnt++;
                ch.replace(c[j],true);

            }
            else{
                while(i<j){
                    if(c[i]==c[j]) break;
                    cnt--;
                    ch.replace(c[i],false);
                    i++;
                }
                i++;//be careful!!!!!!!!!
            }
            if(cnt>max) max=cnt;
        }
        return max;
    }
}

