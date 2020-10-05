package com.xx;

public class ArrayTest10 {
    public static void main(String[] args) {
        int [][] a = {
                {10,20,30},
                {100,200},
                {1,2,3,4,3,5,6},
                {11}
        };
        /*
         * 关于二维数组的读和写
         *  a[二维数组中的一维数组的下标][一维数组的下标]
         *  a[0][0]:表示第一个一维数组的第[0]元素
         *  a[3][100]:表示第四个一维数组中的第101个元素
         * 注意:对于a[3][100]来说，其中a[3]是一个整体。[100]是前面a[3]执行结束的结果后再下标100
         * */
        //取出以上二维数组中的第一个一维数组
        int [] frist = a[0];
        int ffrist = frist[0];
        System.out.println(ffrist);
        System.out.println(a[0][0]);
        //取出第二个一维数组中的第三个元素
        System.out.println("第二个一维数组中的第三个元素"+a[1][2]);
        //取出第三个一维数组中的第五个元素
        System.out.println("第三个一维数组中的第五个元素"+a[2][4]);
        System.out.println("===============================s");
        //改
        int [][] a1 = {
                {10,20,30},
                {100,200},
                {1,2,3,},
                {11},
                {10,20,3,4,5}
        };
        a1[2][0] = 11111;
        System.out.println(a1[2][0]);
    }
}
