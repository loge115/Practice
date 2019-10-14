package homework;

/**
 * @author loge
 * @date 2019-09-15 15:46
 */
public class Day06_1 {
    public static void main(String[] args) {
        int[] arr = {68, 27, 95, 88, 171, 996, 51, 210};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int ge = arr[i] % 10;
            int shi = arr[i] / 10 % 10;
            if (ge != 7 && shi != 7 && arr[i] % 2 == 0) {
                max += arr[i];
            }
        }
        System.out.println(max);
    }
}
