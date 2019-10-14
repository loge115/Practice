package Test;

import java.util.Scanner;
//输入星期数,输出对应计划
public class Test05 {
    public static void main(String[] args) {
        while (true) {
            System.out.print("请输入星期数查询计划:(周一~周日),输入'退出'退出查询:");
            Scanner sc = new Scanner(System.in);
            String day = sc.nextLine();
            if (day.equals("退出")){
                System.out.println("退出查询");
                break;
            }else if (day.equals("周一")){
                System.out.println("跑步");
            }else if (day.equals("周二")){
                System.out.println("游泳");
            }else if (day.equals("周三")){
                System.out.println("爬山");
            }else if (day.equals("周四")){
                System.out.println("单车");
            }else if (day.equals("周五")){
                System.out.println("拳击");
            }else if (day.equals("周六")){
                System.out.println("慢走");
            }else if (day.equals("周日")){
                System.out.println("吃一顿");
            }else {
                System.out.println("输入有误！请重新输入");
            }
        }
    }
}