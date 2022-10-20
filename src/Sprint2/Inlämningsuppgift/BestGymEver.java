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
        List <Customer> customerList = ReaderWriterUtility.fileReader(fileInPath);
        List<Customer> activeCustomers = new ArrayList<>();
        Customer activeCustomer;

        String input = null;

        while (true){

            try{
                System.out.println("Välkommen kundhittaren till Best Gym Ever\n" +
                        "Skriv in fullständigt namn eller personnummer för kontoll mot registret\n" +
                        "Vill du se lista på vilka som tränar skriv lista\n" +
                        "Vill du avsluta skriv exit");
                input = scanner.nextLine();
            }
            catch (Exception e) {
                System.out.println("Något gick fel " + e.getMessage());
            }
            input = input.trim().toUpperCase();
            activeCustomer = method.checkCustomerExist(input, customerList);
            if (activeCustomer != null){

                System.out.println(activeCustomer.fullName + " Medlemmen finns i systemet");

                ReaderWriterUtility.fileWriter(fileOutPath, activeCustomer);
            } else if (input.equals(SwitchChoice.LÄSA.toString())) {
                System.out.println("Test");
            } else System.out.println("Kunden finns inte i registret\n");


        }










        /*for(Customer c2 : customerList){
            System.out.printf("Namn: %s\nPersonnummer: %s\nBetalt avgift: %s\n",c.fullName, c.birtNumber, c.paymentDate );
        }*/


    }
    public static void main(String[] args) {

        BestGymEver run = new BestGymEver();
    }
}
