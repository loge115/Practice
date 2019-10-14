package day20;

/**
 * @author loge
 * @date 2019-09-28 21:13
 */
public class ThreadControl extends Thread {
    public ThreadControl(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(getName()+":"+i);
        }
    }
}
