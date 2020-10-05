package com.xx;


import java.util.jar.JarEntry;

/*
 * 二维数组的遍历
 * */
public class ArrayTest11 {
    public static void main(String[] args) {
        String [][] a = {
                {"java","def","fuck"},
                {"张三","lisi",},


                {"shanghai","beijing","pinging",}
        };
        //遍历二维数组
        for (int i = 0; i <a.length; i++) {
            String [] 一维数组 = a[i];
            for (int j = 0;j< 一维数组.length;j++) {
            }

            //换行
            System.out.println(一维数组[i]+" ");}{

            //输出换行符
            System.out.println();
        }
    }
}
