package test.annotation02;

import java.awt.event.ActionListener;
import java.lang.reflect.Field;

import javax.swing.*;

/**
 * Created by kaszy on 2017-07-23 15:25.
 */
public class ActionListenerInstaller {
//    处理Annotation的方法，其中obj是包含Annotation的对象
        public static void processAnnotation(Object obj){
            try {
            //获取了obj对象的类
                Class c1 = obj.getClass();
            //获取指定obj对象的所有成员变量，并遍历每个成员变量
                for(Field f:c1.getDeclaredFields()){
                    //将该成员变量设置成可自由访问
                    f.setAccessible(true);
                    //获取该成员变量上ActionListenerFor类型的Annotation
                    ActionListenerFor a = f.getAnnotation(ActionListenerFor.class);
                    //获取成员变量f的值
                    Object fObj = f.get(obj);
                    //如果f是AbstractButton的实例，且a不为null
                    if(a != null && fObj!=null && fObj instanceof AbstractButton){
                        //获取a注解里的listener元数据（他是一个监听器类）
                        Class<? extends ActionListener>listenerClazz = a.listener();
                        ///使用反射来创建listener类的对象
                        ActionListener a1 = listenerClazz.newInstance();
                        AbstractButton ab = (AbstractButton)fObj;
                        //为ab按钮添加事件监听器
                        ab.addActionListener(a1);
                    }
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
}
