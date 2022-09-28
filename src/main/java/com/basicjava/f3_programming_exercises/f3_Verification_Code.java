package com.basicjava.f3_programming_exercises;

import java.util.Random;

/**
 * 验证码
 */
public class f3_Verification_Code {
    public static void main(String[] args) {
        //调用随机验证码方法得到一个随机验证码
        String code = createCode(5);
        System.out.println(code);

    }

    /**
     * 定义一个方法返回一个随机验证码，是否需要返回值类型申明？ String ,是否需要申明形参：int n
     */

    public static String createCode(int n) {
        //1、定义一个字符串变量记录生成的随机字符
        String code = "";
        //2、定义一个for循环，循环n次，依次生成随机字符
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            //3、生成一个随机字符：英文大写、小写、数字
            int type = r.nextInt(3); //0 1 2
            switch (type) {
                case 0:
                    //大写字符(A 65- Z 65+25) (0-25)+65
                    char ch = (char) (r.nextInt(26) + 65);
                    code += ch;
                    break;
                case 1:
                    //小写字符 (a 97- z 97+25) (0-25)+97
                    char ch1 = (char) (r.nextInt(26) + 97);
                    code += ch1;
                    break;
                case 2:
                    //数字字符
                    code += r.nextInt(10);
                    break;
            }
        }
        return code;
    }
}
