package test.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static test.common.constant.OUTPUTURL;

/**
 * Created by kaszy on 2017-07-24 23:53.
 */
//重定向标准输出流，将system.out输出重定向到文件输出
public class RedirectOut {
    public static void main(String[] args) {
        try(
            //一次性创建PrintStream输出流
            PrintStream ps = new PrintStream(new FileOutputStream(OUTPUTURL+"outputfile4.txt"));
            )
        {
            //将标准输出重定向到ps输出流
            System.setOut(ps);
            //向标准输出输出一个字符串
            System.out.println("普通字符串");
            //向标准输出输出一个对象
            System.out.println(new RedirectOut());
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
