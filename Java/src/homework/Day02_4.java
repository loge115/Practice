package homework;

import java.util.Scanner;
/*
输入工资,扣除三险一金10%,计算税后工资
0 ~ 3000元的部分，交税3%

​	3000 ~ 12000元的部分，交税10%

​	12000 ~ 25000的部分 ， 交税20%

​	25000 ~ 35000的部分，交税25%

​	35000 ~ 55000的部分，交税30%

​	55000 ~ 80000的部分，交税35%

​	超过80000的部分，交税45%
 */
public class Day02_4 {
    public static void main(String[] args) {
        salary();
    }
    public static void salary() {
        //初始化税后工资
        double salaryTaxed = 0;
        //初始化税金
        double tax = 0;
        //循环判断条件
        boolean flag = true;
        while (true) {
            System.out.println("请输入工资(大于0):");
            System.out.println("输入0退出查询");
            Scanner sc = new Scanner(System.in);
            double salary = sc.nextDouble();
            //三险一金后工资,扣除10%,余下90%
            double salaryPayed = salary * 0.9;
            if (salaryPayed > 0&&salaryPayed <= 5000) {
                tax = 0;
            } else if (salaryPayed > 5000 && salaryPayed <= 8000) {
                tax = (salaryPayed - 5000) * 0.03;
            } else if (salaryPayed > 8000 && salaryPayed <= 17000) {
                tax = 3000 * 0.03 + (salaryPayed - 8000) * 0.1;
            } else if (salaryPayed > 17000 && salaryPayed <= 30000) {
                tax = 3000 * 0.03 + +9000 * 0.1 + (salaryPayed - 17000) * 0.2;
            } else if (salaryPayed > 30000 && salaryPayed <= 40000) {
                tax = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + (salaryPayed - 30000) * 0.25;
            } else if (salaryPayed > 40000 && salaryPayed <= 60000) {
                tax = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + (salaryPayed - 40000) * 0.3;
            } else if (salaryPayed > 60000 && salaryPayed <= 85000) {
                tax = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + 20000 * 0.3 + (salaryPayed - 55000) * 0.35;
            } else if (salaryPayed>85000){
                tax = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + 20000 * 0.35 + 25000 * 0.35 + (salaryPayed - 80000) * 0.45;
            }else if (salaryPayed == 0){
                System.out.println("退出查询");
                flag = false;
                break;
            }else {
                System.out.println("输入工资有误,请重新输入!");
            }
            if (salaryPayed <= 0){
                continue;
            }else {
            salaryTaxed = salaryPayed - tax;
            System.out.println("需交税金:" + tax + "," + "税后工资:" + salaryTaxed);
            }
        }
    }
}
