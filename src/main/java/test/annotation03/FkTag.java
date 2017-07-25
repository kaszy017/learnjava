package test.annotation03;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by kaszy on 2017-07-23 20:53.
 */
@Repeatable(FkTags.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface FkTag {
    //为该注解定义2个成员变量
    String name() default "疯狂软件";
    int age();

}
