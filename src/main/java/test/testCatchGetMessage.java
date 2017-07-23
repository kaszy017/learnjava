package test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by kaszy on 2017-07-20 23:00.
 */
public class testCatchGetMessage {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\a.txt");
        }
        catch (IOException ioe){
            System.out.println("异常信息：" + ioe.getMessage());
            ioe.printStackTrace();
        }

    }
}
