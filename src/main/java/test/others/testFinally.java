package test.others;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by kaszy on 2017-07-20 23:25.
 */
public class testFinally {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("a.txt");
        }catch (IOException ioe){
            System.out.println(ioe.getMessage());
            //return强制方法返回,1
            return;
            //使用exit退出虚拟机,2(1和2不能同时出现，必须注释掉一个)
            //System.exit(1);
        }
        //异常处理的嵌套
        finally {
            //关闭磁盘文件，回收资源
            if(fis != null){
                try {
                    fis.close();
                }
                catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
            System.out.println("执行finally快里的资源回收");
        }
    }
}
