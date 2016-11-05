package FIGHTING.Leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/**
 * Created by dean on 10/27/2016.
 */
public class leetcode423unfinished {
    HashMap<Character,Integer> m;
    public String originalDigits(String s) {
        char[] c=s.toCharArray();
        m=new HashMap<Character,Integer>();
        int tmp=0;
        for(char ca:c){
            if(m.containsKey(ca)){
                m.replace(ca,m.get(ca)+1);
            }
            else m.put(ca,1);
        }
        List<Integer> l=new ArrayList<>();
        tmp=0;
        while(tmp!=-1){
            tmp=findNum();
            if(tmp==-1) break;
            l.add(tmp);
        }
        l.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        StringBuilder sb=new StringBuilder();
        for(int i:l){
            sb.append(i);
        }
        return sb.toString();
    }
    public int findNum(){
        if(isValid('z')){
            removeNum("zero");
            return 0;
        }
        else if(isValid('w')){
            removeNum("two");
            return 2;
        }
        else if(isValid('u')) {
            removeNum("four");
            return 4;
        }
        else if(isValid('f')&&isValid('i')) {
            removeNum("five");
            return 5;

        }
        else if(isValid('x')) {
            removeNum("six");
            return 6;
        }
        else if(isValid('s')&&isValid('v')) {
            removeNum("seven");
            return 7;
        }
        else if(isValid('g')){
            removeNum("eight");
            return 8;
        }
        else if(isValid('n')&&isValid('i')){
            removeNum("nine");
            return 9;
        }
        else if(isValid('t')&&isValid('r')){
            removeNum("three");
            return 3;
        }
        else if(isValid('o')&&isValid('n')&&isValid('e')){
            removeNum("one");
            return 1;
        }
        return -1;
    }

    public void removeNum(String s){
        for(int i=0;i<s.length();i++){
            m.replace(s.charAt(i),m.get(s.charAt(i))-1);
        }
    }
    public boolean isValid(char c){
        if(m.containsKey(c)&&m.get(c)!=0) return true;
        return false;
    }
}
