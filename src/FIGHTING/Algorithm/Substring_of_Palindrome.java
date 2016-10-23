package FIGHTING.Algorithm;

/**
 * Created by dean on 9/27/2016.
 */
public class Substring_of_Palindrome {
    private String s;
    public Substring_of_Palindrome(String s){
        this.s=s;
    }

    public String findPalidrome(){
        char[] sAscending=this.s.toCharArray();
        char[] sDescending=new char[sAscending.length];

        for(int i=0,j=sAscending.length-1;i<sAscending.length;i++,j--){
            sDescending[j]=sAscending[i];
        }
        int[][] table=new int[sAscending.length+1][sDescending.length+1];

        for(int i=1;i<=sAscending.length;i++){
            for(int j=1;j<=sDescending.length;j++){
                if(sAscending[i-1]==sDescending[j-1]) table[i][j]=table[i-1][j-1]+1;
                else{
                    table[i][j]=Math.max(table[i-1][j],table[i][j-1]);
                }
            }
        }

        return findLCS(table,sAscending,sDescending);
    }
    public String findLCS(int[][] table,char[] a,char[] b){
        int i=table.length-1,j=table.length-1;
        StringBuilder sb=new StringBuilder();
        while(i>0&&j>0){
            if(a[i-1]==b[j-1]){
                sb.append(a[i-1]);
                i--;j--;
            }
            else {
                if(table[i-1][j]>table[i][j-1]){
                    i--;
                }
                else{
                    j--;
                }
            }
        }
        return sb.toString();
    }
}
