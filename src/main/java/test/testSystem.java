package test;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Properties;

/**
 * Created by kaszy on 2017-07-19 01:06.
 */
public class testSystem {
    public static void main(String[] args) {
        //获取系统的所有环境变量 获取，不是创建
        Map<String,String> env = System.getenv();
        System.out.println("系统的所有环境变量:" + "\n");
        for(String name : env.keySet()){
            System.out.println(name + "--->" + env.get(name));
        }
        //获取指定环境变量的值
        System.out.println("指定环境变量的值:" + "\n" + System.getenv("JAVA_HOME"));
        //获取所有的系统属性
        Properties props = System.getProperties();
        //将所有系统属性保存到props.txt文件中
        // TODO: 2017/7/20   路径问题还是不会。。
        //file f = new file("d:\\1.txt");
        //props.store(new FileOutputStream("1.txt"), "System Properties");
        //输出特定的系统属性
        System.out.println("特定的系统属性:" + "\n" + System.getProperty("os.name"));

    }
}
