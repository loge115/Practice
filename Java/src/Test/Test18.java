package Test;

import java.io.*;
//利用字节数组流复制图片

/**
 * @author loge
 * @date 2019-09-20 8:58
 */
public class Test18 {
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
//        FileOutputStream fos = null;
//        FileInputStream fis = null;
        try {
            byte[] bys = new byte[2048];
//            fis = new FileInputStream("C:\\Users\\24574\\Desktop\\1.jpg");
//            fos = new FileOutputStream("C:\\Users\\24574\\Desktop\\test\\1.jpg");
            bis = new BufferedInputStream(new FileInputStream("C:\\\\Users\\\\24574\\\\Desktop\\\\1.jpg"));
            bos = new BufferedOutputStream(new FileOutputStream("C:\\\\Users\\\\24574\\\\Desktop\\\\test\\\\1.jpg"));
            int len;
            while ((len = bis.read(bys)) != -1) {
                bos.write(bys, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bos != null || bis != null) {
                try {
                    bos.close();
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
