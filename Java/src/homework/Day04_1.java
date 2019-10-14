package homework;

import java.util.Random;

/**
 * @author loge
 * @date 2019-09-13 9:38
 */
public class Day04_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        double[] arr1 = {12.9,53.54,75.0,99.1,3.14};
        int[] arr2 = {72,89,65,87,91,82,71,93,76,68};
        double[] arr3 = {10.4,-3,-6.2,1.2,-6.1,-19,-3.8,0.9,-4.5,5.5};
        arrayPrint(arr);
        getMin(arr1);
        System.out.println("数组和为"+getSum(getRandom()));
        System.out.println(getInt(arr));
        System.out.println("数组平均数为"+(getSum(arr2)*1.0/arr2.length));
        getCount(arr3);
        int i = Integer.valueOf(100);
        int i1 = Integer.valueOf("100");


    }
    public static void arrayPrint(int[] arr){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(",");
            }
        }
        String s = sb.toString();
        System.out.println(s);
    }
    public static void getMin(double[] arr){
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = min<arr[i]?min:arr[i];
        }
        System.out.println("最小值"+min);
    }
    //获得一个长度为6的随机数组
    public static int[] getRandom(){
        Random r = new Random();
        int[] arr =new int[6];
        for (int i = 0; i < arr.length; i++) {
            int r1 = r.nextInt(99);
            arr[i] = r1+1;
        }
        System.out.print("随机数组是:");
        arrayPrint(arr);
        return arr;
    }
    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static int getInt(int[] arr){
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = 10*num +arr[i];
        }
        return num;
    }
    public static void getCount(double[] arr){
        int count =0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                count++;
            }else if (arr[i]<0){
                count1++;
            }else {
                count2++;
            }
        }
        System.out.println("大于0个数是"+count+"个");
        System.out.println("小于0的个数是"+count1+"个");
        System.out.println("等于0的个数是"+count2+"个");
    }
}
