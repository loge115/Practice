package day21;

/**
 * @author loge
 * @date 2019-10-06 11:48
 */
public class MilkBoxes {
    private int milk;
    private boolean state = false;

    public MilkBoxes() {
    }

    public synchronized void put(int milk) {
        if (state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milk = milk;
        System.out.println("送奶工送出第" + milk + "瓶奶");
        state = true;
        notifyAll();
    }

    public synchronized void get() {
        if (!state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            System.out.println("消费者取出第" + this.milk + "瓶奶");
        state = false;
        notifyAll();
    }
}
