package test.annotation02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Created by kaszy on 2017-07-23 13:15.
 */
public class AnnotationTestSecond {
    private JFrame mainWin = new JFrame("使用注解绑定事件监听器");
    //使用annotation为ok按钮绑定事件监听器
    @ActionListenerFor(listener=OkListener.class)
    private JButton ok = new JButton("确定");
    //使用annotation为cancel按钮绑定事件监听器
    @ActionListenerFor(listener=CancelListener.class)
    private JButton cancel = new JButton("取消");
    public void init(){
        //初始化界面的方法
        JPanel jp = new JPanel();
        jp.add(ok);
        jp.add(cancel);
        mainWin.add(jp);
        ActionListenerInstaller.processAnnotation(this);
        mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWin.pack();
        mainWin.setVisible(true);
    }

    public static void main(String[] args) {
        new AnnotationTestSecond().init();
    }
}
//定义ok和cancel按钮的事件监听器实现类
class OkListener implements ActionListener{
    public void actionPerformed(ActionEvent evt){
        JOptionPane.showMessageDialog(null,"单击了确认按钮");
    }
}
class CancelListener implements ActionListener{
    public void actionPerformed(ActionEvent evt){
        JOptionPane.showMessageDialog(null,"单机了取消按钮");
    }
}
