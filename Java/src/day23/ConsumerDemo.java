package day23;

import java.util.function.Consumer;

/**
 * @author loge
 * @date 2019-10-11 21:08
 */
public class ConsumerDemo {
    public static void main(String[] args) {
        String[] str = {"林青霞,30", "张曼玉,35", "王祖贤,33"};
        for (String s : str) {
            getInfo(s, info -> System.out.println("姓名:"+info.split(",")[0]),
                    info -> System.out.println("年龄:"+info.split(",")[1]));
        }
    }

    public static void getInfo(String info, Consumer<String> con1, Consumer<String> con2) {
        con1.andThen(con2).accept(info);
    }
}
