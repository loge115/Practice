package Test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author loge
 * @date 2019-09-13 15:02
 */
public class Test11 {
    public static void main(String[] args) {
        String s = "123,24,145,46,12,54";
        System.out.println(getStringSort(s));

    }
    public static String getStringSort(String s){
        //按照,对字符串进行分割,形成新的字符串数组
        String[] split = s.split(",");
        int[] n = new int[split.length];
        //将字符串转换为整型数组
        for (int i = 0; i < split.length; i++) {
            n[i] = Integer.parseInt(split[i]);
        }
        //对数组进行排序
        Arrays.sort(n);
        //将排序后的数组添加到StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n.length; i++) {
            if (i == n.length){
                sb.append(n[i]);
            }else {
                sb.append(n[i]).append(",");
            }
        }
        //转换为字符串
        String s1 = sb.toString();
        return s1;
    }
}
