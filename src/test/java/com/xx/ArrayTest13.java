package com.xx;

public class ArrayTest13 {
    public static void main(String[] args) {
        //abc 字符串也是java对象，属于String类型
        //“abc”是一个字符串对象，字符串在Java中有优待，不需要new也一样
        //String s = new String("fffffffffffff");
        String s = "fffffffffffff";
        Object[] arr = {new Husband(),new wife(),"abc"};

    }
}
class Husband {

}
class wife{

}