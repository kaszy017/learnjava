package test.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static test.common.constant.OUTPUTURL;

/**
 * Created by kaszy on 2017-07-23 23:16.
 */
//用printstream处理流包装outputstream节点流
public class PrintStreamTest {
    public static void main(String[] args) {
        try(
            FileOutputStream fos = new FileOutputStream(OUTPUTURL + "outputfile3.txt");
            PrintStream ps = new PrintStream(fos)
            )
        {
            //使用printsream执行输出
            ps.println("普通字符串");
            ps.println(new PrintStreamTest());
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

}
