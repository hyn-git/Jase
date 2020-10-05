package com.xx;
/*
* 1.数组工具类：自己写的，不是sun的
* 2.关于查找算法中的:二分法查找
*       10（下标0）11 12 13 14 15 16 17 18 19 20（下标10）
*       （0+10）/2--> 中间元素小标5
*
 *   通过二分法查找，找出这个18元素下标
*   拿中间这个元素和目标查找的元素进行对比
*   中间元素:arr[5]-->15
*   15<18(被查找元素)
*   被查找的元素18在目前元素15的右边
*   所以开始元素的下标从0变成5+1
*
*   在重新计算一个中间元素
*
*
* 3.二分法查找算法是基于排序的基础之上（没有排序的数据是无法查找的）
*
* */

public class ArrayUtil {

    public static void main(String[] args) {
        int[] arr ={100,200,230,235,600,1000,2000,9999};
        //找出arr这个数组中200的所在下标
        //调用方法
        int index =  binarySearch2(arr,1000);
        System.out.println(index== -1 ? "该元素不存在!":"该元素下标"+index);
    }

    private static int binarySearch2(int[] arr, int i) {
        //开始下标
        int begin = 0;
        //结束下标
        int end =arr.length-1;
        //中间元素下标
        while (begin<=end) {
            int mid = (begin + end) / 2;
            if (arr[mid] == i) {
                return mid;
            } else if (arr[mid] < i) {
                //目标在中间右边
                //开始元素下标需要发生变化
                begin = mid + 1;//一直增
            } else {
                //arr[mid] > i
                //目标在“中间”的左边
                //修改结束元素的下标
                end = mid - 1;//一直减
            }
        }
        return -1;
    }
}

