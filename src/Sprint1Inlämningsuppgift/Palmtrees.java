package Sprint1Inlämningsuppgift;

import javax.swing.*;

public class Palmtrees extends Plants implements Nutrition{
    final double tapWater = 0.5;
    protected double amountWater;
    public Palmtrees(String name, double height){
        super(name, height);
        amountWater = tapWater * getHeight();
    }
    @Override
    public void printNutrients() {
        JOptionPane.showMessageDialog(null, "Palmen " + getNamePlant() + " behöver " + amountWater + " liter vatten per dag");

    }
}
