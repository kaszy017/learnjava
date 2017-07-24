package test.file;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by kaszy on 2017-07-23 22:06.
 */
public class FileInputStreamTest {
    public static void main(String[] args) throws IOException{
        //创建字节输入流,读取本文件
        FileInputStream fis = new FileInputStream("D:\\gitrepo\\learnjava\\src\\main\\java\\test\\file\\FileInputStreamTest.java");
        //创建一个长度为1024的竹筒
        byte[] bbuf = new byte[1024];
        //用于保存实际读取的字节数；
        int hasRead = 0;
        //使用循环来重复取水过程
        while ((hasRead = fis.read(bbuf)) >0){
            //取出竹筒中的水滴(字节)，将字节数组转换为字符串输入
            System.out.println(new String(bbuf,0,hasRead));
        }
        //关闭文件输入流，放在finally快里更安全
        fis.close();
    }
}
