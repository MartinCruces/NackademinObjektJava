package Sprint2.Uppgift4;


import java.util.Scanner;

public class MainFuelConsumtion {
    public MainFuelConsumtion(){
        FuelConsumptionCalculator input = new FuelConsumptionCalculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Mätarställning förra året (mil):");
        try {
            input.milesLastYear = Double.parseDouble(sc.nextLine().trim());
        }
        catch (NumberFormatException e){
            System.out.println("Skriv bara siffror. " + e.getMessage());
        }
        System.out.println("Aktuell mätarställning (mil): ");
        try {
            input.currentMiles = Double.parseDouble(sc.nextLine().trim());
        }
        catch (NumberFormatException e){
            System.out.println("Skriv bara siffror. " + e.getMessage());
        }
        System.out.println("årets bränsleförbrukning (liter): ");
        try {
            input.litre = Double.parseDouble(sc.nextLine().trim());
        }
        catch (NumberFormatException e){
            System.out.println("Skriv bara siffror. " + e.getMessage());
        }

        System.out.println(input.printCalMiles());
        System.out.println(input.printLitre());
        System.out.println(input.printFuelConsumption());
    }

    public static void main(String[] args) {
        MainFuelConsumtion run = new MainFuelConsumtion();
    }
}
