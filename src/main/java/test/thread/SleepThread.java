package test.thread;

import java.util.Date;

/**
 * Created by kaszy on 2017-07-26 00:48.
 */
public class SleepThread {
    public static void main(String[] args) throws Exception{
        for(int i=0;i<10;i++){
            System.out.println("当前时间："+new Date());
            //调用sleep方法让当前线程(主线程)暂停1s
            //可看到输出的字符串之间间隔为1s
            Thread.sleep(1000);
        }
    }
}
