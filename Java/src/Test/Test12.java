package Test;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author loge
 * @date 2019-09-14 14:55
 */
public class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个具体年份:");
        int year = sc.nextInt();
        Calendar c = Calendar.getInstance();
        c.set(year,2,1);
        c.add(Calendar.DATE,-1);
        int day = c.get(Calendar.DATE);
        System.out.println(day+"天");
    }
}
