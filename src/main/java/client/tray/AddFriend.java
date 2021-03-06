package client.tray;

import javax.swing.*;
/**
 * 添加玩家（好友？）
 *
 * 页面只有一个页面和一个框，其他啥都看不见，是不是错了？
 */
public class AddFriend {
    AddFriend(String ID){
        final JFrame frame = new JFrame("TrayTest");
        frame.setBounds(800,400,400, 350);
        frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE); // 点击关闭按钮时隐藏窗口
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        JButton ADD = new JButton("添加");

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0,400,50);
        panel.setBorder(BorderFactory.createEtchedBorder());

        //按照此人ID查找此人，选择添加与否

        panel.add(ADD);
        frame.add(panel);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new AddFriend("111");
    }
}
