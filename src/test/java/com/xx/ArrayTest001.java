package com.xx;

import java.util.Arrays;

/*
* 好消息：
* sun公司已经帮我们写好了工具utils
* */
public class ArrayTest001 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,6,8,56,5,};
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

        //二分法查找
        int index = Arrays.binarySearch(arr,45);
        System.out.println(index== -1 ? "该元素不存在!":"该元素下标"+index);
    }
}
