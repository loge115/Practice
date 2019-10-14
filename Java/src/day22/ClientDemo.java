package day22;

import java.io.*;
import java.net.Socket;

/**
 * @author loge
 * @date 2019-10-07 11:46
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("Loge-Laptop",12345);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line = br.readLine())!=null){
            if (line.equals("quit")){
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.shutdownOutput();

        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = brClient.readLine();
        System.out.println("服务器反馈:"+data);

        s.close();
        br.close();
    }
}
