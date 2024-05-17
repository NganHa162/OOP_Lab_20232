package AimsProject.hust.soict.ict.test.screen.manager;

import javax.swing.*;
import java.awt.event.*;

public class SubScreenTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");

        JMenuItem newWindowItem = new JMenuItem("New Window");
        newWindowItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame newFrame = new JFrame("New Window");
                newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                newFrame.setSize(300, 200);
                newFrame.setVisible(true);
            }
        });

        // Thêm mục menu vào menu
        fileMenu.add(newWindowItem);

        // Thêm menu vào menu bar
        menuBar.add(fileMenu);

        // Đặt menu bar cho frame
        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }
}