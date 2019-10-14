package code;


import java.io.*;
import java.util.function.Function;

/**
 * @author loge
 * @date 2019-10-12 11:40
 */
public class Test {
    public static void main(String[] args) throws IOException {
//        search(f);
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\24574\\Desktop\\heimait\\就业班视频\\6-10\\day08_File&递归&字节流\\素材\\itcast\\mn.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Java\\copy.jpg"));
        byte[] by=new byte[2048];
        int line;
        while ((line=bis.read(by))!=-1){
            bos.write(by,0,line);
        }
        bis.close();
        bos.close();
    }

    public static void search(File f) {
        File[] listFiles = f.listFiles();
        if (listFiles.length == 0) {
            System.out.println(f.getAbsolutePath() + "(空文件夹)");
        }
        for (File file : listFiles) {
            if (file != null) {
                if (file.isDirectory()) {
                    search(file);
                } else if (file.isFile()) {
                    String fileName = file.getName();
                    StringBuilder sb = new StringBuilder();
                    for (int i = fileName.length() - 4; i < fileName.length(); i++) {
                        sb.append(fileName.charAt(i));
                    }
                    String s = sb.toString();
                    if (s.equals("java")) {
                        System.out.println(file.getAbsolutePath());
                    }
                }
            }
        }
    }
}
