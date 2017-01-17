package FIGHTING.Leetcode.String;

/**
 * Created by Yiding Liu on 1/16/2017.
 */
public class leetcode6 {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<numRows;i++){
            for(int j=i;j<s.length();){
                sb.append(s.charAt(j));
                if(i!=0&&i!=numRows-1){
                    if(j+2*numRows-2-2*i<s.length()){
                        sb.append(s.charAt(j+2*numRows-2-2*i));
                    }
                }
                j+=2*numRows-2;
            }
        }
        return sb.toString();
    }
}
