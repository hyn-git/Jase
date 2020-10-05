package com.xx;

public class ArrayTest05 {

    public static void main(String[] args) {
        //java中数组是怎么进行拷贝
        int[] src = {1,2,3};
        int[] dest = new int[10];
        System.arraycopy(src,0,dest,0,src.length);
        for (int i = 0; i < dest.length ; i++) {
            System.out.println(dest[i]);
        }
        //从数组中如果存储的元素是引用的，可以拷贝
        String[] strs = {"hello","world!","study","java",};
        String[] newStrs = new String[10];
        System.arraycopy(strs,0,newStrs,0,strs.length);
        for (int i = 0; i < newStrs.length; i++) {
            System.out.println(newStrs[i]);
            System.out.println("====================================");
        }
        Object[] objs = {new Object(),new Object(),new Object()};
        Object[] newObjs = new Object[10];
        System.arraycopy(objs,0,newObjs,0,objs.length);
        for (int i = 0; i < newObjs.length; i++) {
            System.out.println(newObjs[i]);
        }

    }
}
