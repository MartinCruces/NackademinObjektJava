package Sprint2.Uppgift8a;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TempCal {

    protected String tempLine;
    final String tempPath = "src/Sprint2/Uppgift8a/temp.txt";
    public double parseStringToDouble(String stringNr){
        double temp;
        stringNr.trim();
        stringNr = stringNr.replaceAll(",", ".");
        temp = Double.parseDouble(stringNr);

       return temp;
    }

    public List<Double> generateListFromFile(String tempPath){
        List<Double> tempList = new ArrayList<>();
        try(BufferedReader br = new BufferedReader
                (new FileReader(tempPath))){
            while ((tempLine = br.readLine()) != null){
                Double tmp = parseStringToDouble(tempLine);
                tempList.add(tmp);
            }

        } catch (Exception e) {
            System.out.println("Något gick fel med inläsningen");
            e.printStackTrace();
            System.exit(0);
        }
        return tempList;
    }

    public double calcHighestValue(List<Double> tempList){
        double highTemp = -Double.MAX_VALUE;
        for(Double d : tempList){
            if(d > highTemp){
                highTemp = d;
            }
        }

        return highTemp;
    }
    public double calcLowestValue(List<Double> tempList){
        double lowTemp = Double.MAX_VALUE;
        for(Double d : tempList){
            if(d < lowTemp){
                lowTemp = d;
            }
        }
        return lowTemp;
    }
    public  double calcAverage(List<Double> tempList){

        double average = 0;
        for(Double d : tempList){
            average += d;
        }
        return average/tempList.size();
    }
    public TempCal(){

        List<Double> tempList = generateListFromFile(tempPath);
        System.out.printf("Maxtemp: %1f\nMintemp: %1f\nMedeltemp: %1f (beräknat på %1d dagar)",
                calcHighestValue(tempList), calcLowestValue(tempList), calcAverage(tempList), tempList.size());

    }

    public static void main(String[] args) {
        TempCal calc = new TempCal();
    }
}
