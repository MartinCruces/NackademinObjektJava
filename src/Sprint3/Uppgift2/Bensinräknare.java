package Sprint3.Uppgift2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Bensinräknare extends JFrame implements ActionListener {
    Scanner scanner = new Scanner(System.in);
    JLabel currentMilesLabel = new JLabel("Ange mätarställning nu: ");
    JLabel milesLastYearLabel = new JLabel("Ange mätarställning för ett år sedan: ");
    JLabel consumedLitreLabel = new JLabel("Ange antal liter förbrukad bensin: ");
    JTextField currentMiles = new JTextField(30);
    JTextField mileLastYear = new JTextField(30);
    JTextField consumedLitre = new JTextField(30);
    JLabel calMiles = new JLabel(" ");
    JLabel liteGasConsumed = new JLabel(" ");
    JLabel fuelConsumption = new JLabel(" ");

    JPanel questionsPanel = new JPanel();
    JPanel answersPanel = new JPanel();
    JPanel resultsPanel = new JPanel();

    public Bensinräknare(){
        setLayout(new BorderLayout());
        add(questionsPanel, BorderLayout.WEST);
        add(answersPanel, BorderLayout.EAST);
        add(resultsPanel, BorderLayout.SOUTH);

        questionsPanel.setLayout(new GridLayout(3,1));
        answersPanel.setLayout(new GridLayout(3, 1));
        resultsPanel.setLayout(new GridLayout(1, 3));

        questionsPanel.add(currentMilesLabel);
        questionsPanel.add(milesLastYearLabel);
        questionsPanel.add(consumedLitreLabel);

        answersPanel.add(currentMiles);
        answersPanel.add(mileLastYear);
        answersPanel.add(consumedLitre);

        resultsPanel.add(calMiles);
        resultsPanel.add(liteGasConsumed);
        resultsPanel.add(fuelConsumption);


        currentMiles.addActionListener(this);
        mileLastYear.addActionListener(this);
        consumedLitre.addActionListener(this);



        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    protected double calMiles (double currentMiles, double lastYearMiles)
    {
        return currentMiles - lastYearMiles;
    }
    protected double calFuelConsumption (double litre, double calMiles){
        return litre/calMiles;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == currentMiles || e.getSource() == mileLastYear
                || e.getSource() == consumedLitre){

            Scanner inputCurrentMile = new Scanner(currentMiles.getText());
            Scanner inputMileLastYear = new Scanner(mileLastYear.getText());
            Scanner inputConsumedLitre = new Scanner(consumedLitre.getText());

            if (inputCurrentMile.hasNextDouble() && inputMileLastYear.hasNextDouble()
                    && inputConsumedLitre.hasNextDouble()) {
                double currentMile = inputCurrentMile.nextDouble();
                double milesLastYear = inputMileLastYear.nextDouble();
                double consumedLitres = inputConsumedLitre.nextDouble();

                double calcMiles = calMiles(currentMile, milesLastYear);
                double fuelConsumptionD = calFuelConsumption(consumedLitres, calcMiles);

                calMiles.setText("Antal körda mil: " + calcMiles);
                liteGasConsumed.setText("Antal liter bensin: " + consumedLitres);
                fuelConsumption.setText("Förbrukning per mil: " + fuelConsumptionD);
            }
        }

    }

    public static void main(String[] args) {
        Bensinräknare run = new Bensinräknare();
    }


}
