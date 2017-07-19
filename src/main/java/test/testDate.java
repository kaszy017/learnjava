package test;

import java.util.Date;

/**
 * Created by kaszy on 2017-07-20 02:00.
 */
public class testDate {
    public static void main(String[] args) {
        //第一种构造器，生成一个代表当前时间的date对象
        Date d1 = new Date();
        //第二种构造器，根据指定的long型整数（与19700101000000之间的时间差，以毫秒作单位）生成date对象
        Date d2 = new Date(System.currentTimeMillis() + 100);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d1.compareTo(d2));
        System.out.println(d1.before(d2));
    }
}
