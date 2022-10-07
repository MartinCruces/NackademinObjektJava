package Sprint1Inlämningsuppgift;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Greenest{
    public Greenest(){
        /*Instansierar alla växternas värden och skapar en lista av dem. Skriver ut listan så att användaren får se
        vilka växter som är inskrivna. Loop med switch-sats där användaren kan skriva in namnet på växten och
        får skötselinstruktion. Avslutas när användaren skriver 0.*/
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
        String input = null;
        while (true) {
            try{
            input = JOptionPane.showInputDialog(  list + "\n" +
                    "\nSkriv in växtens namn för bevattningsinstruktion." +
                    "\nSkriv 0 för att avsluta" +
                    "\nVilken växt ska få vätska?");
            }
            catch (Exception e){

            }
            input = input.trim().toLowerCase();
            switch (input) {
                case "igge" -> igge.printNutrients();
                case "laura" -> laura.printNutrients();
                case "putte" -> putte.printNutrients();
                case "meatloaf" -> meatloaf.printNutrients();
                case "0" -> System.exit(0);
                default -> JOptionPane.showMessageDialog(null,"Den växten finns inte här");
            }

        }

    }

    public static void main(String[] args){
        //Anropar huvudmetoden.
        Greenest run = new Greenest();


    }
}
