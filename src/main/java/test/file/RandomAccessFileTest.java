package test.file;

import java.io.IOException;
import java.io.RandomAccessFile;

import static test.common.constant.OUTPUTURL;
import static test.common.constant.TESTURL;

/**
 * Created by kaszy on 2017-07-25 00:10.
 */

public class RandomAccessFileTest {
    public static void main(String[] args) {
        //从本文件第300字符位置开始读
        try(
            RandomAccessFile raf = new RandomAccessFile(TESTURL + "file\\RandomAccessFileTest.java","r");
            )
        {
            //获取RandomAccessFileTest对象文件指针的位置，初始位置为0
            System.out.println("RandomAccessFileTest对象文件指针的位置:"+raf.getFilePointer());
            //移动raf的文件记录指针到300位置
            raf.seek(300);
            byte[] bbuf = new byte[1024];
            //用于保存实际读取的字节数
            int hasread = 0;
            //使用循环来重复取水过程
            while ((hasread = raf.read(bbuf))>0){
                //取水，将字节数组转换成字符串输入
                System.out.println(new String(bbuf,0,hasread));
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
        //写
        try(
            RandomAccessFile rafw = new RandomAccessFile(OUTPUTURL+"outputfile5.txt","rw")
            )
        {
            //将记录指针移动到output.txt文件的最后
            rafw.seek(rafw.length());
            //每运行本文件一次，输出文件多写一行
            rafw.write("追加的内容\r\n".getBytes());
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
