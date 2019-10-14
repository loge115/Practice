package day23;

import java.util.function.Supplier;

/**
 * @author loge
 * @date 2019-10-11 20:03
 */
public class SupplierDemo {
    public static void main(String[] args) {
        int[] arr={34,21,56,31,29,66};
        int maxValue = getMax(() -> {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                max = max > arr[i] ? max : arr[i];
            }
            return max;
        });
        System.out.println(maxValue);
    }
    private static int getMax(Supplier<Integer> sup){
        return sup.get();
    }
}
