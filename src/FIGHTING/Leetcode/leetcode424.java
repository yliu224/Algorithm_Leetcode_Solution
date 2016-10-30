package FIGHTING.Leetcode;

/**
 * Created by yliu224 on 10/30/16.
 */
public class leetcode424 {
    public int characterReplacement_my(String s, int k) {//My solution
        int max=0,start=0,i,cnt,kk;
        char ch;
        char[] c=s.toCharArray();
        while(start<c.length-1){
            ch=c[start];
            cnt=0;
            for(i=start,kk=k;i<c.length;i++){
                if(ch==c[i]) cnt++;
                else{
                    if(k==0) start=i;//edge case
                    if(kk==0) break;
                    else{
                        kk--;
                        cnt++;
                    }
                    if(kk==k-1) start=i;
                }
            }
            if(kk!=0) cnt+=kk;//edge case
            if(max<cnt) max=cnt;
            if(i==c.length) break;
        }
        return max>c.length?c.length:max;//edge case
    }
    public int characterReplacement(String s,int k){//slide window
        int max=0,    //the max number of the same character in the window
            start=0,  //the start index of the window
            end=0,    //the end index of the window
            maxLength=0;
        int[] charCnt=new int[26];
        while(end<s.length()){
            max=Math.max(max,++charCnt[s.charAt(end)-'A']);
            while(end-start+1>max+k){
                charCnt[s.charAt(start)]--;
                start++;
            }
            maxLength=Math.max(maxLength,end-start+1);
        }
        return maxLength;
    }
}
