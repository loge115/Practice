package homework;

import java.util.Scanner;

public class Day02_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数");
        int b = sc.nextInt();
        System.out.println("请输入第三个整数");
        int c = sc.nextInt();
        System.out.println("最小值为:"+ getmin(a,b,c));

    }
    public static int getmin(int a,int b,int c){
        int min = a;
        min = a<b?a:b;
        min = min < c? min:c;
        return min;
    }
}
