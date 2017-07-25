package test.annotation03;

/**
 * Created by kaszy on 2017-07-23 21:05.
 */
@FkTag(age = 5)
@FkTag(name = "疯狂java",age=9)
public class FkTagTest {
    public static void main(String[] args) {
        Class<FkTagTest> clazz = FkTagTest.class;
        //方法1：使用getDeclaredAnnotationsByType方法获取FkTagTest类的多个@Fktag注解
        FkTag[] tags = clazz.getDeclaredAnnotationsByType(FkTag.class);
        //遍历修饰FkTagTest类的多个@FkTag注解
        for (FkTag tag:tags){
            System.out.println(tag.name() + "-->" + tag.age());
        }
        //方法2：使用普通getDeclaredAnnotation方法获取
        FkTags container = clazz.getDeclaredAnnotation(FkTags.class);
        System.out.println(container);

    }
}
