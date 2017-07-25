package test.others;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by kaszy on 2017-07-20 02:15.
 */
public class testSimpleDateFormat {
    public static void main(String[] args) {
        SimpleDateFormat myFmt=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        SimpleDateFormat myFmt1=new SimpleDateFormat("yy/MM/dd HH:mm");
        //等价于now.toLocaleString()
        SimpleDateFormat myFmt2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat myFmt3=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 E ");
        SimpleDateFormat myFmt4=new SimpleDateFormat("一年中的第 D 天 一年中第w个星期 一月中第W个星期 在一天中k时 z时区");
        //自己写的，貌似小w是年中的星期，大W是月中的星期
        SimpleDateFormat s1 = new SimpleDateFormat("第D天，年第w星期，月第W星期，今天的k时，z时区");
        Date now=new Date();
        System.out.println(myFmt.format(now));
        System.out.println(myFmt1.format(now));
        System.out.println(myFmt2.format(now));
        System.out.println(myFmt3.format(now));
        System.out.println(myFmt4.format(now));
        System.out.println(s1.format(now));
        System.out.println(now.toString());

    }
}
