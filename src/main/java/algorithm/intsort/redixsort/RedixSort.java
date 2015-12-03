package algorithm.intsort.redixsort;

import common.Print;

/**
 * Created by gitwp on 15-12-2.
 */
public class RedixSort {
    public static void main(String[] args) {
        int srcArr[] = {1, 54, 6, 3, 78, 34, 12, 45};

        Print.printArrToConsole(srcArr);
        Print.printToConsole("===================");
        redixSort(srcArr);
        Print.printArrToConsole(srcArr);

    }

    /**
     * 基于数的位排序
     * @param srcArr
     */
    public static void redixSort(int[] srcArr) {
        //获取数组中最大的数
        int max = srcArr[0];
        for(int i=0;i<srcArr.length-1;i++){
            if(max<srcArr[i]) max=srcArr[i];
        }

        //获取最大数的位数
        int maxLength = getNumberLength(max);

        //基数排序位数循环索引
        int index=0;
        while (index<maxLength){
            int[] tmpArr = new int[srcArr.length];
            int[] bucketArr = new int[10];

            System.arraycopy(srcArr, 0, tmpArr, 0, srcArr.length);

            //①、0~9号桶中，每个桶中应装多少个数
            for(int i=0; i<srcArr.length; i++){
                bucketArr[getNumberIndex(index,srcArr[i])]++;
            }

            //②、此处计算每个桶在元素数量上索引的终止位置，即如果0号桶中有3个元素，
            //1号桶中有5个元素，那么1号桶在整体元素数组上的终止索引应该是（3+5）-1
            for(int i=1;i<bucketArr.length;i++){
                bucketArr[i]=bucketArr[i]+bucketArr[i-1];
            }

            //③、按照②中的索引，基于基数重新排序数组
            for(int i=srcArr.length-1;i>=0;i--){
                srcArr[--bucketArr[getNumberIndex(index, tmpArr[i])]] = tmpArr[i];
            }

            index++;
        }
    }

    /**
     * 获取数字长度
     * @param num
     * @return
     */
    private static int getNumberLength(int num){
        int count = 1;
        int index = 1;

        while ((int)(num-Math.pow(10,index))>0){
            count++;
            index++;
        }
        return count;
    }

    /**
     * 获取数字number对应索引index上的数字
     * @param index
     * @param number
     * @return
     */
    private static int getNumberIndex(int index, int number){
        int num = 0;
        num = (int)(number/Math.pow(10,index))%10;
        return num;
    }



}
