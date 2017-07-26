package test.thread.quqian;

/**
 * Created by kaszy on 2017-07-26 23:42.
 */

/**
 * 模拟取钱操作项目
 * 账户类
 * */
public class Account {
    private String accountNo;
    private double balance;
    public Account(){}
    //构造器
    public Account(String accountNo,double balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //下面两个方法根据accountNo来重写hashCode()和equals()方法
    public int hashCode(){
        return accountNo.hashCode();
    }
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj != null && obj.getClass() == Account.class){
            Account target = (Account)obj;
            return target.getAccountNo().equals(accountNo);
        }
        return false;
    }
}
