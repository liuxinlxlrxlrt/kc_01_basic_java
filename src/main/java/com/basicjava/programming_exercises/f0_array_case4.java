package com.basicjava.programming_exercises;

/**
 * 冒泡排序
 */
public class f0_array_case4 {
    public static void main(String[] args) {
        int[] arr ={5,2,3,1};

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }

    }
}
