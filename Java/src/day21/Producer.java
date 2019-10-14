package day21;

/**
 * @author loge
 * @date 2019-10-06 11:54
 */
public class Producer implements Runnable{
    private MilkBoxes box;
    public Producer(MilkBoxes box) {
        this.box=box;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            box.put(i);
        }
    }
}
