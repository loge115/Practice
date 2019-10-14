package day22;

import java.io.*;
import java.net.Socket;

/**
 * @author loge
 * @date 2019-10-07 15:12
 */
public class ServerThread implements Runnable {
    private Socket s;

    public ServerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            int count = 0;
            String fileName = "file[" + count + "].txt";
            File file = new File("C:\\Users\\24574\\Desktop\\Java\\"+fileName);
            while (file.exists()) {
                count++;
                fileName = "file[" + count + "].txt";
                file = new File("C:\\Users\\24574\\Desktop\\Java\\"+fileName);
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bwServer.write(fileName+"上传成功!");
            bwServer.newLine();
            bwServer.flush();
            s.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
