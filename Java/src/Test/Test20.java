package Test;

import java.io.*;

/**
 * @author loge
 * @date 2019-09-27 10:29
 */
public class Test20 {
    public static void main(String[] args) throws IOException{
        File srcFile = new File("C:\\Users\\24574\\Desktop\\test");
        File destFile = new File("C:\\Users\\24574\\Desktop\\Java");
        copyFolder(srcFile,destFile);
    }

    private static void copyFolder(File srcFile, File destFile) throws IOException{
        if (srcFile.isDirectory()){
            String srcFileName = srcFile.getName();
            File newFolder = new File(destFile, srcFileName);
            if (!newFolder.exists()){
                newFolder.mkdir();
            }
            File[] listFiles = srcFile.listFiles();
            for (File file:listFiles){
                copyFolder(file,newFolder);
            }
        }else {
            File newFile = new File(destFile, srcFile.getName());
            copyFile(srcFile,newFile);
        }
    }
    public static void copyFile (File srcFile,File destFile) throws IOException {
        //采用字节流写入
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        byte[] bytes = new byte[2048];
        int len;
        if ((len = bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();
    }
}
