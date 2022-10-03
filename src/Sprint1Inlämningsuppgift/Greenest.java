package Sprint1Inlämningsuppgift;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Greenest{
    public Greenest(){
        Cactus igge = new Cactus("Igge", 20);
        Palmtrees laura = new Palmtrees("Laura", 5);
        Palmtrees putte = new Palmtrees("Putte", 1);
        Carnivorous meatloaf = new Carnivorous("Meatloaf", 0.7);

        List<Plants> total = new ArrayList<>();
        total.add(igge);
        total.add(laura);
        total.add(putte);
        total.add(meatloaf);

        String input;
        while (true) {
            input = JOptionPane.showInputDialog("Vilket växt ska få vätska?");
            switch (input) {
                case "Igge" -> igge.printNutrients();
                case "Laura" -> laura.printNutrients();
                case "Putte" -> putte.printNutrients();
                case "Meatloaf" -> meatloaf.printNutrients();
                case "1" -> System.exit(0);
                default -> System.out.println("Den plantan finns inte här");
            }

        }

    }

    public static void main(String[] args){

        Greenest input = new Greenest();

    }
}
