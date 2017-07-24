package test.file;

import java.io.File;

/**
 * Created by kaszy on 2017-07-23 21:37.
 */
public class FilenameFilterTest {
    public static void main(String[] args) {
        File file = new File(".");
        File file2 = new File("src/main/java/test");
        //使用Lambda表达式
        //如果文件名以.java结尾，或文件对应一个路径，则返回true
        String[] nameList = file.list(((dir, name) -> name.endsWith(".java")||new File(name).isDirectory()));
        String[] nameList2 = file2.list(((dir, name) -> name.endsWith(".java")||new File(name).isDirectory()));
        System.out.println("根目录下：");
        for (String name:nameList){
            System.out.println(name);
        }
        System.out.println("src/main/java/test路径下:");
        for (String name2:nameList2){
            System.out.println(name2);
        }
    }
}
