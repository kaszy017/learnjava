package test.annotation3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by kaszy on 2017-07-23 20:50.
 */
//定义一个可以重复使用的annotation,名字唯一的区别是后面有没有s，其他必须完全一样
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface FkTags {
    //定义value成员变量，该成员变量可接受多个@Fktag注释
    FkTag[] value();
}
