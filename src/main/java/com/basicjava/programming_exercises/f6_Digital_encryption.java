package com.basicjava.programming_exercises;

import java.util.Scanner;

/**
 * 数字加密
 *
 * 需求：比如1983，采用加密方式进行传输，规则如下：得到每位数，
 * 然后每位数都加上5再对10求余，最后将所有数字进行反转，得到一串新数
 */
public class f6_Digital_encryption {
    public static void main(String[] args) {
        //1、定义一个数组，存入需要加密的数据
        System.out.println("请输入需要加密的数字个数：");
        Scanner sc = new Scanner(System.in);
        int length= sc.nextInt();
        int[] arr = new int[length];

        //输入需要加密的数字
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请你输入加密的第"+(i+1)+"个数字：");
            int number = sc.nextInt();
            arr[i] = number;
        }

        //3、打印数组中内容，看一下
        printArray(arr);

        //4、核心逻辑（对数字中的数据进行加密）arr=[1,9,8,3]
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=(arr[i]+5)%10;
        }

        //5、核心逻辑（对数组中加密的数据进行反转） arr=[6,4,3,8]
        for (int i = 0,j=arr.length-1;i < j; i++ ,j--) {
            //直接交换两者位置的值
            int temp =arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }

        printArray(arr);
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i==arr.length-1? arr[i]:arr[i]+",");
        }
        System.out.println("]");
    }
}
