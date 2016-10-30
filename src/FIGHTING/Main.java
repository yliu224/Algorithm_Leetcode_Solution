package FIGHTING;

import FIGHTING.Leetcode.Backtracking.*;
import FIGHTING.Leetcode.BinarySearch.*;
import FIGHTING.Leetcode.LinkList.*;
import FIGHTING.Leetcode.*;

public class Main {

    public static void main(String[] args) {
        leetcode74 s=new leetcode74();
        s.searchMatrix(BuildHelper.CreateIntMatrix("[[1,   4,  7, 11, 15],[2,   5,  8, 12, 19],[3,   6,  9, 16, 22],[10, 13, 14, 17, 24],[18, 21, 23, 26, 30]]"),
                3);
    }

}
