package test.file;

import java.io.FileWriter;
import java.io.IOException;

import static test.common.constant.OUTPUTURL;

/**
 * Created by kaszy on 2017-07-23 23:00.
 */
public class FileWriterTest {
    public static void main(String[] args) {
        //自动关闭资源的try语句？？
        try (
            FileWriter fw = new FileWriter(OUTPUTURL + "outputfile2.txt"))
            {
                fw.write("Good night\n");
                fw.write("tomorrow will be a better day\n");
                fw.write("good good study,day day up!\n");
            } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
