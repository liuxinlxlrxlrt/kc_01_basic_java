package com.basicjava.basic;

import java.util.Scanner;

public class f4_KeyboardEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的年龄：");
        int age = sc.nextInt();
        System.out.println("你输入的年龄是："+age);
        System.out.println("请输入你的姓名：");
        String name = sc.next();
        System.out.println("你输入的年龄是："+name);

    }
}
