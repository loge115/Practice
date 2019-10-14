package Test;
//复制txt文件
import java.beans.JavaBean;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author loge
 * @date 2019-09-18 21:11
 */
public class Test17 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\24574\\Desktop\\说好不哭简介.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\24574\\Desktop\\test\\说好不哭简介.txt");
        byte[] bys = new byte[2048];
        int len;
        while ((len = fis.read(bys))!=-1){
            fos.write(bys);
            String s = new String(bys, 0, len, "utf-8");
            System.out.print(s);
        }
        fos.close();
        fis.close();
    }
}
