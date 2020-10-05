package com.xx;

public class ArrayTest02 {
    public static void main(String[] args) {

        //动态初始化方法：
        /*
        * 关于每个类型的默认值：
        * 数据类型              默认值
        * ==========================
        * bype                 0
        * short                0
        * int                  0
        * long                 0l
        * float                0.0F
        * double               0.0
        * boolean              false
        * char
        * 09 -   \u0000
        * 引用数据类型            null
        */

        // 什么时候采用静态初始化方式和动态初始化方式呢？
            //当你创建数组时，确定数组中存储那些具体元素时，采用静态初始化方式
            //当你创建数组时，。不确定将来数组中存储哪些数据，你可以采用动态初始化的方式。预先分配内存。
        int [] a1 = new int[4];//创建长度为4的数组
        //遍历数组
        for (int i =0;i< a1.length; i++){
            System.out.println("数组下标为"+ i +"的元素是:"+a1[i]);
        }
        //初始化一个Object类型的数值，采用动态初始化方式
        Object[] objs = new Object[3];
        for (int i =0; i< a1.length-1;i++){
            System.out.println(objs[i]);
        }
        System.out.println("==========================");
        String[] strs = new String[4];
        for (int i = 0;i< strs.length;i++ ){
            System.out.println(strs[i]);
        }
        //采用静态初始化方法
        String[] strs2 ={"abc","def","fuck"};
        for (int i =0; i<strs.length;i++){
            System.out.println(strs2[i]);
        }

        //存储Object，采用静态初始化
        Object o1 =new Object();
        Object o2 =new Object();
        Object o3 =new Object();
        Object[] objects = {o1,o2,o3};
        for (int i = 0; i<objects.length;i++){
            System.out.println(objects);
        }
        

    }

}
