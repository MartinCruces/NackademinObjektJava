package Sprint1Inlämningsuppgift;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Greenest{
    public Greenest(){
        /*Instansierar alla växternas värden och skapar en lista av dem. Skriver ut listan så att användaren ser
        vilka växter som bor på hotellet. Loop med switch-sats där användaren kan skriva in namnet på växten och
        får skötselinstruktion. Avslutas när användaren skriver exit.*/
        Cactus igge = new Cactus("Igge", 20);
        Palmtrees laura = new Palmtrees("Laura", 5);
        Palmtrees putte = new Palmtrees("Putte", 1);
        Carnivorous meatloaf = new Carnivorous("Meatloaf", 0.7);

        List<Plants> totalPlants = new ArrayList<>();
        totalPlants.add(igge);
        totalPlants.add(laura);
        totalPlants.add(putte);
        totalPlants.add(meatloaf);
        String list = "Incheckade växter är: ";
        for (Plants s : totalPlants) {
            list += "\n" + s.getNamePlant();
        }
        String input;
        while (true) {
            JOptionPane.showMessageDialog(null,"\nSkriv in växtens namn för " +
                    "bevattningsinstruktion eller skriv 0 för att avsluta");
            JOptionPane.showMessageDialog(null, list);
            input = JOptionPane.showInputDialog("Vilket växt ska få vätska?");

            switch (input) {
                case "Igge" -> igge.printNutrients();
                case "Laura" -> laura.printNutrients();
                case "Putte" -> putte.printNutrients();
                case "Meatloaf" -> meatloaf.printNutrients();
                case "0" -> System.exit(0);
                default -> System.out.println("Den växten finns inte här");
            }

        }

    }

    public static void main(String[] args){
        //Anropar huvudmetoden.
        Greenest input = new Greenest();

    }
}
