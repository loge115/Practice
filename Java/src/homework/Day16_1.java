package homework;

import java.util.*;

/**
 * @author loge
 * @date 2019-10-12 10:21
 */
public class Day16_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s = sc.nextLine();
        TreeMap<Character, Integer> tm = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean b = tm.containsKey(c);
            if (b){
                Integer value = tm.get(c);
                tm.put(c,++value);
            }else {
                tm.put(c,1);
            }
        }
        for (Map.Entry<Character, Integer> entry : tm.entrySet()) {
            System.out.print(entry.getKey()+"["+entry.getValue()+"]");
        }
    }
}
