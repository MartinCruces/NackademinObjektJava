package Sprint3.JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameTest extends javax.swing.JFrame implements ActionListener {
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Ser rutan fin ut?");
    JButton button1 = new JButton("JA");
    JButton button2 = new JButton("NEJ");
    JFrameTest(){


        add(panel);
        button2.addActionListener(this::actionPerformed);
        button1.addActionListener(this::actionPerformed);
        panel.setLayout(new FlowLayout());

        panel.add(label);
        panel.add(button1);
        panel.add(button2);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }



    public static void main(String[] args) {
        JFrameTest frame = new JFrameTest();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (label.getText().equalsIgnoreCase("Ser rutan fin ut?")){
            label.setText("Är rutan ful?");
        }
        else label.setText("Rutan är fin!");
    }
}
