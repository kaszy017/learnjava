package test.others;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by kaszy on 2017-07-20 01:40.
 */
public class testRandom {
    public static void main(String[] args) {
        //普通的构造器
        //Random rand = new Random();
        //使用当前时间的构造器
        Random rand = new Random(System.currentTimeMillis());
        System.out.println("rand.nextBoolean():" + rand.nextBoolean());
        //下面3行没懂
        byte[] buffer = new byte[16];
        rand.nextBytes(buffer);
        System.out.println(Arrays.toString(buffer));
        //依次生成0.0-1.0之间的伪随机double、fload、平均值为0.0，标准差是1.0的伪高斯数
        System.out.println("rand.nextDouble()：" + rand.nextDouble());
        System.out.println("rand.nextFloat():" + rand.nextFloat());
        System.out.println("rand.nextGaussian():" + rand.nextGaussian());
        //生成一个处于int整数取值范围的伪随机整数
        System.out.println("rand.nextInt():" + rand.nextInt());
        //生成一个处于0-26之间的伪随机整数
        System.out.println("rand.nextInt(26):" +rand.nextInt(26));
        //生成一个处于long整数取值范围的伪随机整数
        System.out.println("rand.nextLong():" + rand.nextLong());

    }
}
