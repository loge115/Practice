package day22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

/**
 * @author loge
 * @date 2019-10-07 9:20
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            byte[] by = line.getBytes();
            DatagramPacket dp = new DatagramPacket(by, by.length, InetAddress.getByName("Loge-Laptop"), 12345);
            if (line.equals("886")) {
                break;
            } else {
                ds.send(dp);
            }
        }
        ds.close();
    }
}
