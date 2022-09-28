package com.basicjava.f3_programming_exercises;

import java.util.Random;
import java.util.Scanner;

/**
 * 随机排名
 * <p>
 * 需求：某公司开发部5名开发人员，需要进行项目进展汇报演讲，现在进行随机排名进行汇报
 * 请先一次录入5名员工的工号，然后展示输入一组随机的排名顺序
 */
public class f0_array_case3 {
    public static void main(String[] args) {
        int[] codes = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < codes.length; i++) {
            System.out.println("请你输入第" + i + 1 + "个员工的工号：");
            int code = sc.nextInt();
            codes[i] = code;
        }

        Random r = new Random();
        for (int i = 0; i < codes.length; i++) {
            int index = r.nextInt(codes.length);

            int temp = codes[index];
            codes[index] = codes[i];
            codes[i] = temp;
        }

        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i] + "\t");
        }
    }
}
