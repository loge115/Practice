package Test;

import java.util.Random;
import java.util.Scanner;
//随机给一个数字，键盘输入，程序给回馈
public class Test04 {
    public static void main(String[] args){
        Random r = new Random();
        int rnum = r.nextInt(100)+1;
        int num = 0;
        while (num!=rnum){
            System.out.print("请输入1-100的一个数字:");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            if (num<rnum){
                System.out.println("猜小了");
            }else if (num>rnum){
                System.out.println("猜大了");
            }else {
                System.out.println("猜对了！");
            }


        }
    }
}
