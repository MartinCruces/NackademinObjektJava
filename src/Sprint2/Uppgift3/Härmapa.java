package Sprint2.Uppgift3;

import java.util.Scanner;

public class Härmapa {

    public Härmapa(){

        Scanner input = new Scanner(System.in);

        System.out.println("Skriv något eller skriv \"hejdå\" för att avsluta");

        while (true) {

            String userText = input.nextLine();
            if (userText.equals("hejdå")){
                System.exit(0);
            }


            System.out.println("Du Skrev: " + userText);
            System.out.println("Skriv något");
        }
    }

    public static void main(String[] args) {
        Härmapa run = new Härmapa();
    }
}
