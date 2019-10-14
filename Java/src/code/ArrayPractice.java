package code;

import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
//        int[] array = new int[5];
//        Scanner sc=new Scanner(System.in);
//        for (int i = 0;i < array.length;i++){
//            System.out.println("请输入第"+(i+1)+"个数:");
//            int num = sc.nextInt();
//            array[i] = keyboard();
//        }
        System.out.println("随机数是" + random(100));
        int[] arrayA = {1, 2, 3, 4, 5, 6};
        int[] arrayB = {10, 11, 12, 13};
        int[] arrayD = {13, 2, 42, 18, 20, 99, 66};
        arrayPrint(sort(arrayD));
        swap(arrayA, 1, 4);
        String[] arrayC = {"wx", "aYuan", "loge", "lyu"};
        getSum(arrayA);
        getMax(arrayA);
        getMin(arrayA);
//        getReverse(arrayA);
        getSearch(arrayC, "lyu");
        getMix(arrayA, arrayB);
        average(arrayA);
    }

    public static void getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("数组和为" + sum);
    }

    public static void getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = max > array[i] ? max : array[i];
        }
        System.out.println("数组最大值为" + max);
    }

    public static void getMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            min = min < array[i] ? min : array[i];
        }
        System.out.println("数组最小值为" + min);
    }

    public static void getReverse(int[] array) {
        for (int start = 0, end = array.length - 1; start <= end; start++, end--) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
        }
        arrayPrint(array);
    }

    //数组索引
    public static void getSearch(String[] array, String key) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(key)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("没有找到相关内容");
        } else {
            System.out.println(key + "的索引为" + index);
        }
    }

    //求两个数组组合的新数组
    public static void getMix(int[] array1, int[] array2) {
        int[] arraymix = new int[array1.length + array2.length];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            arraymix[i] = array1[i];
            index++;
        }
        for (int i = 0; i < array2.length; i++) {
            arraymix[index] = array2[i];
            index++;
        }
        System.out.print("新排列数组为");
        arrayPrint(arraymix);
    }

    //求平均数
    public static void average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum * 1.0 / array.length;
        System.out.println("数组平均数为" + average);
    }

    //键盘录入
    public static int keyboard() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }

    //随机输出一个[0,a)范围内的整数
    public static int random(int a) {
        Random rd = new Random();
        int num = rd.nextInt(a);
        return num;
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
        System.out.print("更换两个索引数后的数组为:");
        arrayPrint(array);
    }

    public static void arrayPrint(int[] array) {
/*        System.out.print("[");
        for (int i = 0;i < array.length;i++){
            if (i==array.length-1){
                System.out.print(array[i]);
            }else {
                System.out.print(array[i]+",");
            }
        }
        System.out.print("]");
        System.out.println();*/
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                sb.append(array[i]).append("]");
            } else {
                sb.append(array[i]).append(",");
            }
        }
        String s = sb.toString();
        System.out.println(s);
    }

    //冒泡排序
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
/*                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;*/
                }
            }
        }
        return array;
    }
}
