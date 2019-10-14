package day20;

/**
 * @author loge
 * @date 2019-09-28 21:15
 */
public class ThreadDemon {
    public static void main(String[] args) {
        ThreadControl tc1 = new ThreadControl("关羽");
        ThreadControl tc2 = new ThreadControl("张飞");
        //设置线程优先级
//        tc1.setPriority(10);
//        tc2.setPriority(1);
        //查看线程优先级
//        System.out.println(tc1.getPriority());
//        System.out.println(tc2.getPriority());

        //等待tc1线程完成后,其他线程才能执行
//        try {
//            tc1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //设置主线程
        Thread.currentThread().setName("刘备");
        //设置守护线程
        tc1.setDaemon(true);
        tc2.setDaemon(true);
        tc1.start();
        tc2.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }

    }
}
