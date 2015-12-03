package common;

/**
 * Created by gitwp on 15-12-2.
 */
public class Swap {
    public static void swap(int[] srcArr, int src, int dest) {
        int temp = srcArr[src];
        srcArr[src] = srcArr[dest];
        srcArr[dest] = temp;
    }
}
