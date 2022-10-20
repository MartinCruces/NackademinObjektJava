package Sprint2.Uppgift9b;

import java.util.List;

public class ÖvningLäsaFil {
    public ÖvningLäsaFil() {

        String filePath = "src/Sprint2/Uppgift9b/Personuppgifter.txt";
        String outFilePathString = "src/Sprint2/Uppgift9b/TallPeopleInformation.txt";
        List<Person> personList = IOUtil
                .readDataFromFile(filePath);

        List <Person> onlyTallPersons = LogicUtil
                .getAllTallPersons(personList);

        IOUtil.writeDataToFile(outFilePathString,
                onlyTallPersons);

    }

    public static void main(String[] args){
        ÖvningLäsaFil ö = new ÖvningLäsaFil();
    }
}
