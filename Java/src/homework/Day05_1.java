package homework;

import java.util.ArrayList;

/**
 * @author loge
 * @date 2019-09-14 9:30
 */
//有1、2、3、4四个数字，能组成多少个互不相同且无重复数字的三位数？把这些数都输出出来，并且输出总共的个数。
public class Day05_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(getAr(arr).size());
        getTriangle(8);

    }
    //获得所有组合
    public static ArrayList<int[]> getAr(int[] arr){
        //4个数组按顺序有4个组合{2,3,4}{1,3,4}{1,2,4}{1,2,3}
        int[] arr1 = new int[3];
        ArrayList<int[]> ar = new ArrayList<int[]>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i!=j){
                int k = 0;
                arr1[k] = arr[j];
                k++;
                }
                }
            ar.add(arr1);
            }
        return ar;
        }
        public static void getTriangle(int n){
            String s = "*";
            for (int i = 1; i <= n; i++) {
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
                System.out.print(s);
                s += "**";
                System.out.println();
            }
        }
}


