package Sprint2.Inlämningsuppgift;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BestGymEver implements Serializable {


    BestGymEver() {
        MethodHandler method = new MethodHandler();
        Scanner scanner = new Scanner(System.in);
        String fileInPath = "src/Sprint2/Inlämningsuppgift/customer.txt";
        String fileOutPath = "src/Sprint2/Inlämningsuppgift/activeMembers.txt";
        List <Customer> customerList = ReaderWriterUtility.fileReaderToList(fileInPath);
        List<Customer> activeCustomers = new ArrayList<>();
        Customer activeCustomer;

        String input = null;
        System.out.println("Välkommen till kundhittaren för Best Gym Ever");

        while (true){
            try{
                System.out.println(
                        "Skriv in fullständigt namn eller personnummer för kontoll mot registret\n" +
                        "Vill du läsa aktivitetslistan för aktiva medlemmar, skriv: läsa\n" +
                        "Vill du avsluta skriv: exit");
                input = scanner.nextLine();
            }
            catch (Exception e) {
                System.out.println("Något gick fel " + e.getMessage());
            }
            input = input.trim().toUpperCase().replace("-", "");
            activeCustomer = method.checkCustomerExist(input, customerList);

            if (activeCustomer != null){
                System.out.println(activeCustomer.fullName + " Medlemmen finns i systemet");
                if(method.checkPaymentDate(activeCustomer.paymentDate) == true){
                    ReaderWriterUtility.fileWriter(fileOutPath, activeCustomer);
                    System.out.println("Medlemmen är inlagt i aktivitetloggen");
                }
            }
            else if (input.equals(SwitchChoice.LÄSA.toString())) {
                ReaderWriterUtility.filePrinter(fileOutPath);
            }
            else if (input.equals(SwitchChoice.EXIT.toString())){
                System.out.println("Tack och välkommen åter");
                System.exit(0);
            }
            else System.out.println(input + " finns inte i registret\n");


        }










        /*for(Customer c2 : customerList){
            System.out.printf("Namn: %s\nPersonnummer: %s\nBetalt avgift: %s\n",c.fullName, c.birtNumber, c.paymentDate );
        }*/


    }
    public static void main(String[] args) {

        BestGymEver run = new BestGymEver();
    }
}
