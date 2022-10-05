package Sprint1Inlämningsuppgift;

import javax.swing.*;

public class Palmtrees extends Plants implements Nutrition{

    protected double amountWater;
    public Palmtrees(String name, double height){
        super(name, height);
        amountWater = Nutrition.tapWater * getHeight();
    }
    @Override
    public void printNutrients() {
        JOptionPane.showMessageDialog(null,
                "Palmen " + getNamePlant() + " behöver " +
                        amountWater + " " + Measure.LITERS.measure + " vatten per dag");
    }
}
