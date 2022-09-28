package com.basicjava.f3_programming_exercises;

import java.util.Scanner;

/**
 * 买飞机票
 */
public class f1_buyairtickets {
    /**
     * 需求：
     * （1）、机票按照淡季旺季、头等舱和经济舱收费，输入机票原价、月份、头等舱或者经济舱
     * （2）、机票最终优惠价格的计算方案如下：旺季（5-10月）头等舱9折，经济舱8.5折，
     * 淡季（11月份到来年4月）头等舱7折，经济舱6.5折
     */

    public static void main(String[] args) {

        //1、让用户输入输入机票原价、月份、头等舱或者经济舱
        Scanner sc = new Scanner(System.in);
        System.out.println("请你输入机票的原价：");
        double money = sc.nextDouble();

        System.out.println("请你输入机票的月份（1-12）：");
        int month = sc.nextInt();

        System.out.println("请你输入机票的仓位类型：");
        String type = sc.next();

        //调用方法，统计结果
        double money1 = calc(money, month, type);
        System.out.println("机票优惠后的价格是：" + money1);

    }

    /**
     * 定义方法接收信息，统计优惠后的价格返回
     */
    public static double calc(double money, int month, String type) {
        if (month >= 5 && month <= 10) {
            //旺季
            switch (type) {
                case "头等舱":
                    money *= 0.9;
                    break;
                case "经济舱":
                    money *= 0.85;
                    break;
                default:
                    System.out.println("你输入仓位有误，请重新输入");
                    return -1;//表示当前无法计算价格
            }
        } else if (month == 11 || month == 12 && month <= 4) {
            //淡季
            switch (type) {
                case "头等舱":
                    money *= 0.7;
                    break;
                case "经济舱":
                    money *= 0.65;
                    break;
                default:
                    System.out.println("你输入仓位有误，请重新输入");
                    return -1;//表示当前无法计算价格
            }
        } else {
            System.out.println("你输入的月份有误，请重新输入");
            return -1;//表示当前无法计算价格
        }
        return money;
    }
}
