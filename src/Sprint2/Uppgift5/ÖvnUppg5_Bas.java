package Sprint2.Uppgift5;

import static javax.swing.JOptionPane.*;
import java.util.*;

public class ÖvnUppg5_Bas {
    public static void main (String[] arg) {
        String indata = showInputDialog
                ("Ange antal dagar, pris per dag samt bilmodell");
        Scanner sc = new Scanner(indata);
        try{
            int antalDagar  = sc.nextInt();
        }
        catch (NumberFormatException e){
        }
        int antalDagar  = sc.nextInt();
        double dagsPris = sc.nextDouble();
        String bil = sc.next();
        double totPris = dagsPris * antalDagar;
        String s = String.format("Totalt pris för %s: %.2f",
                bil, totPris);
        showMessageDialog(null, s);
    }
}
