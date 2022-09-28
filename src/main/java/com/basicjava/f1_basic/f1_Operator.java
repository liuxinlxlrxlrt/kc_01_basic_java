package com.basicjava.f1_basic;

/**
 * oprater运算符
 */
public class f1_Operator {
    public static void main(String[] args) {
        int c = 10;
        int d = 5;
        // c  10 11  12                       11
        // d  5               4     5
        // rs     10    12    4     5         12
        int rs3 = c++ + ++c - --d - ++d + 1 + c--;

        System.out.println(rs3);  //26
        System.out.println(c);  //11
        System.out.println(d);  //5

    }
}
