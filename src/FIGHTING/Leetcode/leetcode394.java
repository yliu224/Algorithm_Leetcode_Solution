package FIGHTING.Leetcode;

import java.util.Stack;

/**
 * Created by yliu224 on 10/23/16.
 */
public class leetcode394 {
    public String decodeString(String s) {
        char[] c=s.toCharArray();
        Stack<Integer> sno=new Stack<>();
        Stack<StringBuilder> ss=new Stack<>();
        StringBuilder output=new StringBuilder();
        StringBuilder sbtemp=null;
        int cnt=0;

        for(Character ch:c){
            if(ch>='0'&&ch<='9'){
                if(sno.size()>ss.size()){
                    int no=sno.pop();
                    no=no*10+(ch-'0');
                    sno.push(no);
                }
                else{
                    sno.push(ch-'0');
                }
            }
            else if(ch=='['){
                ss.push(new StringBuilder());
            }
            else if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
                if(sno.isEmpty()&&ss.isEmpty()) output.append(ch);
                else{
                    ss.peek().append(ch);
                }
            }
            else if(ch==']'){
                sbtemp=ss.pop();
                cnt=sno.pop();
                if(!ss.isEmpty()){
                    for(int i=0;i<cnt;i++){
                        ss.peek().append(sbtemp);
                    }
                }
                else{
                    for(int i=0;i<cnt;i++){
                        output.append(sbtemp);
                    }
                }
            }
        }
        return output.toString();
    }
}