package com.basicjava.string;

import java.util.Scanner;

/**
 * 隐私号码
 */
public class f4_PrivacyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请你输入你的手机号码");
        String tel = sc.next();

        // 186 6577 6520
        String before = tel.substring(0, 3);

        String after = tel.substring(7); //截取冲索引7到末尾

       String s = before+"****"+after;
        System.out.println(s);

    }
}
