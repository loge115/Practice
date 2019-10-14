package Test;

import java.util.Random;
import java.util.Scanner;

/**
 * @author loge
 * @date 2019-09-18 18:37
 */
public class Test16 {
    public static void main(String[] args) {
        confirm();

    }
    public static String authCode(){
        StringBuilder sb = new StringBuilder();
        for (char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        for (char ch='A';ch<='Z';ch++){
            sb.append(ch);
        }
        for (int i = 0;i<10;i++){
            sb.append(i);
        }
        Random r = new Random();
        String code = "";
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(42);
            char c = sb.charAt(index);
            code+=c;
        }
        return code;
    }
    public static void confirm(){
        while (true){
        String code = authCode();
        Scanner scanner = new Scanner(System.in);
        System.out.println("生成的验证码是:"+code);
        System.out.println("请输入验证码");
        String inputCode = scanner.nextLine();
        if (code.equalsIgnoreCase(inputCode)){
            System.out.println("输入正确");
            break;
        }else {
            System.out.println("验证码输入错误,请重新输入!");
            continue;
        }
        }
    }
}
