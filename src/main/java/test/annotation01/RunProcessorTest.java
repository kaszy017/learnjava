package test.annotation01;

/**
 * Created by kaszy on 2017-07-23 03:13.
 */
public class RunProcessorTest {
    public static void main(String[] args) throws Exception{
        //处理AnnotationTest类
        //反射clazz调用的时候要加上包名称路径，不然会包找不到类异常
        ProcessorTest.process("test.annotation01.AnnotationTest");
    }
}
