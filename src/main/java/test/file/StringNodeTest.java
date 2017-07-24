package test.file;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * Created by kaszy on 2017-07-24 22:31.
 */
//StringReader类和StringWriter类（和FileReader&FileWriter相似）
public class StringNodeTest {
    public static void main(String[] args) {
        String src = "从明天起，做一个幸福的人\n";
        char[] buffer = new char[32];
        int hasread = 0;
        try(StringReader sr = new StringReader(src)){
            while ((hasread = sr.read(buffer))>0){
                System.out.println(new String(buffer,0,hasread));
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
        try(StringWriter sw = new StringWriter()){
            sw.write("明天你是否会想起，昨天你写的日记\n");
            sw.write("当初的愿望实现了吗，事到如今只好祭奠吗\n");
            System.out.println(sw.toString());
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
