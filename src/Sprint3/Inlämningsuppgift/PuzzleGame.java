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
    JButton newGameButton = new JButton("Nytt Spel");

    public PuzzleGame () {

        add(gamePanel);
        gamePanel.setLayout(new BorderLayout());
        gamePanel.add(gameBoard, BorderLayout.NORTH);
        gamePanel.add(newGamePanel, BorderLayout.SOUTH);
        newGamePanel.add(newGameButton);
        gameBoard.setLayout(new GridLayout(4,4));
            //Create list with 16 numbers 0-15.
        for (int i = 0; i < 16; i++) {
            JButton tempButton = new JButton(String.valueOf(i));
            tempButton.setBackground(Color.white);
            buttonList.add(tempButton);
        }

        //Place 0 in the list has number 0 and is set to null. It will be the blank button in the Grid
        buttonList.get(0).setBackground(Color.YELLOW);
        buttonList.get(0).setText(null);

        //Shuffle the list before inserted into the grid.
        Collections.shuffle(buttonList);

        //Insert buttons from list to grid and add actionListerner to buttons except blank/null button.
        for (JButton button : buttonList){
            gameBoard.add(button);
            if(!button.equals(null)) {
                button.addActionListener(this::actionPerformed);
            }
        }
;
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
