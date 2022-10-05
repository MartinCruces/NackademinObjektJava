package Sprint1Inlämningsuppgift;

import javax.swing.*;

public class Cactus extends Plants implements Nutrition{

    public Cactus(String name, double height){
        super(name, height);
    }
    @Override
    public void printNutrients() {
        JOptionPane.showMessageDialog(null,
                "Kaktusen " +  getNamePlant() + " behöver " +
                        Nutrition.mineralWater + " " + Measure.CENTILITERS.measure +" mineralvatten per dag");
    }
}
