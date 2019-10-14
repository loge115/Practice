package Test;

import java.util.Scanner;

//字符串反转
public class Test09 {
    public static void main(String[] args) {
        System.out.println(reverse());
    }
    /*字符串反转,效率低
    public static String reverse(String s){
        String rs = "";
        for (int i=s.length()-1;i>=0;i--){
            rs += s.charAt(i);
        }
        return rs;
    }
     */
    //StringBuild对象对字符串反转
    public static String reverse(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要反转的字符串");
        String string = sc.nextLine();
        StringBuilder sb = new StringBuilder(string);
        String s = sb.reverse().toString();
        return s;
    }
}
