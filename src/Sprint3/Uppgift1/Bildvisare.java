package Sprint3.Uppgift1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Path;

public class Bildvisare extends JFrame implements ActionListener {

    JPanel panel1 = new JPanel();
    JPanel nortpanel = new JPanel();
    ImageIcon pic = new ImageIcon("C:/Users/marti/Pictures/Saved Pictures/IMG_4654.jpg");
    ImageIcon pic2 = new ImageIcon("C:/Users/marti/Pictures/Saved Pictures/Sweet.jpg");
    JLabel picture1 = new JLabel();
    JLabel picture2 = new JLabel();
    JButton button1 = new JButton("Give me more!");

    public Bildvisare (){
        add(panel1);
        button1.addActionListener(this::actionPerformed);

        panel1.setLayout(new BorderLayout());
        panel1.add(nortpanel,BorderLayout.NORTH);
        picture1.setIcon(pic);
        picture1.setPreferredSize(new Dimension(500,700));
        nortpanel.add(picture1);
        panel1.add(button1, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if (picture1.getIcon().equals(pic)){
        picture1.setIcon(pic2);
        }
        else picture1.setIcon(pic);
    }

    public static void main(String[] args) {
        Bildvisare bild = new Bildvisare();
    }
}
