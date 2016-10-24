package FIGHTING;

import FIGHTING.DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by dean on 10/14/2016.
 */
public class BuildHelper {
    public static TreeNode CreateTreeNode(String s){
        return null;
    }
    public static int[] CreateIntArray(String s){
        List<Integer> l=new ArrayList<>();
        Pattern p=Pattern.compile("(\\d+)[,\\]]");
        Matcher m=p.matcher(s);
        while(m.find()){
            l.add(Integer.parseInt(m.group(1)));
        }
        int[] output=new int[l.size()];
        for(int i=0;i<l.size();i++){
            output[i]=l.get(i);
        }
        return output;
    }
}
