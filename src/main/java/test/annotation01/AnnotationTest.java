package test.annotation01;

/**
 * Created by kaszy on 2017-07-21 01:20.
 */

public class AnnotationTest {
    @testCreateAnnotation
    public static void m1(){

    }

    public static void m2(){

    }
    @testCreateAnnotation
    public static void m3(){
        throw new  IllegalArgumentException("参数出错了");
    }
    public static void m4(){

    }
    @testCreateAnnotation
    public static void m5(){

    }

    public static void m6(){

    }
    @testCreateAnnotation
    public static void m7(){
        throw new RuntimeException("程序业务出现异常");
    }

    public static void m8(){

    }
}
