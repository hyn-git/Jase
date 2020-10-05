package com.xx;

/*
 *  关于Java中的二维数组
 *   1.二维数组其实是一个一维数组，特殊在这个一维数组当中的每一个元素是一个一维数组
 *      三维数组是一个特殊的二维数组，特殊在这个二维数组中的每一个元素是一维数组
 *      实际的开发中使用最多的就是一维数组。二维数组也很少使用，三维几乎不用
 *   2.二维数数组静态初始化
 *      int [] [] a = {{},{},{}，};2
 * */

public class ArrayTest09 {
    public static void main(String[] args) {
        //一维数组
        int [] array = {100,200,300};
        System.out.println(array.length);
        //二维数组
        int [][] a = {{100,200,300},
                {
                        20,30,40,50
                } ,
                {1,2,3,4}
        };
        System.out.println(a.length);
        System.out.println("=====================");
        System.out.println(a[0].length);
        System.out.println(a[1].length);
        System.out.println(a[2].length);
        System.out.println(a[3].length);
        //以下有4个一维数组
        int [][] a2 = {{100,200,300},
                {
                        20,30,40,50
                } ,
                {1,2,3,4}
                ,{0}
        };
        System.out.println(a2.length);

    }
}
