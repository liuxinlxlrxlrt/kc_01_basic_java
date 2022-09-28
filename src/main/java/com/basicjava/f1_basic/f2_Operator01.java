package com.basicjava.f1_basic;

public class f2_Operator01 {
    public static void main(String[] args) {
        int k = 3;
        int p = 5;
        //k  3  4      5                 4
        //p  5                4    3           4
        //rs    3      5      4    4     5     4
        int rs = k++ + ++k - --p + p-- - k-- + ++p + 2;
        System.out.println(k);  //4
        System.out.println(p);   //4
        System.out.println(rs);   //9
    }
}
