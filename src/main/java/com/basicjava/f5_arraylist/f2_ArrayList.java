package com.basicjava.f5_arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * 需求：集合存储自定义元素并遍历
 * 定义电影类（名称，分支，演员），创建3个电影类对象，代表三部电影，存储集合并遍历
 * 《肖生克的救赎》 9.7 罗宾斯
 * 《霸王别姬》 9.6 张国荣，张丰毅
 * 《阿甘正传》 9.5 汤姆.汉克斯
 */
public class f2_ArrayList {
    public static void main(String[] args) {
        Movie m1 = new Movie("《肖生克的救赎》",9.7,"罗宾斯");
        Movie m2 = new Movie("《霸王别姬》",9.6,"张国荣，张丰毅");
        Movie m3 = new Movie("《阿甘正传》",9.5,"汤姆.汉克斯");

        List<Movie> movies = new ArrayList<>();
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);

        for (int i = 0; i < movies.size(); i++) {
            Movie m = movies.get(i);
            System.out.println("电影名称:"+m.getName());
            System.out.println("电影得分:"+m.getScore());
            System.out.println("电影主演:"+m.getActor());
            System.out.println("--------------------------");

        }

    }
}
