package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Day03_1 {
    public static void main(String[] args) {
        calculate();
     /*计算10块钱能换多少1块和5角
        for (int i =0;i<=10;i++){
         int j = (10-i)*2;
         System.out.println("能换1块钱"+i+"张,5角钱"+j+"张");
     }

      */
     /*列出1988-2025年之间所有的闰年
     for (int i =1988;i<=2025;i++){
         if ((i%4==0&&i%100!=0)||i%400==0){
             System.out.println(i+"年是闰年");
         }
     }

      */
     /*计算水灌满10L需要的时间
     int l = 0;
     int count = 1;
     int put = 1;
     while(l<10){
         l = l + count*(put - 3);
         count++;
         put++;
         if (l<0){
             l = 0;
         }
     }
        System.out.println("需要"+count+"分钟后水灌满10L");

      */
    }
    public static void calculate(){
        Scanner sc = new Scanner(System.in);
        //数组动态加载
        int[] arr = new int[2];
        for (int i =0;i<2;i++){
            System.out.println("请输入第"+(i+1)+"个数");
            int x = sc.nextInt();
            arr[i]=x;
        }
        System.out.println("请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法): 1");
        int choose = sc.nextInt();
        if (choose == 1){
            int sum = 0;
            for (int i =0 ;i<arr.length;i++){
                sum +=arr[i];
            }
            System.out.println("结果为"+sum);
        }else if (choose ==2){
            int sum = arr[0];
            for (int i =1 ;i<arr.length;i++){
                sum -=arr[i];
            }
            System.out.println("结果为"+sum);
        }else if (choose==3){
            int t = 1;
            for (int i =0 ;i<arr.length;i++){
                t *=arr[i];
            }
            System.out.println("结果为"+t);
        }else if (choose ==4){
            double d = arr[0];
            for (int i =1 ;i<arr.length;i++){
                d /=arr[i];
            }
            System.out.println("结果为"+d);
        }
    }
}
