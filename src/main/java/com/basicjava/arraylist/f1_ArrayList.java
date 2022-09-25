package com.basicjava.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * 需求：
 * 某个编辑的考试系统上，成绩大致为:97,77,66,89,79,50,100
 * 现在需要先把成绩低于80分以下的数据去掉
 */
public class f1_ArrayList {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>();
        scores.add(98);
        scores.add(77);
        scores.add(66);
        scores.add(89);
        scores.add(79);
        scores.add(50);
        scores.add(100);
        System.out.println(scores);//[98, 77, 66, 89, 79, 50, 100]
        for (int i = 0; i < scores.size(); i++) {
            int score=scores.get(i);
            if (score<80){
                scores.remove(i);
            }
        }
        System.out.println(scores);//[98, 66, 89, 50, 100]

        System.out.println("以上代码有bug，因为跳位的原因");
        System.out.println("--------------------------------------");
        //方案一：

        for (int j = 0; j < scores.size(); j++) {
            int score=scores.get(j);
            if (score<80){
                scores.remove(j);
                j--;//删除成功后退一步，这样可以保证下次会带这个位置，如此保证不会跳过这个位置
            }
        }
        System.out.println("方案一："+scores);//[98, 89, 100]

        System.out.println("--------------------------------------");

        //方案二：

        for (int k = scores.size()-1; k >=0; k--) {
            int score=scores.get(k);
            if (score<80){
                scores.remove(k);
            }
        }
        System.out.println("方案二："+scores);//[98, 89, 100]


    }
}
