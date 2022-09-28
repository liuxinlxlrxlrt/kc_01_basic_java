package com.basicjava.f5_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 需求：学生信息系统的数据搜索
 *
 * 学号           姓名          年龄  班级
 * 20180302       叶孤城       23   护理一班
 * 20180303       东方不败     23   推拿二班
 * 20180304       西门吹雪     26   中药学四班
 * 20180305       梅超风      26   神经科2班
 *
 */
public class f3_ArrayList {
    public static void main(String[] args) {
        Student stu1 = new Student("20180302","叶孤城",23,"护理一班");
        Student stu2 = new Student("20180303","东方不败",23,"推拿二班");
        Student stu3 = new Student("20180304","西门吹雪",26,"中药学四班");
        Student stu4 = new Student("20180305","梅超风",26,"神经科2班");

        List<Student> students = new ArrayList<>();
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        students.add(stu4);

        System.out.println("学号\t\t\t名称\t\t年龄\t班级");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println(s.getStudyNumber()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getClassName());

        }

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("请你输入学号查询学生：");
            String studyNumber = sc.next();
            System.out.println("学号\t\t\t名称\t\t年龄\t班级");
            Student s = getStudentById(students, studyNumber);
            if (s==null){
                System.out.println("对不起，查无此人~~~");
            }else {
                System.out.println(s.getStudyNumber()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getClassName());
            }

        }

    }

    public static Student getStudentById(List<Student> students,String studyNumber){
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getStudyNumber().equals(studyNumber)){
                return s;
            }
        }
        return null;
    }
}
