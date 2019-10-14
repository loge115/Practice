package Test;

import java.util.Scanner;
//输入字符串，统计字符串中大写，小写，数字个数
public class Test07 {
    public static void main(String[] args) {
        System.out.println("请输入字符串:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int capitalCount = 0;
        int lowercaseCount = 0;
        int intCount = 0;
        for (int i = 0;i < input.length();i++){
            char cha = input.charAt(i);
            if (cha>='A'&&cha<='Z'){
                capitalCount++;
            }else if (cha>='a'&&cha<='z'){
                lowercaseCount++;
            }else{
                intCount++;
            }
        }
        System.out.println("该字符串有"+capitalCount+"个大写字符");
        System.out.println("该字符串有"+lowercaseCount+"个小写字符");
        System.out.println("该字符串有"+intCount+"个数字字符");
    }
}
