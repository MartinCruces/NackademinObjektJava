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
    List<JButton> buttonList = new ArrayList<>();
    List<JButton> solvedList = new ArrayList<>();
    JButton newGameButton = new JButton("Nytt Spel");

    private PuzzleGame () {
        newGame();
        add(gamePanel);
        gamePanel.setLayout(new BorderLayout());
        gamePanel.add(gameBoard, BorderLayout.NORTH);
        gamePanel.add(newGamePanel, BorderLayout.SOUTH);
        newGamePanel.add(newGameButton);
        newGameButton.addActionListener(this::actionPerformed);
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
    private JPanel setBord (List<JButton> buttons){
        for (JButton button : buttons){
            button.setSize(30, 30);
            gameBoard.add(button);
        }
        return gameBoard;
    }
    private List<JButton> createButtonList (){
        List <JButton> startList = new ArrayList<>();
        for (int i = 1; i <= 16; i++) {
            JButton tempButton = new JButton(String.valueOf(i));
            JButton tem2 = tempButton;
            solvedList.add(tem2);
            tempButton.setBackground(Color.CYAN);
            startList.add(tempButton);
            tempButton.addActionListener(this);
        }
        startList.get(15).setBackground(Color.YELLOW);
        startList.get(15).setVisible(false);
        return startList;
    }
    private boolean moveCheck (int indexOfZero, int pressedButton){
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
    private int findIndexOfZero (){
        int indexOfZero = 0;
        for(JButton button : buttonList){
            if (button.getText().equals("16")){
                indexOfZero = buttonList.indexOf(button);
            }
        }
        return indexOfZero;
    }
    private void shuffle(){
        Collections.shuffle(buttonList);
    }
    private boolean isSolved (List<JButton> buttonList){
        if(buttonList.equals(solvedList)){
            return true;
        }
        return false;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newGameButton){
            shuffle();
            setBord(buttonList);
            revalidate();
        }
        else if (moveCheck(findIndexOfZero(),buttonList.indexOf(e.getSource())) == true) {
            Collections.swap(buttonList, findIndexOfZero(), buttonList.indexOf(e.getSource()));
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
