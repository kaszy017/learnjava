package test.others;

/**
 * Created by kaszy on 2017-07-20 01:25.
 */
public class testStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("java");//追加
        System.out.println(sb);
        sb.insert(0 ,"hello ");//插入
        System.out.println(sb);
        sb.replace(5,6,",");//替换
        System.out.println(sb);
        sb.delete(5,6);//删除
        System.out.println(sb);
        sb.reverse();//反转
        System.out.println(sb);
        System.out.println("sb的长度：" + sb.length());
        System.out.println("sb的容量：" + sb.capacity());
        sb.setLength(5);//改变长度，只保留前面部分
        System.out.println(sb);
    }
}
