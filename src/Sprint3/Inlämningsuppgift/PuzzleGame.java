package Sprint3.Inlämningsuppgift;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PuzzleGame extends JFrame implements ActionListener {

    JPanel gameBoard = new JPanel();
    JPanel gamePanel = new JPanel();

    JPanel newGamePanel = new JPanel();


    List<JButton> buttonList = new ArrayList<JButton>();

    JButton one =  new JButton("1");
    JButton two =  new JButton("2");
    JButton three =  new JButton("3");
    JButton four =  new JButton("4");
    JButton five =  new JButton("5");
    JButton six =  new JButton("6");
    JButton seven =  new JButton("7");
    JButton eight =  new JButton("8");
    JButton nine =  new JButton("9");
    JButton ten =  new JButton("10");
    JButton eleven =  new JButton("11");
    JButton twelve =  new JButton("12");
    JButton thirteen =  new JButton("13");
    JButton fourteen =  new JButton("14");
    JButton fifteen =  new JButton("15");
    JButton blank =  new JButton(" ");

    JButton newGameButton = new JButton("Nytt Spel");

    public PuzzleGame () {

        add(gamePanel);
        gamePanel.setLayout(new BorderLayout());
        gamePanel.add(gameBoard, BorderLayout.NORTH);
        gamePanel.add(newGamePanel, BorderLayout.SOUTH);
        newGamePanel.add(newGameButton);
        gameBoard.setLayout(new GridLayout(4,4));
        int count = 0;
        for (int i = 1; i <= 16; i++) {
            JButton tempButton = new JButton(String.valueOf(count));
            buttonList.add(tempButton);

            count++;

        }
        Collections.shuffle(buttonList);


        for (JButton b : buttonList){
            if (b.equals("0")){
                gameBoard.add(blank);

            }
            else gameBoard.add(b);
        }

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        PuzzleGame game = new PuzzleGame();
    }
}
