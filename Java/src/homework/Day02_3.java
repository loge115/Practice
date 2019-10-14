package homework;
//输入存款金额和年限,得出本利和
import java.util.Scanner;

public class Day02_3 {
    public static void main(String[] args) {
        money(amount());
    }
    public static double amount(){
        System.out.println("请输入存钱数量:");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        return amount;
    }
    public static void money(double amount) {
        while (true) {
            System.out.println("请输入年限(一年,两年,三年,五年):");
            System.out.println("输入退出来退出程序");
            Scanner sc = new Scanner(System.in);
            String year = sc.nextLine();
            if (year.equals("一年") || year.equals("两年") || year.equals("三年") || year.equals("五年")) {
                switch (year) {
                    case "一年":
                        double total_1 = amount * (1 + 0.025);
                        System.out.println("本利和:" + total_1);
                        break;
                    case "两年":
                        double total_2 = amount * (1 + 0.027 * 2);
                        System.out.println("本利和:" + total_2);
                        break;
                    case "三年":
                        double total_3 = amount * (1 + 0.0325 * 3);
                        System.out.println("本利和:" + total_3);
                        break;
                    case "五年":
                        double total_4 = amount * (1 + 0.036 * 5);
                        System.out.println("本利和:" + total_4);
                        break;
                }
            } else if (year.equals("退出")){
                System.out.println("程序退出~~");
                break;
            }else {
                System.out.println("输入有误,请重新输入!");
            }
        }
    }
}
