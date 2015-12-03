package algorithm.intsort.mergesort;

import common.Print;

/**
 * Created by gitwp on 15-12-2.
 */
public class MergeSort {
    public static void main(String[] args) {
        int srcArr[] = {1, 54, 6, 3, 78, 34, 12, 45};

        Print.printArrToConsole(srcArr);
        Print.printToConsole("===================");
        mergeSort(srcArr);
        Print.printArrToConsole(srcArr);

    }

    /**
     * 即把待排序序列分为若干个子序列，每个子序列是有序的。然后再把有序子序列合并为整体有序序列。
     * @param srcArr
     */
    public static void mergeSort(int[] srcArr) {
       sort(srcArr,0,srcArr.length-1);
    }

    private static void sort(int[] data, int left, int right){
        if(left>=right) return;

        //中间索引
        int center = (left+right)/2;

        //左边数组递归排序
        sort(data,left,center);

        //右边数组递归排序
        sort(data,center+1, right);

        //合并左右两个有序数组
        merge(data,left,center,right);
    }

    /**
     * data中包含了所有数，其中left到center是有序的，center+1到right是有序的
     * @param data
     * @param left
     * @param center
     * @param right
     */
    private static void merge(int[] data, int left, int center, int right){
        //临时数组、用于暂时存放合并后的结果
        int[] tmpArr = new int[data.length];
        //右边数组第一个元素索引
        int mid = center + 1;
        //临时数组的索引
        int tmpIndex = left;
        //left缓存
        int tmpLeft = left;

        //按顺序合并两个数组
        while (left <= center && mid <=right){
            if(data[left]<=data[mid]){
                tmpArr[tmpIndex++]=data[left++];
            }else{
                tmpArr[tmpIndex++]=data[mid++];
            }
        }
        while (mid<=right) tmpArr[tmpIndex++]=data[mid++];
        while (left<=center)tmpArr[tmpIndex++]=data[left++];

        //此时临时数组为按序合并的数组
        //替换原数组中对应索引位置的元素

        while (tmpLeft<=right){
            data[tmpLeft]=tmpArr[tmpLeft++];
        }
    }
}
