package Sprint3.Inlämningsuppgift;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PuzzleGame extends JFrame implements ActionListener {
    JPanel gameBoard = new JPanel();
    JPanel gamePanel = new JPanel();
    JPanel newGamePanel = new JPanel();
    List<JButton> buttonList = new ArrayList<JButton>();

    List<JButton> solvedList = new ArrayList<>();
    JButton newGameButton = new JButton("Nytt Spel");

    public PuzzleGame () {
        newGame();
        add(gamePanel);

        gamePanel.setLayout(new BorderLayout());
        gamePanel.add(gameBoard, BorderLayout.NORTH);
        gamePanel.add(newGamePanel, BorderLayout.SOUTH);
        newGamePanel.add(newGameButton);
        System.out.println(findIndexOfZero());
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void newGame (){
        gameBoard = new JPanel(new GridLayout(4, 4));
        gameBoard.setBackground(Color.yellow);
        buttonList = (createButtonList());
        setBord(buttonList);

    }
    public JPanel setBord (List<JButton> buttons){

        for (JButton button : buttons){
            button.setSize(30, 30);
            gameBoard.add(button);

        }

        return gameBoard;
    }

    public List<JButton> createButtonList (){

        List <JButton> startList = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            JButton tempButton = new JButton(String.valueOf(i));
            tempButton.setBackground(Color.CYAN);
            startList.add(tempButton);
            tempButton.addActionListener(this);

        }
        startList.get(0).setBackground(Color.YELLOW);
        startList.get(0).setVisible(false);
        int j = 1;
        for (int i = 0; i < 15 ; i++) {
            Collections.swap(startList, i, j++);

        }
        solvedList = startList;
        Collections.swap(startList, 15, 14);
        Collections.shuffle(startList);

        return startList;
    }

    public boolean moveCheck (int indexOfZero, int pressedButton){

        if (indexOfZero/4 == pressedButton/4) {
            if(Math.abs(indexOfZero-pressedButton) == 1)

            return true;
        }
        if (indexOfZero%4 == pressedButton%4){
            if(Math.abs(indexOfZero/4 -pressedButton/4) == 1)

            return true;
        }

    return false;
    }
    public int findIndexOfZero (){
        int indexOfZero = 0;
        for(JButton button : buttonList){
            if (button.getText().equals("0")){
                indexOfZero = buttonList.indexOf(button);
            }
        }
        return indexOfZero;
    }

    public boolean isSolved (List<JButton> buttonList){

        if (buttonList == solvedList){
            return true;
        }

        return false;
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        JButton buttonPressed = (JButton) e.getSource();


        //JButton tempButton = buttonPressed;
        if(moveCheck(findIndexOfZero(),buttonList.indexOf(buttonPressed)) == true){
            Collections.swap(buttonList, findIndexOfZero(), buttonList.indexOf(buttonPressed));

            System.out.println(buttonList.indexOf(buttonPressed));
            setBord(buttonList);

            if (isSolved(buttonList) == true){
                JOptionPane.showMessageDialog(null, "Grattis du vann!");
            }

            gamePanel.revalidate();

        }

    }

    public static void main(String[] args) {
        PuzzleGame game = new PuzzleGame();
    }
}
