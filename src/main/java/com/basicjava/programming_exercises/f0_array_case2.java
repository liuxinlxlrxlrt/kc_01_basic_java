package com.basicjava.programming_exercises;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;
import java.util.Scanner;

/**
 *  猜数字
 *
 *  需求：5个1-20的之间的随机数，让用户猜，猜中提示猜中，
 *  还要输出数据在数组中的第一次出现的索引，并打印数组的内容
 */
public class f0_array_case2 {

    public static void main(String[] args) {
        int[] data = new int[5];
        Random r = new Random();
        for (int i = 0; i < data.length ; i++) {
            data[i]=r.nextInt(20)+1;
        }

        Scanner sc = new Scanner(System.in);
        OUT:
        while (true){
            System.out.println("请你输入一个1-20之间的整数进行猜测：");
            int getData=sc.nextInt();

            for (int i = 0; i < data.length ; i++) {
                if (data[i]==getData){
                    System.out.println("你已经猜中该数据，运气不错，你猜中的数据索引是："+i);
                    break OUT;//猜中结束整个四循环
                }
            }
            System.out.println("当前猜测的数据在数组中不存在，请重新猜测");
        }

        //输出数据的全部元素，让用户看到自己猜中的全部数据
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]+"\t");
        }

    }
}
