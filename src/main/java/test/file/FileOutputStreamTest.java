package test.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static test.common.constant.JAVAURL;
import static test.common.constant.OUTPUTURL;

/**
 * Created by kaszy on 2017-07-23 22:45.
 */
public class FileOutputStreamTest {
    public static void main(String[] args) {
        try {
            //创建字节输入流
            FileInputStream fis = new FileInputStream(JAVAURL +"test\\file\\"
                + "FileOutputStreamTest.java");
            //创建字节输出流
            FileOutputStream fos = new FileOutputStream(OUTPUTURL + "outputfile1.txt");
            byte[] bbuf = new byte[32];
            int hasread = 0;
            while ((hasread=fis.read(bbuf))>0){
                fos.write(bbuf,0,hasread);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
