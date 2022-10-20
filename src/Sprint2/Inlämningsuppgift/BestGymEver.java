package Sprint2.Inlämningsuppgift;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BestGymEver implements Serializable {


    BestGymEver() {
        MethodHandler method = new MethodHandler();
        Scanner input = new Scanner(System.in);
        String fileInPath = "src/Sprint2/Inlämningsuppgift/customer.txt";
        String fileOutPath = "src/Sprint2/Inlämningsuppgift/activeMembers.txt";
        List <Customer> customerList = ReaderWriterUtility.fileReader(fileInPath);
        List<Customer> activeCustomer = new ArrayList<>();
        String testinput = "8512021234";
        String testinput2 = "7703021234";
        int position = 0;


            System.out.println("Välkommen till Best Gym!");


        if (method.checkCustomerExist(testinput2, customerList) == true){
            System.out.println("hen finns!");
            activeCustomer =  method.addPayingCustomer(testinput2,customerList);
        }


        ReaderWriterUtility.fileWriter(fileOutPath, activeCustomer);


        /*for(Customer c2 : customerList){
            System.out.printf("Namn: %s\nPersonnummer: %s\nBetalt avgift: %s\n",c.fullName, c.birtNumber, c.paymentDate );
        }*/


    }
    public static void main(String[] args) {

        BestGymEver run = new BestGymEver();
    }
}
