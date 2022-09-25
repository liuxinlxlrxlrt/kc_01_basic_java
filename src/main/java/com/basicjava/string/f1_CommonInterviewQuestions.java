package com.basicjava.string;

/**
 * 常见面试题
 */
public class f1_CommonInterviewQuestions {
    public static void main(String[] args) {
        String s2 = new String("abc");
        java.lang.String s1 = "abc";
        System.out.println(s1==s2);

        //问题1：”String s2 = new String(“abc”);“代码总共创建了几个对象？
        //答： 2个对象，双引号给出的”abc“会放在常量池，new出来的”abc“会放在堆内存

        //问题2：String s1 = "abc";代码创建了多少个对象？
        //答：0个对象，因为new String("abc");的“abc”已经在常量池中创建了相同的对象


        //问题3：s1==s2吗？
        //答：因为s1指向常量池，s2指向堆内存

        System.out.println("---------------------------------------------");
        String s3 = "abc";
        String s4="ab";
        String s5=s4+"c";
        System.out.println(s3==s5);

        //问题1：s1==s3?
        //答：false，s1指向常量池的“abc”,s3=s2+"c"运算结果是放到堆内存的，地址不一样


        System.out.println("---------------------------------------------");

        String s6 = "abc";
        String s7="a"+"b"+"c";
        System.out.println(s6==s7);
        //问题1：s1==s2?
        //答：true，java存在编译机制，程序在编译时，"a"+"b"+"c"会直接转成"abc"

    }


}
