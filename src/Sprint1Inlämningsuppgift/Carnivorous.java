package Sprint1Inlämningsuppgift;

import javax.swing.*;

public class Carnivorous extends Plants implements Nutrition{
    protected double amountOfProtein;
    public Carnivorous(String name, double height){
        super(name, height);
         amountOfProtein = Nutrition.liquidBaseProtein + (Nutrition.extraProtein * height);
    }

    @Override
    public void printNutrients() {
        JOptionPane.showMessageDialog(null,
                "Köttätande växten " + getNamePlant() + " behöver " +
                amountOfProtein + " " + Measure.LITERS.measure + " proteindryck per dag." );
    }
}
