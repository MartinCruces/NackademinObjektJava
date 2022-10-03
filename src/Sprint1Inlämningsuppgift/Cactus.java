package Sprint1Inlämningsuppgift;

import javax.swing.*;

public class Cactus extends Plants implements Nutrition{
    final double  mineralWater = 0.2;


    public Cactus(String name, double height){
        super(name, height);
    }

    @Override
    public void printNutrients() {
        JOptionPane.showMessageDialog(null,
                "Kaktusen " +  getNamePlant() + " behöver " +
                        mineralWater + " cl mineralvatten per dag");
    }
}
