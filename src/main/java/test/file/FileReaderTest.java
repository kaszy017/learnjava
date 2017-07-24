package test.file;

import java.io.FileReader;
import java.io.IOException;

import static test.common.constant.TESTURL;

/**
 * Created by kaszy on 2017-07-23 22:32.
 */
public class FileReaderTest {
    public static void main(String[] args) throws IOException{
        try {
            //创建字符输入流
            FileReader fr = new FileReader(TESTURL +"file\\FileReaderTest.java");
            //创建一个长度为32的竹筒
            char[] cbuf = new char[32];
            //用于保存实际读取的字节数；
            int hasRead = 0;
            //使用循环来重复取水过程
            while ((hasRead=fr.read(cbuf))>0){
                //取出竹筒中的水滴(字节)，将字节数组转换为字符串输入
                System.out.println(new String(cbuf,0,hasRead));
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
