package code;

/**
 * @author loge
 * @date 2019-09-29 14:53
 */
public class Maths {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println(time);
    }
}
