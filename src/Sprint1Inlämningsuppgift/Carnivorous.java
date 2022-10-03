package Sprint1Inlämningsuppgift;

import javax.swing.*;

public class Carnivorous extends Plants implements Nutrition{

    final double liquidProteinBase = 0.1;
    final double extraProtein = 0.2;
    protected double amountOfProtein;
    public Carnivorous(String name, double height){
        super(name, height);
         amountOfProtein = liquidProteinBase * (extraProtein * height);
    }

    @Override
    public void printNutrients() {
        JOptionPane.showMessageDialog(null,"Köttätande växten " + getNamePlant() + " behöver " +
                amountOfProtein + " liter protein per dag.");
    }
}
