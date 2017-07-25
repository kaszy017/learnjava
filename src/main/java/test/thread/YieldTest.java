package test.thread;

/**
 * Created by kaszy on 2017-07-26 00:56.
 */

/*
* 23、29行有注释时，优先级一样，第一个暂停了，第二个开始
* 23、29行无注释时，第一个会一直执行，不会被暂停
* 多cpu机器可能看不到该效果
* */

public class YieldTest extends Thread{
    public YieldTest(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println(getName()+" "+i);
            //当i=20时，用yield方法让当前线程让步
            if(i==20){
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) throws Exception{
        //启动两个并发线程
        YieldTest yt1 = new YieldTest("高级");
        //将yt1线程设置成最高优先级
        yt1.setPriority(Thread.MAX_PRIORITY);
        yt1.start();

        YieldTest yt2 = new YieldTest("低级");
        //将yt2线程设置成最第低优先级
        yt2.setPriority(Thread.MIN_PRIORITY);
        yt2.start();
    }
}
