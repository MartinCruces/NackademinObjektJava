package Sprint2.Inlämningsuppgift;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderWriterUtility{

    public static List<Customer> fileReader (String customers) {
        List<Customer> customerList = new ArrayList<>();
        String firstLine;
        String secondLine;
        Path inFile;
        String[] customerData2PartsFirstLine = new String[2];
        LocalDate paymentDateSecondLine = null;
        inFile = Paths.get(customers);

        try(Scanner fileReader = new Scanner(inFile)){
            while (fileReader.hasNext()) {
                firstLine = fileReader.nextLine();
                customerData2PartsFirstLine = firstLine.split(",");
                if (fileReader.hasNext()) {
                    secondLine = fileReader.nextLine().trim();
                    paymentDateSecondLine = LocalDate.parse(secondLine);
                }

                Customer c = new Customer(customerData2PartsFirstLine[0].trim(), customerData2PartsFirstLine[1].trim(),
                        paymentDateSecondLine);

                customerList.add(c);

            }
        }

        catch (NoSuchFileException e){
            e.printStackTrace();
            System.out.println("Filen hittades inte: " + e.getMessage());
        }
        catch (IOException e){
            e.printStackTrace();
            System.out.println("Något med inläsningen gick fel: " + e.getMessage());
        }
        return customerList;
    }
    public void fileWriter (){

    }
}
