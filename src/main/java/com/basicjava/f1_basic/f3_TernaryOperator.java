package com.basicjava.f1_basic;

/**
 * Ternary operator 三元运算符
 */
public class f3_TernaryOperator {
    public static void main(String[] args) {
        /**
         * 需求：定义三个整数，找出最大值并打印在控制台
         */

        //方式一：
        int i = 10;
        int j = 30;
        int k = 50;
        int temp = i > j ? i : j;
        int rsMax = temp > k ? temp : k;
        System.out.println(rsMax);

        System.out.println("-------------------------");
        //方式二
        int rsMax1 = i > j ? (i > k ? i : k) : (j > k ? j : k);
        System.out.println(rsMax1);
    }
}
