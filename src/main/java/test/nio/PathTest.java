package test.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by kaszy on 2017-07-25 00:59.
 */
public class PathTest {
    public static void main(String[] args) throws Exception{
        //以当前路径来创建Path对象
        Path path = Paths.get(".");
        System.out.println("path里包含的路径数量：" + path.getNameCount());
        System.out.println("path的根路径：" + path.getRoot());
        Path absolutePath = path.toAbsolutePath();
        System.out.println("path对应的绝对路径："+ absolutePath );
        System.out.println("绝对路径里包含的路径数量：" + absolutePath.getNameCount());
        //System.out.println("不知道这是啥：" + absolutePath.getName(3));
        //以多个string来构建path对象
        Path path2 = Paths.get("d:","ccleaner","Lang");
        System.out.println(path2);
    }
}
