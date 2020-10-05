package com.xx;

public class ArrayTest03 {
    //main方法的编写方式，还可以采用c++的格式
    public static void main(String[] args) {
        System.out.println("hyn");
        //c++的写法
        /*int a1[] = {1,2,3};*/
        //java的写法
        int [] a1 = {1,2,3};
        for (int i = 0 ;i< a1.length;i++){
            System.out.println("a1[i]");
        }
        //调用方法时传一个数组
        int [] x = {1,2,3,4};
        printArray(x);
    }
    public static void printArray(int[] array){
        for (int i= 0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
