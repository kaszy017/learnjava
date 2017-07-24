package test.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

import static test.common.constant.TESTURL;

/**
 * Created by kaszy on 2017-07-25 00:33.
 */
//向指定文件的指定位置插入内容
public class InsertContent {
    //成员变量包括：要写的文件名，要写入的位置，要写入的内容
    public static void insert(String filename,long pos,String insertContent)throws IOException{
        //创建临时文件
        File tmp = File.createTempFile("tmp",null);
        //该临时文件在jvm退出时被删除
        tmp.deleteOnExit();
        try(
            RandomAccessFile raf = new RandomAccessFile(filename,"rw");
            //使用临时文件来保存插入点后的数据
            FileOutputStream tmpOut = new FileOutputStream(tmp);
            FileInputStream tmpIn = new FileInputStream(tmp);
            )
        {
            raf.seek(pos);
            /*
            * 以下代码将插入点后的内容读入临时文件中保存
            * */
            byte[] bbuf = new byte[64];
            //用于保存实际读取的字节数
            int hasread = 0;
            //使用循环方式读插入点后的数据
            while ((hasread=raf.read(bbuf))>0){
                //将读取的数据写入临时文件
                tmpOut.write(bbuf,0,hasread);
            }
            /*
            * 以下代码用于插入新内容
            * */
            //把文件记录指针重新定位到pos位置
            raf.seek(pos);
            //追加要插入的内容
            raf.write(insertContent.getBytes());
            //循环追加临时文件中的内容
            while ((hasread=tmpIn.read(bbuf))>0){
                raf.write(bbuf,0,hasread);
            }
        }
    }

    public static void main(String[] args) throws IOException{
        insert(TESTURL + "file\\InsertContent.java",44,"\n");
    }
}
