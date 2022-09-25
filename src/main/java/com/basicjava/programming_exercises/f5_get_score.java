package com.basicjava.programming_exercises;

import java.util.Scanner;

/**
 * 评委打分
 * <p>
 * 需求:在歌唱比赛中，有6名评委给选手打分，扥书范围【0-100】之间的整数，
 * 选手的最后得分为：去掉最高分、最低分后的4个评委的平均分。
 */
public class f5_get_score {
    public static void main(String[] args) {
        //1、把6个评委的分数录入到程序中去-->使用数组
        int[] scores = new int[6];

        //2、录入6个评委的打分
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请你输入第" + (i + 1) + "个评委的打分：");
            int score = sc.nextInt();
            scores[i] = score;
        }

        //2、遍历数组中的每个数据，进行累计求和，并找出最高分、最低分
        int max = scores[0];
        int min = scores[0];
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i]>max){
                //替换最大值变量
                max=scores[i];
            }

            if (scores[i]<min){
                //替换最小值变量
                min=scores[i];
            }

            //统计总分
            sum+=scores[i];

        }
        System.out.println("选手的最高分为："+max);
        System.out.println("选手的最低分为："+min);
        //3、按照分数的计算规则算出平均分
        double result=(sum-max-min)*1.0/(scores.length-2);
        System.out.println("选手最终得分为："+result);
    }

}
