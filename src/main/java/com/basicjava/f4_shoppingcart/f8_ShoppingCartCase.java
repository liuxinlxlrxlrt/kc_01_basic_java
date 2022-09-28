package com.basicjava.f4_shoppingcart;

import java.util.Scanner;

/**
 * 购物车
 */
public class f8_ShoppingCartCase {
    /**
     * 模拟购物车模块的功能，需要实现添加商品到购物车中去，
     * 同时需要添加修改商品的购买数量，结算商品价格功能（请使用面向对象编程来解决）
     * <p>
     * 分析：
     * 购物车中的每个商品都是一个对象，㤇定义一个商品类
     * 购物车本身也是一个对象，可以使用数组对象代替它
     * 完成界面架构，让用户操作的功能
     */
    public static void main(String[] args) {

        //1、定义商品对象

        //2、定义购物车对象
        Goods[] shopCar = new Goods[100];

        //3、搭建操作架构
        while (true) {
            System.out.println("请你选择如下命令进行操作：");
            System.out.println("添加商品到购物车：add");
            System.out.println("查询购物车商品展示：query");
            System.out.println("修改商品购买数量：update");
            System.out.println("结算购买商品的金额：pay");
            Scanner sc = new Scanner(System.in);
            System.out.println("请你输入命令");
            String command = sc.next();
            switch (command) {
                case "add":
                    //添加商品到购物车
                    addGoods(shopCar, sc);
                    break;
                case "query":
                    //查询购物车商品展示
                    queryGoods(shopCar);
                    break;
                case "update":
                    //修改商品购买数量
                    updateGoods(shopCar, sc);
                    break;
                case "pay":
                    //结算金额
                    payGoods(shopCar);
                    break;
                default:
                    System.out.println("没有该功能");
            }
        }
    }

    public static void payGoods(Goods[] shopCar) {
        queryGoods(shopCar);
        double money = 0;
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null) {
                money += (g.price * g.buyNumber);
            } else {
                break;
            }
        }
        System.out.println("订单总金额：" + money);
    }

    public static void updateGoods(Goods[] shopCar, Scanner sc) {
        //请用户输入要修改的商品id,根据id查询出要修改的商品对象
        while (true) {
            System.out.println("请输入要修改的商品id:");
            int id = sc.nextInt();
            Goods g = getGoodsById(shopCar, id);
            if (g == null) {
                //没有商品
                System.out.println("对不起，没有该购买商品！");
            } else {
                //说明存在该上篇，可以修改它了
                System.out.println("请你输入：" + g.name + "商品最新的商品数量:");
                int buyNumber = sc.nextInt();
                g.buyNumber = buyNumber;
                System.out.println("修改完成！");
                queryGoods(shopCar);
                break;
            }
        }
    }

    public static Goods getGoodsById(Goods[] shopCar, int id) {
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null) {
                if (g.id == id) {
                    return g;
                }
            } else {
                return null;//找完了全部存在的商品，都没有找到
            }
        }
        return null;//代表找完了100个商品都没有找到id一样的商品
    }


    public static void queryGoods(Goods[] shopCar) {
        System.out.println("查询购物车信息如下");
        System.out.println("编号\t\t名称\t\t购买数量\t\t价格");
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null) {
                System.out.println(g.id + "\t\t" + g.name + "\t\t" + g.buyNumber + "\t\t\t" + g.price);
            } else {
                break;
            }
        }
    }

    public static void addGoods(Goods[] shopCar, Scanner sc) {
        System.out.println("请你输入购买商品的商品编号（不重复）：");
        int id = sc.nextInt();

        System.out.println("请你输入购买商品的名称");
        String name = sc.next();

        System.out.println("请你输入购买商品的数量");
        int buyNumber = sc.nextInt();

        System.out.println("请你输入购买商品的价格");
        double price = sc.nextDouble();

        Goods g = new Goods();
        g.id = id;
        g.name = name;
        g.buyNumber = buyNumber;
        g.price = price;

        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] == null) {
                shopCar[i] = g;
                break;
            }
        }
    }

}
