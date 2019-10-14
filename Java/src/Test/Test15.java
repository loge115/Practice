package Test;

import java.util.*;

/**
 * @author loge
 * @date 2019-09-18 8:48
 */
public class Test15 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        String[] colors = {"♥", "♠", "♦", "♣"};
        String[] nums = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        HashMap<Integer, String> hm = new HashMap<>();
        int index = 0;
        for (String num : nums) {
            for (String color : colors) {
                hm.put(index++, color + num);
            }
        }
        hm.put(index++, "小🃏");
        hm.put(index, "大🃏");
        Set<Integer> set = hm.keySet();
        TreeSet<Integer> loge = new TreeSet<>();
        TreeSet<Integer> wx = new TreeSet<>();
        TreeSet<Integer> yuan = new TreeSet<>();
        TreeSet<Integer> dp = new TreeSet<>();
        for (Integer integer : set) {
            al.add(integer);
        }
        Collections.shuffle(al);
        for (int i = 0; i < al.size(); i++) {
            Integer x = al.get(i);
            if (i > al.size() - 3) {
                dp.add(x);
            } else if (i % 3 == 0) {
                loge.add(x);
            } else if (i % 3 == 1) {
                wx.add(x);
            } else {
                yuan.add(x);
            }
        }
        getLook("loge", loge, hm);
        getLook("wx", wx, hm);
        getLook("yuan", yuan, hm);
        getLook("底牌", dp, hm);
    }

    public static void getLook(String name, TreeSet<Integer> ts, HashMap hm) {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("牌组:");
        for (Integer index : ts) {
            sb.append(hm.get(index)).append(" ");
        }
        System.out.println(sb.toString());
    }
}
