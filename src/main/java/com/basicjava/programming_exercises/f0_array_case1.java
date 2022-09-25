package com.basicjava.programming_exercises;

/**
 * 求最值
 */
public class f0_array_case1 {
    public static void main(String[] args) {

        //1、求最大值
        int[] arr={23,56,2343,87,8,1,33,787,9,23434,8,8,1};
        int max=arr[0];

        for (int i = 1; i < arr.length ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("数组的最大值是："+max);

    }
}


