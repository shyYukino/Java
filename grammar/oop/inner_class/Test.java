package grammar.oop.inner_class2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//GUI编程（桌面编程）
//搞清楚匿名内部类在开发中的真实使用场景
public class Test {
    public static void main(String[] args) {
        //创建窗口
        JFrame win = new JFrame("登陆界面");
        JPanel panel = new JPanel();
        win.add(panel);

        JButton btn = new JButton("登录");
        panel.add(btn);

        //给按钮绑定单击事件监听器
        //此处就用到了匿名内部类，要注意的是，匿名内部类一般是被动地去用，不是要我们主动去编写的
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //以下为在终端显示文字
                System.out.println("欢迎来到理塘");

                //以下为在窗口显示文字
                JOptionPane.showMessageDialog(win, "欢迎来到理塘");
                
            }
        });
        //最终的核心目的：简化代码。比如以上匿名内部类可以用lambda表达式简化，具体如下
        btn.addActionListener(e -> JOptionPane.showMessageDialog(win, "欢迎来到理塘"));

        win.setSize(400, 400);
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        win.setVisible(true);
    }
}
