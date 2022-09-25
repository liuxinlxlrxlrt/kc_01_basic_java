package com.basicjava.basic;


import static java.lang.Math.pow;

/**
 * 程序流程控制分支结构的穿透性
 */
public class f5_ProcessBranchStructure {
    public static void main(String[] args) {
        /**
         * 1、switch分支的格式、执行时怎么样的？
         *
         switch (表达式) {
         case 常量表达式或枚举常量:
         语句;
         break;
         case 常量表达式或枚举常量:
         语句;
         break;
         ......
         default: 语句;
         break;
         * 2、if、switch分支各自隔阂做什么业务场景？
         * (1)、if在功能上远远大于switch
         * (2)、if适合做区间匹配
         * (3)、switch适合做：值匹配的分支选择、代码优雅
         */

        /**
         * 1、switch分支注意事项？
         * （1）、表达式类型只能是byte、short、int、char，jdk5开始支持枚举，jdk7开始支持string
         *      不支持doule、float、long,因为doule、float在底层运算是不精确的，long的范围很大，没必要支持
         * （2）、case给出的值不允许重复，且只能字面量，不能是变量
         * （3）、不要忘记写break，否则会出现穿透现象
         *
         */
        double num = 0.1 + 0.2;
        System.out.println(num);//0.30000000000000004
        System.out.println("---------------------------------");
        /**
         * switch的穿透性：
         *  如果代码执行到没有break的case块，执行完后将直接进入下一个case块执行代码（而且不会进行任何匹配）
         *  直接到遇到break才跳出分支，这就是switch的穿透性；
         *
         *  switch穿透性案例（月份天数查看器）：
         *  需求：用于输入月份可以展示该月份的天数
         *  1,3,5,7,8,10,12月份是31天
         *  2月份是闰年为29天，非闰年是28天
         *  4,6,9,11月份是30天
         */

        int month = 7;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + "是31天！");
                break;
            case 2:
                System.out.println(month + "月闰月为29天，非闰月为28天！");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + "是30天！");
                break;
            default:
                System.out.println("数据有误");

        }

        System.out.println("---------------------------------");
        /**
         * @param args 水仙花数（Narcissistic number）
         *             也被称为超完全数字不变数（pluperfect digital invariant, PPDI）、
         *             自恋数、自幂数、阿姆斯壮数或阿姆斯特朗数（Armstrong number），
         *             水仙花数是指一个 3 位数，它的每个位上的数字的 3次幂之和等于它本身。
         *             例如：1^3 + 5^3+ 3^3 = 153。
         * @content 求出1000以内的所有水仙花数
         */

        int n = 0, a, b, c;    //n:水仙花总数 a:个位数 b:十位数 c:百位数
        for (int i = 100; i < 1000; i++) {
            a = i % 10; //个位
            b = (i / 10) % 10;  //十位
            c = i / 100;    //百位
            //判断是否为水仙花
            if (pow(a, 3) + pow(b, 3) + pow(c, 3) == i) {
                System.out.println(i);  //输出水仙花数
                n++;    //水仙花总数加一
            }
        }
        System.out.println("1000以内的水仙花总数为：" + n);

        System.out.println("---------------------------------");
        int count = 0;
        int zf = 8844430;
        double paper = 0.1;
        while (paper <= zf) {
            paper *= 2;
            count++;
//            System.out.println("需要折叠：" + count + "次");
        }
        System.out.println("总共折叠了"+count+"次");//打印出折叠的次数
    }
}

