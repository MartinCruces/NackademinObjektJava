package Sprint2.Inlämningsuppgift;

import java.io.*;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderWriterUtility{

    public static List<Customer> fileReaderToList (String customerFile) {
        List<Customer> customerList = new ArrayList<>();
        String firstLine;
        String secondLine;
        String[] customerData2PartsFirstLine = new String[2];
        LocalDate paymentDateSecondLine = null;
        Path inFile = Paths.get(customerFile);

        try(Scanner fileReader = new Scanner(inFile)){
            while (fileReader.hasNext()) {
                firstLine = fileReader.nextLine();
                customerData2PartsFirstLine = firstLine.split(",");
                if (fileReader.hasNext()) {
                    secondLine = fileReader.nextLine().trim();
                    paymentDateSecondLine = LocalDate.parse(secondLine);
                }

                Customer c = new Customer(customerData2PartsFirstLine[0].trim(), customerData2PartsFirstLine[1].trim().toUpperCase(),
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
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Något gick fel" + e.getMessage());
        }
        return customerList;
    }
    public static void fileWriter (String fileOutPath, Customer activeMember) {


        try (PrintWriter write = new PrintWriter(new FileWriter(fileOutPath, true))) {

            write.print("Namn: " + activeMember.fullName+ " Personnummer: " + activeMember.birthNumber +
                    " Träningsdatum: " + LocalDate.now());
            write.print("\n");

        }
        catch (FileNotFoundException e){
            System.out.println("Filen hittades inte " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("Det gick inte att skriva till filen " + e.getMessage());
        }
        catch (Exception e){

            System.out.println("Något gick fel " + e.getMessage());
        }

    }
    public static void filePrinter(String activeMembersFile){
        String tempLine;
        try (BufferedReader reader = new BufferedReader
                (new FileReader(activeMembersFile))){
            while ((tempLine = reader.readLine()) != null){
                System.out.println(tempLine);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Filen hittades inte:" + e.getMessage());
        }
        catch (IOException e){
            System.out.println("Det gick inte att läsa in filen: " + e.getMessage());
        }
        catch (Exception e){
            System.out.println("Något blev fel" + e.getMessage());
        }
    }
}
