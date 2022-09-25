package com.basicjava.programming_exercises;

/**
 * 找素数
 */
public class f2_find_prime_number {
    public static void main(String[] args) {
        /**
         * 判断101-200有多少个素数，并输出所有素数
         * 素数：如果除了1和它本身以外，不能被其他的正整数整除，就叫做素数
         * 判断规则：从2开始遍历到该数的一半的数据，看是否有数据可以整除它，有则不是素数，没有则是素数
         */

        //1、定义一个循环，找到101-200之间的全部数据
        for (int i = 101; i <= 200; i++) {

            //信号位：标记
            boolean flog=true;

            //2、判断当前遍历的这个数据是否是素数
            for (int j = 2; j <i/2 ; j++) {
                if(i%j==0){
                    flog=false;
                    break;
                }
            }
            //3、根据判定结果选择是否输出这个数据，是素数就输出
            if(flog){
                System.out.print(i+"\t");
            }
        }
    }
}
