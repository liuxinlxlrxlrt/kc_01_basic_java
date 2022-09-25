package com.basicjava.string;

import java.util.Scanner;

/**
 * 模拟用户登录
 */
public class f3_SimulateUserLogin {
    public static void main(String[] args) {
        String okLoginName="admin";
        String okPassword="itheima";

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("请你输入登录名称：");
            String loginName = sc.next();
            System.out.println("请你输入登录密码：");
            String password = sc.next();

            if (okLoginName.equals(loginName)){
                if (okPassword.equals(password)){
                    System.out.println("登录成功");
                    break;
                }else {
                    System.out.println("你输入的密码错误，你还剩余"+(3-i)+"次机会登录");
                }
            }else {
                System.out.println("登录名称错误，你还剩余"+(3-i)+"次机会登录");
            }
        }
    }
}
