package test.thread.quqian;

/**
 * Created by kaszy on 2017-07-27 00:33.
 */
//把修改balance的方法变成同步方法
public class Account2 {
    private String accountNo;
    private double balance;
    public Account2(){}
    public Account2(String accountNo,double balance){
        this.accountNo=accountNo;
        this.balance=balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    //因为账户余额不可修改，so只为balance提供getter方法
    public double getBalance() {
        return balance;
    }
    //提供一个线程安全的draw方法来完成取钱操作
    public synchronized void draw(double drawAmount){
        if(balance>=drawAmount){
            System.out.println(Thread.currentThread().getName()+"取钱成功,吐出钞票"+drawAmount);
            try {
                Thread.sleep(1);
            }catch (InterruptedException ioe){
                ioe.printStackTrace();
            }
            //修改余额
            balance -= drawAmount;
            System.out.println("\t余额为："+balance);
        }
        else{
            System.out.println("余额不足，取款失败");
        }

    }

}
