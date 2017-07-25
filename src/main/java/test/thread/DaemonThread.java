package test.thread;

/**
 * Created by kaszy on 2017-07-26 00:39.
 */
public class DaemonThread extends Thread {
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println(getName()+" " +i);
        }
    }

    public static void main(String[] args) {
        DaemonThread t = new DaemonThread();
        //将此线程设置成后台新车
        t.setDaemon(true);
        //启动后台线程
        t.start();
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
        //程序执行到此处，前台线程（main线程）结束
        //后台线程也随之结束(无法运行到999)
    }
}
