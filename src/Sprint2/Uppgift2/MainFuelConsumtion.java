package Sprint2.Uppgift2;

import javax.swing.*;

public class MainFuelConsumtion {

    public MainFuelConsumtion(){
        FuelConsumptionCalculator input = new FuelConsumptionCalculator
                (Double.parseDouble(JOptionPane.showInputDialog("Mätarställning förra året (mil):").trim()),
                        Double.parseDouble(JOptionPane.showInputDialog("Aktuell mätarställning (mil): ").trim()),
                        Double.parseDouble(JOptionPane.showInputDialog("årets bränsleförbrukning (liter): ").trim()));

        System.out.println(input.printCalMiles());
        System.out.println(input.printLitre());
        System.out.println(input.printFuelConsumption());


    }
    public static void main(String[] args) {
        MainFuelConsumtion run = new MainFuelConsumtion();
    }
}
