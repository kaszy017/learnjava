package test.annotation02;

import java.awt.event.ActionListener;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by kaszy on 2017-07-23 13:11.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ActionListenerFor {
//    定义一个成员变量，用于设置元数据
//    该listener成员变量用于保存监听器实现类
    Class<? extends ActionListener> listener();

}
