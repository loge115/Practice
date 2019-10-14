package day22;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author loge
 * @date 2019-10-07 11:46
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(12345);
        while (true) {
            Socket s = ss.accept();
            Thread t = new Thread(new ServerThread(s));
            t.start();
        }
//        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\24574\\Desktop\\Java\\ts.txt"));
//        String line;
//        while((line=br.readLine())!=null) {
//            bw.write(line);
//            bw.newLine();
//            bw.flush();
//        }
//        BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
//        bwServer.write("文件上传成功");
//        bw.newLine();
//        bw.flush();

//        ss.close();
    }
}
