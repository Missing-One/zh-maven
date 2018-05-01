package com.zh.algorithms;

/**
 * 二分查找演示
 * 给定一个有序序列
 */
public class BinarySearch {

    public static void main(String[] args) {
        int x = 100;
        int[] array = new int[100];
        for (int i =1;i < 101; i++){
            //System.out.println("i = " + i);
            array[i-1]=i;
        }

        boolean b = binarySearch2(array, x);
        System.out.println("b = " + b);
    }


    /**
     * 实现1
     * @param array
     * @param x
     * @return
     */
    public static boolean binarySearch1(int[] array, int x){
        int start = 0,
            end = array.length,
            mid=(end - start) / 2 + start;
        while (true){
            mid = (end - start) / 2 + start;      // 开始比较的位置,找到数组中间的位置
            System.out.println("start - and " + start + "-" + end);
            if(mid == start && array[mid]!= x){  // 查到最后 mid 还未找到, 则返回false 防止继续查找
                return false;
            }else {
                if (x > array[mid]){       // 如果x 大于数组中间的值,则代表该值 x ,存在的位置是数组后半区
                    start = mid;                   // 这里将起始位置,设置成中间数
                } else if (x < array[mid]){       // 如果x 小于数组中间的值,则代表该值在 x ,存在的位置是数组前半区
                    end = mid;                     // 这里将结束位置,设置成中间数
                } else if (array[mid] == x){      // 这里找到对应的值,并返回
                    return true;
                }
            }
        }
    }


    /**
     * 使用位移运算
     * @param array
     * @param x
     * @return
     */
    public static boolean binarySearch2(int[] array, int x){
        int start = 0,
             end = array.length-1,
             mid = 0;
        while(end >= start){
            mid = (start + end) >>> 1;
            System.out.println(start + "-" + end);
            if (x == array[mid]){ return true;}else
            if (x > array[mid]){ start = mid +1;}
            else { end = mid - 1 ;}
        }
        return false;
    }
}
