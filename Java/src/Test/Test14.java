package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author loge
 * @date 2019-09-17 15:13
 */
public class Test14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s = sc.nextLine();
        Map<Character,Integer> m = new HashMap<Character, Integer>();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer integer = m.get(c);
            if (integer==null){
                m.put(c,1);
            }else {
                integer++;
                m.put(c,integer);
            }
        }
        Set<Map.Entry<Character, Integer>> entrySet = m.entrySet();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> me:entrySet){
            sb.append(me.getKey()).append("[").append(me.getValue()).append("]");
        }
        String string = sb.toString();
        System.out.println(string);
    }


}
