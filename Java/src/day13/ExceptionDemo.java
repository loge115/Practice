package day13;

import java.util.Scanner;

/**
 * @author loge
 * @date 2019-09-14 20:53
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数:");
        int i = sc.nextInt();
        Teacher t = new Teacher();
        try {
            t.score(i);
        } catch (ScoreException e) {
            e.printStackTrace();
        }
    }
}
