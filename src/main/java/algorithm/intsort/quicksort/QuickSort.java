package algorithm.intsort.quicksort;

import common.Print;

/**
 * Created by gitwp on 15-12-2.
 */
public class QuickSort {
    public static void main(String[] args) {
        int srcArr[] = {1, 54, 6, 3, 78, 34, 12, 45};

        Print.printArrToConsole(srcArr);
        Print.printToConsole("===================");
        quickSort(srcArr);
        Print.printArrToConsole(srcArr);

    }

    /**
     * 分而治之原则，以一个基准数为标准，递归排序
     * @param srcArr
     */
    public static void quickSort(int[] srcArr) {
        if(srcArr.length>2){
            quickSort(srcArr,0,srcArr.length-1);
        }
    }

    public static void quickSort(int[] srcArr,int low, int high) {
       if(low<high){
           int middle = getMiddle(srcArr, low, high);
           quickSort(srcArr,low,middle-1);
           quickSort(srcArr,middle+1,high);
       }
    }

    public static int getMiddle(int[] srcArr,int low, int high){
        int temp = srcArr[low];
        while(low<high){
            while(low<high && srcArr[high]>=temp) high--;
            srcArr[low]=srcArr[high];
            while(low<high && srcArr[low]<=temp) low++;
            srcArr[high]=srcArr[low];
        }
        srcArr[low]=temp;
        return low;
    }
}
