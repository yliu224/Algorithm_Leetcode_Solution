package FIGHTING.Leetcode.String;

/**
 * Created by yliu224 on 11/7/2016.
 */
public class leetcode3unfinished {
    public int lengthOfLongestSubstring(String s) {
        int[] ch=new int[50];
        char[] c=s.toCharArray();
        int max=-1,cnt=0;
        int i=0,j=0;
        for(i=0,j=0;j<c.length;j++){
            if(ch[c[j]-'a']==0){
                cnt++;
                ch[c[j]-'a']=1;
                if(cnt>max) max=cnt;
            }
            else{
                while(i<j){
                    cnt--;
                    ch[c[i]-'a']=0;
                    i++;
                    if(c[i]==c[j]) break;
                }

            }
        }
        return max;
    }
}

