package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * @author loge
 * @date 2019-09-16 9:26
 */
public class Test {
    public static void main(String[] args) {
//        fn();
//        fn1();
        fn2();
//        fn3();
    }

    public static void fn() {
        int[] arr = new int[5];
        ArrayList<Integer> l = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int x = r.nextInt(99) + 1;
            arr[i] = x;
            l.add(x);
        }
        System.out.println(l);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入2~5之间的一个数字:");
        int num = sc.nextInt();
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) % num == 0) {
                l1.add(l.get(i));
            }
        }
        System.out.println("符合条件的元素为:" + l1);
    }

    public static void fn1() {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第" + (i + 1) + "个1-60之间的数字:");
            int n = sc.nextInt();
            arr[i] = n;
        }
        Random r = new Random();
        int num = r.nextInt(9) + 2;
        System.out.println("生成的随机数为:" + num);
        List<Integer> arr1 = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % num != 0) {
                arr1.add(arr[i]);
            }
        }
        System.out.println("符合条件的元素为:");
        System.out.println(arr1);
    }

    public static void fn2() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("请输入字符串进行转换,输入end结束");
            String n = sc.nextLine();
            if (n.equals("end")) {
                System.out.println("结束");
                flag = false;
            } else {
                char[] chars = n.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    if (chars[i] >= 'a' && chars[i] <= 'z') {
                        chars[i] = Character.toUpperCase(chars[i]);
                    } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                        chars[i] = Character.toLowerCase(chars[i]);
                    } else {
                        chars[i] = '*';
                    }
                }
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < chars.length; i++) {
                    sb.append(chars[i]);
                }
                String string = sb.toString();
                System.out.println("输出结果:" + string);
            }
        }
    }

    public static void fn3() {
        int[] arr1 = new int[5];
        Random random = new Random();
        for (int i = 0; i < arr1.length; i++) {
            int r = random.nextInt(9) + 1;
            arr1[i] = r;
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        int[] arr2 = new int[2];
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                count2++;
            }
            if (arr1[i] % 3 == 0) {
                count3++;
            }
        }
        arr2[0] = count2;
        arr2[1] = count3;
        for (int j = 0; j < arr2.length; j++) {
            System.out.println(arr2[j]);
        }
    }
}
