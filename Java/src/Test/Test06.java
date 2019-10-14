package Test;

import java.util.Scanner;
//用户名，密码登陆
public class Test06 {
    public static void main(String[] args) {
        int count = 3;
        String userName = "loge";
        int userPassword = 123456;
        boolean flagRun=false;
        while (count>=0){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户姓名:");
            String name = sc.nextLine();
            System.out.println("请输入用户密码");
            int password = sc.nextInt();
            if (name.equals(userName)&&password==userPassword){
                System.out.println("登陆成功，欢迎"+name+"访问");
                flagRun = true;
                break;
            }else {
                if (count>0){
                System.out.println("账号或者密码错误，请重新输入！剩余"+count+"次尝试");
                count--;
                }else {
                    System.out.println("账户被锁定，请联系管理员解锁");
                    break;
                }
            }
        }
        //主程序运行
        if (flagRun){
            System.out.println("程序开始运行~~~~~");
        }
    }
}
