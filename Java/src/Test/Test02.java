package Test;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args){
        month();
    }
    public static void month(){
        while (true) {
            System.out.println("请输入一个月份:");
            Scanner sc = new Scanner(System.in);
            int month = sc.nextInt();
            if (month < 1 || month > 12) {
                System.out.println("输入月份有误,请重新输入");
            }else {
                switch (month){
                    case 1:
                    case 2:
                    case 12:
                        System.out.println("冬季");
                        break;
//                    case 2:
//                        System.out.println("冬季");
//                        break;
//                    case 12:
//                        System.out.println("冬季");
//                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("春季");
                        break;
//                    case 4:
//                        System.out.println("春季");
//                        break;
//                    case 5:
//                        System.out.println("春季");
//                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("夏季");
                        break;
//                    case 7:
//                        System.out.println("夏季");
//                        break;
//                    case 8:
//                        System.out.println("夏季");
//                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println("秋季");
                        break;
//                    case 10:
//                        System.out.println("秋季");
//                        break;
//                    case 11:
//                        System.out.println("秋季");
//                        break;
                }
                break;
            }
        }
    }
}
