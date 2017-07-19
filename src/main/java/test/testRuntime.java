package test;

/**
 * Created by kaszy on 2017-07-20 00:21.
 */
public class testRuntime {
    public static void main(String[] args) throws Exception{
        //获取java程序关联的运行时对象,注意是获取，不是创建！
        Runtime rt = Runtime.getRuntime();
        System.out.println("处理器数量："+ rt.availableProcessors());
        System.out.println("空闲内存数："+ rt.freeMemory());
        System.out.println("总内存数：" + rt.totalMemory());
        System.out.println("可用最大内存数：" + rt.maxMemory());
        //啊啊啊我指定绝对路径怎么写了
        rt.exec("D:\\Notepad++\\notepad++.exe");
    }
}
