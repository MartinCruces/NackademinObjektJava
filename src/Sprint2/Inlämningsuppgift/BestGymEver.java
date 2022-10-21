package Sprint2.Inlämningsuppgift;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class BestGymEver implements Serializable {

    BestGymEver() {
        /* In Main program there is paths to files for read/write operations.
        The customer text-file is already in use and inserted into a list when the program starts.
        The user can check names or person-number in the list if they are members. If there is a hit,
        the program checks if the customer have valid payment for the membership. If the customer have valid payment,
        the customer is added in a text-file for active members with date of training for followups.
        The user can choose to read the file.
         */
        MethodHandler method = new MethodHandler();
        String fileInPath = "src/Sprint2/Inlämningsuppgift/customer.txt";
        String fileOutPath = "src/Sprint2/Inlämningsuppgift/activeMembers.txt";
        List <Customer> customerList = ReaderWriterUtility.fileReaderToList(fileInPath);
        Customer activeCustomer;
        Scanner scanner = new Scanner(System.in);
        String input = null;
        System.out.println("Välkommen till kundhittaren för Best Gym Ever");

        while (true){
            try{
                System.out.println(
                        "Skriv in fullständigt namn eller personnummer för kontoll mot registret\n" +
                        "Vill du läsa aktivitetsfilen för aktiva medlemmar, skriv: läsa\n" +
                        "Vill du avsluta skriv: exit");
                input = scanner.nextLine();
            }
            catch (Exception e) {
                System.out.println("Något gick fel " + e.getMessage());
            }
            input = input.trim().toUpperCase().replace("-", "");
            activeCustomer = method.checkCustomerExist(input, customerList);

            if (activeCustomer != null){
                System.out.println(activeCustomer.fullName + " Medlemmen finns i registret\n");
                if(method.checkPaymentDate(activeCustomer.paymentDate) == true){
                    ReaderWriterUtility.fileWriter(fileOutPath, activeCustomer);
                    System.out.println("Medlemmen är inlagd i aktivitetfilen\n");
                }
            }
            else if (input.equals(MenuChoice.LÄSA.toString())) {
                ReaderWriterUtility.filePrinter(fileOutPath);
            }
            else if (input.equals(MenuChoice.EXIT.toString())){
                System.out.println("Tack och välkommen åter");
                System.exit(0);
            }
            else System.out.println(input + " finns inte i registret\n");
        }

    }
    public static void main(String[] args) {

        BestGymEver run = new BestGymEver();
    }
}
