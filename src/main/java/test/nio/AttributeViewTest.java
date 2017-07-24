package test.nio;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.nio.file.attribute.UserPrincipal;
import java.util.Date;
import java.util.List;

import static test.common.constant.JAVAURL;
import static test.common.constant.TESTURL;

/**
 * Created by kaszy on 2017-07-25 01:20.
 */
//访问文件属性
public class AttributeViewTest {
    public static void main(String[] args) throws Exception{
        //获取要操作的文件
        //Path testpath = Paths.get("AttributeViewTest.java");
        Path testpath = Paths.get(TESTURL+"nio\\AttributeViewTest.java");
        /*
        * 1.获取访问基本属性的BasicFileAttributeView
        * */
        BasicFileAttributeView basicView = Files.getFileAttributeView(testpath,BasicFileAttributeView.class);
        //获取访问基本属性的BasicFileAttribute
        BasicFileAttributes basicAttribs = basicView.readAttributes();
        //访问文件的基本属性
        System.out.println("创建时间："+new Date(basicAttribs.creationTime().toMillis()));
        System.out.println("最后访问时间："+new Date(basicAttribs.lastAccessTime().toMillis()));
        System.out.println("最后修改时间："+new  Date(basicAttribs.lastModifiedTime().toMillis()));
        System.out.println("文件大小："+ basicAttribs.size());
        /*
        * 2.获取访问文件属主信息的FileOwnerAttributeView
        * */
        FileOwnerAttributeView ownerView = Files.getFileAttributeView(testpath,FileOwnerAttributeView.class);
        System.out.println("文件所属用户："+ownerView.getOwner());
        //获取系统中guest对应的用户
        UserPrincipal user = FileSystems.getDefault().getUserPrincipalLookupService().
            lookupPrincipalByName("guest");
        //System.out.println("系统中guest对应的用户："+user);
        //修改用户
        ownerView.setOwner(user);
        /*
        * 3.获取访问自定义属性的UserDefinedFileAttributeView
        * */
        UserDefinedFileAttributeView userView = Files.getFileAttributeView(testpath,
            UserDefinedFileAttributeView.class);
        List<String> attrNames = userView.list();
        //遍历所有自定义属性
        for(String name:attrNames){
            ByteBuffer buf = ByteBuffer.allocate(userView.size(name));
            userView.read(name,buf);
            buf.flip();
            String value = Charset.defaultCharset().decode(buf).toString();
            System.out.println("自定义属性有："+name+"--->"+value);
        }
        //添加一个自定义属性
        userView.write("发行者",Charset.defaultCharset().encode("疯狂java联盟"));
        /*
        * 4.获取DOS属性的DosFileAttributeView
        * */
        DosFileAttributeView dosview = Files.getFileAttributeView(testpath,
            DosFileAttributeView.class);
        //将文件设置隐藏，只读
        dosview.setHidden(true);
        dosview.setReadOnly(true);
    }
}
