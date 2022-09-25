package com.basicjava.programming_exercises;

/**
 * 复制数组
 */
public class f4_copy_array {
    public static void main(String[] args) {
        //将一个数组中元素复制到另一个素组中去

        int[] arr1 = {11,22,33,44};
//        int[] arr2=arr1;//没有完成数组的复制，只是arr2的地址执行了arr1的地址
        int[] arr2 = new int[arr1.length];

        copy(arr1,arr2);

        printArray(arr1);
        printArray(arr2);
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i==arr.length-1?arr[i]:arr[i]+",");
        }
        System.out.println("]");
    }

    public static void copy(int[] arr1,int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            arr2[i]=arr1[i];
        }
    }
}
