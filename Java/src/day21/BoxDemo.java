package day21;

/**
 * @author loge
 * @date 2019-10-06 11:58
 */
public class BoxDemo {
    public static void main(String[] args) {
        MilkBoxes boxes = new MilkBoxes();
        Producer producer = new Producer(boxes);
        Customer customer = new Customer(boxes);
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(customer);
        t1.start();
        t2.start();
    }
}
