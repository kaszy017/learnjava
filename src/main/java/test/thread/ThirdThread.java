package test.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Created by kaszy on 2017-07-26 00:09.
 */
public class ThirdThread {
    public static void main(String[] args) {
        //创建callable对象
        ThirdThread rt = new ThirdThread();
        //使用Lamba表达式创建Callable<Intager>对象
        //使用FutureTask来包装Callable对象
        FutureTask<Integer> task = new FutureTask<Integer>((Callable<Integer>)()->{
            int i = 0;
            for (;i<100;i++){
                System.out.println(Thread.currentThread().getName()+"的循环变量i的值为："+i);
            }
            //call()方法可以有返回值
            return i;
        });
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"的循环变量i的值为："+i);
            if(i==20){
                //实质还是以callable对象来创建并启动线程的
                new Thread(task,"有返回值的线程").start();
            }
        }
        try{
            //获取线程返回值
            System.out.println("子线程的返回值："+task.get());
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
