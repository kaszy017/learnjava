package test.thread.quqian;

/**
 * Created by kaszy on 2017-07-27 00:09.
 */
public class DrawTest {
    public static void main(String[] args) {
        //创建一个账户
        Account acct = new Account("123",1000);
        new DrawThread("甲同学",acct,800).start();
        new DrawThread("乙同学",acct,800).start();
    }
}
