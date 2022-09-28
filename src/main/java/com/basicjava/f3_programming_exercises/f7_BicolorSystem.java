package com.basicjava.f3_programming_exercises;

import java.util.Random;
import java.util.Scanner;

/**
 * 双色球系统
 * <p>
 * 1、业务分析，随机生成一组中奖号码
 * 投注号码由6个红色球号码和1个篮色球号码组成，红球号码从1-33中选择，篮色球号码从1-16中选择
 * <p>
 * 一等奖 6个红球 1个篮球 中6+1 最高1000万
 * 二等奖 6个红球        中6+0 最高500万
 * 三等奖 5个红球  1个篮球 中5+1  3000元
 * 四等奖  4个红球 1个篮球或者没有 中4+1 或者5+0 200元
 * 五等奖 三个红球 1个篮球或者2个红球 1个篮球 中3+1 或者4+0  10元
 * 六等奖 1个红球或者没有 1个篮球  中 1+1 或者0+1 或者2+1 5元
 * <p>
 * 2、用户输入一组双色球好啊
 * <p>
 * 3、判断中奖情况
 * <p>
 * 设计思路：
 * 1、随机一组中奖号码返回
 * 中奖号码由6个红球和1个篮球组成（注意：6个红球要求不能重复）
 * 可以定义方法用于返回一组中奖号码，返回的形式是一个整形数组
 * <p>
 * 2、用户输入一组双色球号码返回
 * 3、转入2组号码，判断用户中奖情况
 */
public class f7_BicolorSystem {
    public static void main(String[] args) {
        int[] luckNumbers = createLuckNumbers();
        printArrays(luckNumbers);
        int[] userInputNumbers = userInputNumbers();
        printArrays(userInputNumbers);
        judge(luckNumbers, userInputNumbers);

    }

    //1、随机一组中奖号码返回
    public static int[] createLuckNumbers() {
        //a、定义一个动态初始化的数组，存储7个数字
        int[] numbers = new int[7];
        //b、遍历数组，为每个位置生成对应的号码(注意：遍历前6个位置，生成6个不重复的红球号码，范围是1-33)
        Random r = new Random();
        for (int i = 0; i < numbers.length - 1; i++) {
            //c、注意：判断房钱的随机的这个号码之前是否出现过，出现过重新生成一个，直到不重复为止，才能存入到数组中去
            //为当前位置找一个不重复的1-33之前的数字
            while (true) {
                int data = r.nextInt(33) + 1; //1-33==>(0-32)+1
                //定义一个标记位变量，默认data是没有重复的
                boolean flag = true;
                for (int j = 0; j < i; j++) {
                    if (numbers[j] == data) {
                        //data之前出现过，不能用
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    //data之前没有出现过，可以使用
                    numbers[i] = data;
                    break;
                }
            }
        }
        //d、为第7个位置生成一个1-16的号码最为篮球号码
        numbers[numbers.length - 1] = r.nextInt(16) + 1; //1-16==>(0-16)+1

        return numbers;
    }

    //2、用户输入一组双色球号码返回
    public static int[] userInputNumbers() {
        //定义一个数组存储7个号码
        int[] numbers = new int[7];

        //让用户录入6个红球号码
        Scanner sc = new Scanner(System.in);
        System.out.println("请用户输入7个号码：");
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.println("请你输入第" + i + 1 + "个红球号码（1-33，要求不重复）：");
            int data = sc.nextInt();
            //c、把当前输入的数据存储到数组中去
            numbers[i] = data;
        }

        //d、单独录入篮球号码
        System.out.println("请你输入篮球号码（1-16）：");
        numbers[numbers.length - 1] = sc.nextInt();
        return numbers;

    }

    //3、转入2组号码，判断用户中奖情况
    public static void judge(int[] luckNumbers, int[] userNumbers) {
        //判断是否中奖了
        //luckNumber=[12,23,8,16,32,   9]
        //userNumbers=[23,13,18,6,8,32,  10]

        //1、定义两个变量分别存储红球命中的个数，以及篮球命中的个数
        int radHitNumbers = 0;
        int blueHitNumbers = 0;

        //2、判断红球命中了几个，开始统计
        for (int i = 0; i < userNumbers.length - 1; i++) {
            for (int j = 0; j < luckNumbers.length - 1; j++) {
                //每次找到相等的以为这当前号码命中
                if (userNumbers[i] == luckNumbers[j]) {
                    radHitNumbers++;
                    break;
                }
            }
        }

        //判断篮球号码是否命中
        blueHitNumbers = luckNumbers[luckNumbers.length - 1] == userNumbers[userNumbers.length - 1] ? 1 : 0;

        System.out.println("中奖号码是：");
        printArrays(luckNumbers);
        System.out.println("你的投注号码是：");
        printArrays(userNumbers);
        System.out.println("你命中了几个红球：" + radHitNumbers);
        System.out.println("你是否命中蓝球：" + (blueHitNumbers == 1 ? "是" : "否"));

        //判断中奖情况
        if (blueHitNumbers == 1 && radHitNumbers < 3) {
            System.out.println("恭喜你，中了5元小奖（六等奖）！");
        } else if (blueHitNumbers == 1 && radHitNumbers == 3 || blueHitNumbers == 0 && radHitNumbers == 4) {
            System.out.println("恭喜你，中了10元小奖（五等奖）！");
        } else if (blueHitNumbers == 1 && radHitNumbers == 4 || blueHitNumbers == 0 && radHitNumbers == 5) {
            System.out.println("恭喜你，中了200元！（四等奖）");
        } else if (blueHitNumbers == 1 && radHitNumbers == 5) {
            System.out.println("恭喜你，中了3000元大奖！（三等奖）");
        } else if (blueHitNumbers == 0 && radHitNumbers == 6) {
            System.out.println("恭喜你，中了500万元大奖！（二等奖）");
        } else if (blueHitNumbers == 1 && radHitNumbers == 6) {
            System.out.println("恭喜你，中了1000万巨奖！（一等奖），开始享受人生，诗和远方！！！");
        }
    }

    public static void printArrays(int[] numbers) {
//        System.out.print("[");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(i==numbers.length-1?numbers[1]:numbers[i]+",");
//        }
//        System.out.println("]");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "\t");
        }
        System.out.println();//换行;
    }

}
