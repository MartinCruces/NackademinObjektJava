package Sprint2.Uppgift8a;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TempCal {

    String tempLine;
    final String tempPath = "src/Sprint2/Uppgift8a/temp.txt";
    public double parseStringToDouble(String stringNr){
        double temp;
        stringNr.trim();
        stringNr = stringNr.replaceAll(",", ".");
        temp = Double.parseDouble(stringNr);

       return temp;
    }

    public List<Double> generateListFromFile(String tempPath){
        List<Double> allMeasurements = new ArrayList<>();
        try(BufferedReader br = new BufferedReader
                (new FileReader(tempPath))){
            while ((tempLine = br.readLine()) != null){
                Double tmp = parseStringToDouble(tempLine);
                allMeasurements.add(tmp);
            }

        } catch (Exception e) {
            System.out.println("Något gick fel med inläsningen");
            e.printStackTrace();
            System.exit(0);
        }
        return allMeasurements;
    }

    public TempCal(){

        List<Double> tempList = new ArrayList<>();

        String tempLine;
        /*try(BufferedReader bf = new BufferedReader(new FileReader ("temp.txt"))){



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
    }
}
