package test.thread;

/**
 * Created by kaszy on 2017-07-25 23:21.
 */
//本例中两个线程无法共享该实例变量i,因此两个线程的i不连续
public class FirstThread extends Thread{
    private int i;
    //重写run()方法
    public void run(){
        for( ; i < 100; i++){
            //当线程继承thread类时，直接使用this即可获取当前线程
            //thread对象的getname()方法返回当前线程的名字
            //so可以直接调用该方法返回当前线程的名字
            System.out.println(getName()+ " " + i);
        }
    }

    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            //调用thread的currentthread()方法获取当前线程——主线程
            System.out.println(Thread.currentThread().getName()+" "+i);
            if (i==20){
                //创建并启动第一个线程
                new FirstThread().start();
                //创建并启动第二个线程
                new FirstThread().start();
            }
        }
    }
}
