package test.thread.quqian;

/**
 * Created by kaszy on 2017-07-26 23:39.
 */

/**
 * 模拟取钱操作项目
 * 取钱的线程类
 * */
public class DrawThread extends Thread{
    private Account account; //模拟用户账户
    private double drawAmount; //当前取钱线程所希望取的钱数
    public DrawThread(String name,Account account,double drawAmount){
        super(name);
        this.account = account;
        this.drawAmount = drawAmount;
    }
    //多个线程改动同一共享数据涉及安全问题
    public void run(){
        //使用account作为同步监听器，任何进程进入下面同步代码块之前必须先获得对account
        //账户的锁定,其他线程无法获得锁，无法修改
        synchronized (account){
            //账户余额大于取钱数目
            if (account.getBalance() >= drawAmount){
                //吐出钞票
                System.out.println(getName()+"取钱成功！吐出钞票："+drawAmount);
                //保证任意时刻只有一个线程可以进入修改共享资源的代码区(临界区)
                try{
                    Thread.sleep(1);
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
                //修改余额
                account.setBalance(account.getBalance()-drawAmount);
                System.out.println("\t余额为："+account.getBalance());
            }
            else {
                System.out.println(getName()+"取钱失败，余额不足");
            }
        }
        //同步代码块结束，该线程释放同步锁
    }
}
