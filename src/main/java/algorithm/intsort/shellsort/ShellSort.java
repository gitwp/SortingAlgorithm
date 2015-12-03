package algorithm.intsort.shellsort;

import common.Print;
import common.Swap;

/**
 * Created by gitwp on 15-12-2.
 */
public class ShellSort {
    public static void main(String[] args) {
        int srcArr[] = {1, 54, 6, 3, 78, 34, 12, 45};

        Print.printArrToConsole(srcArr);
        Print.printToConsole("===================");
        shellSort(srcArr);
        Print.printArrToConsole(srcArr);

    }

    /**
     * 将数组分成子数组（子数组元素个数递增），然后使用插入排序
     * @param srcArr
     */
    public static void shellSort(int[] srcArr) {
        int temp;
        int j;
        //分组
        for (int step = srcArr.length / 2; step > 0; step = step / 2) {
            //插入排序
            for (int i = step; i < srcArr.length; i++) {
                temp = srcArr[i];
                for(j=i;j>=step;j=j-step){
                    if(temp>srcArr[j-step]){
                        srcArr[j]=srcArr[j-step];
                    }else{
                        break;
                    }
                }
                srcArr[j]=temp;
            }
        }
    }
}
