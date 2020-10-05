package com.xx;
/*
* 选择排序:
*       每一次从这堆参与比较的数据当中找出最小值
*       拿着这个最小值和“参与比较的这堆最前面”
*
* 关键点：选择排序中怎么找出一堆中最小的。
*       3 1 6 2 5
*       假设：第一个3是最小的
*       3和2比较，发现2更小，所以此最小的是2
*       继续拿着2往下比对，2和6比较，2仍然最小
*
* */
public class SelectSort {
    public static void main(String[] args) {
        int [] arr = {3,1,6,2,5};
        //选择排序
        //5条数据循环4次（外层循环4次）
        //i的值为0 1 2 3
        //i正好是“参加比较的这堆数据中”最左边的元素下标
        //i是一个参与比较的这堆数据中的起点下标
        //假设起点：下标位置上的元素是最小的
        for (int i = 0; i <arr.length-1 ; i++) {
            int min = i;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[j] < arr[min]){
                    min =j;//最小元素的小标是j
                }
            }
        //当i和min相等时，表示最初猜测是对的
            //当i和min不相等是，表示最初猜测是错的，有比这个更小的元素
            //需要拿着这个最小的元素和最左边的元素交换位置
            if (min !=i){
                //表示存在更小的数据
                //arr【min】最小的数据
                //arr[i]最前面的数据
                int temp;
                temp = arr[min];
                arr[min] = arr[i];
                arr[i]= temp;
            }
           /* System.out.println(i);
            for (int j = i+1; j<arr.length;j++){
                System.out.println("======:"+ j);
            }*/
        }
        //排序之后遍历
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
            
        }
    }
}
