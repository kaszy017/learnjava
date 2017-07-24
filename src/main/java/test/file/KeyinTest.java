package test.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kaszy on 2017-07-24 23:43.
 */
//将键盘输入的文本内容转换为字符输入流(输出键盘输入的内容）
public class KeyinTest {
    public static void main(String[] args) {
        try(
            //将system.in对象转换为Reader对象
            InputStreamReader reader = new InputStreamReader(System.in);
            //将普通的Reader包装成BufferedReader
            BufferedReader br = new BufferedReader(reader)
            )
        {
            String line = null;
            //采用循环方式来逐行读取
            while ((line = br.readLine())!=null){
                //如果读取的字符串为“exit”,则程序退出
                if(line.equals("exit")){
                    System.exit(1);
                }
                //打印读取的内容
                System.out.println("输入内容为：" + line);
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
