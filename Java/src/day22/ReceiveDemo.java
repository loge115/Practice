package day22;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author loge
 * @date 2019-10-07 9:20
 */
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(12345);
        byte[] by = new byte[1024];
        while (true) {
            DatagramPacket dp = new DatagramPacket(by, by.length);
            ds.receive(dp);
            System.out.println("数据是:" + new String(dp.getData(), 0, dp.getLength()));
            //直接输出是字节
//        System.out.println("数据是:" + dp.getData());
        }
//        ds.close();
    }
}
