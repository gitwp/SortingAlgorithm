package algorithm.intsort.insertsort;

import common.Print;

/**
 * Created by gitwp on 15-12-2.
 */
public class InsertSort {
    public static void main(String[] args) {
        int srcArr[] = {1, 54, 6, 3, 78, 34, 12, 45};

        Print.printArrToConsole(srcArr);
        Print.printToConsole("===================");
        insertSort(srcArr);
        Print.printArrToConsole(srcArr);

    }

    public static void insertSort(int[] srcArr) {
        for(int i=1;i<srcArr.length;i++){
            int temp = srcArr[i];
            int j=i;
            for(;j>0;j--){
                if(temp<srcArr[j-1]){
                    srcArr[j]=srcArr[j-1];
                }else{
                    break;
                }
            }
            srcArr[j]=temp;

        }
    }
}
