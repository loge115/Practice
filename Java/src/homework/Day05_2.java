package homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

/**
 * @author loge
 * @date 2019-09-14 19:13
 */
/*
给一个数组随机存入5个不一样的整数
 */
public class Day05_2 {
    public static void main(String[] args) {
        int[] x = new int[5];
        arrayPrint(getRandom(x));
    }
    public static int[] getRandom(int[] arr){
        int index = 0;
        int[] y = new int[arr.length];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            while (true){
            int n = r.nextInt(8);
            boolean exist = exist(y,n);
            if (exist==false){
                arr[i] = n;
                y[index] = n;
                index++;
                break;
            }
            }
        }
        return arr;
    }
    public static boolean exist(int[] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num){
                return true;
            }
        }
        return false;
    }

    public static void arrayPrint(int[] array){
/*        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i==array.length-1){
                sb.append(array[i]).append("]");
            }else {
                sb.append(array[i]).append(",");
            }
        }
        String s = sb.toString();
        System.out.println(s);*/
        Collection c = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            c.add(array[i]);
        }
        System.out.println(c);
    }
}
