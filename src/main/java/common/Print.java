package common;

/**
 * Created by gitwp on 15-12-2.
 */
public class Print {

    public static void printToConsole(String str){
        System.out.println(str);
    }

    public static void printArrToConsole(int[] srcArr){
        for(int i=0;i<srcArr.length;i++){
            System.out.print(srcArr[i]+" ");
        }
        System.out.println();
    }

}
