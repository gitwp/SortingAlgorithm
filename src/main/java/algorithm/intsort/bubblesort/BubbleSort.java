package algorithm.intsort.bubblesort;

import common.Print;
import common.Swap;

/**
 * Created by gitwp on 15-12-2.
 */
public class BubbleSort {

    public static void main(String[] args) {
        int srcArr[]={1,54,6,3,78,34,12,45};

        Print.printArrToConsole(srcArr);
        Print.printToConsole("===================");
        bubbleSort(srcArr);
        Print.printArrToConsole(srcArr);

    }

    public static void bubbleSort(int[] srcArr){
        for(int i=0;i<srcArr.length;i++){
            for(int j=i+1;j<srcArr.length;j++){
                if(srcArr[i]>srcArr[j]){
                    Swap.swap(srcArr, i, j);
                }
            }
        }
    }

}
