package algorithm.intsort.selectsort;

import common.Print;
import common.Swap;

/**
 * Created by gitwp on 15-12-2.
 */
public class SelectSort {
    public static void main(String[] args) {
        int srcArr[] = {1, 54, 6, 3, 78, 34, 12, 45};

        Print.printArrToConsole(srcArr);
        Print.printToConsole("===================");
        selectSort(srcArr);
        Print.printArrToConsole(srcArr);

    }

    /**
     * 对冒泡排序的一种改进，一轮循环只交换一次数据
     * @param srcArr
     */
    public static void selectSort(int[] srcArr) {
        int smallPosition;

        for (int i = 0; i < srcArr.length; i++) {
            smallPosition = i;
            for (int j = i + 1; j < srcArr.length; j++) {
                if (srcArr[smallPosition] > srcArr[j]) {
                    smallPosition = j;
                }
            }
            Swap.swap(srcArr, i, smallPosition);
        }
    }

}
