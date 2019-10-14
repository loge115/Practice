package day21;

/**
 * @author loge
 * @date 2019-10-06 11:57
 */
public class Customer implements Runnable {
    private MilkBoxes box;

    public Customer(MilkBoxes box) {
        this.box = box;
    }

    @Override
    public void run() {
        while (true) {
            box.get();
        }
    }
}
