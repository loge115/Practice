package Test;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author loge
 * @date 2019-09-20 17:08
 */
public class Test19 {
    public static void main(String[] args) throws IOException {
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\24574\\Desktop\\说好不哭简介.txt"));
        FileReader fr = new FileReader("C:\\Users\\24574\\Desktop\\说好不哭简介.txt");
        char[] chs = new char[2048];
        int len;
        while ((len=fr.read(chs))!=-1){
            System.out.println(new String(chs,0,len));
        }
        fr.close();
    }
}
