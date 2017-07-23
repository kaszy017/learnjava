package test.annotation01;

import java.lang.reflect.Method;


/**
 * Created by kaszy on 2017-07-23 02:29.
 */
public class ProcessorTest {
    public static void process(String clazz) throws ClassNotFoundException {
        int passed = 0;
        int failed = 0;
        //遍历clazz对应的类里的所有方法
        for(Method m : java.lang.Class.forName(clazz).getMethods()){
            if(m.isAnnotationPresent(testCreateAnnotation.class)){
                try {
                    //invoke() 调用某方法
                    //静态方法可省略对象，直接用null替代
                    m.invoke(null);
                    //测试成功，passed计数器加1
                    passed ++;
                }
                catch (Exception e){
                    System.out.println("方法：" + m + "运行失败,异常：" + e.getCause());
                    //测试出现异常，failed计数器加1
                    failed ++;
                }
            }
        }
        //统计测试结果
        System.out.println("共运行了：" + (passed+failed) +"个方法，其中：\n" + "失败了：" + failed + "个,\n" + "成功了：" + passed + "个");
    }
}
