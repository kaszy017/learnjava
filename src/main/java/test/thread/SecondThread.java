package test.thread;

/**
 * Created by kaszy on 2017-07-25 23:55.
 */
//本例中两个线程可以共享该实例变量i,因此两个线程的i连续
public class SecondThread implements Runnable{
    private int i;
    public void run(){
        for(;i<100;i++){
            //档线程类实现runnable接口时
            //如果像获取当前进程，只能用thread.currentthread（）方法
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            if(i==20){
                SecondThread st = new SecondThread();
                new Thread(st,"新线程1").start();
                new Thread(st,"新线程2").start();
            }
        }
    }
}
