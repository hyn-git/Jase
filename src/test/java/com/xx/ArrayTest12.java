package com.xx;

import javax.sound.midi.Soundbank;

public class ArrayTest12 {
    public static void main(String[] args) {
        //静态初始化
        int[][] a = {
                {1,2,3,4},
                {4,5,6,7},
                {11,22,33,44},
                {1,2,3,45,6,8}
        };
    printArray(a);
    printArray(new int[][]{ {1,2,3,4},{4,5,6,7},{11,22,33,44},{1,2,3,45,6,8}});
    }
   public static void printArray(int[][] array){

       for (int i = 0; i <array.length ; i++) {
           for (int j = 0; j < array[i].length ; j++) {
               System.out.println(array[i][j]);
           }
           System.out.println();
       }
   }


}



