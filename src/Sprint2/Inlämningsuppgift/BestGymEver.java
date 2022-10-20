package Sprint2.Inlämningsuppgift;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class BestGymEver {


    BestGymEver() {
        FileReader checkPayment = new FileReader();
        String filePath = "src/Sprint2/Inlämningsuppgift/customer.txt";
        List <Customer> customerList = ReaderWriterUtility.fileReader(filePath);
        List<String> activeCustomer = new ArrayList<>();

        for (Customer c1 : customerList){
            if(checkPayment.checkPaymentDate(c1.paymentDate) == true){
                activeCustomer.add(c1.fullName);
                activeCustomer.add(LocalDate.now().toString());
            }
        }

        for (String s : activeCustomer){
            System.out.println(s);
        }


        /*for(Customer c2 : customerList){
            System.out.printf("Namn: %s\nPersonnummer: %s\nBetalt avgift: %s\n",c.fullName, c.birtNumber, c.paymentDate );
        }*/


    }
    public static void main(String[] args) {

        BestGymEver run = new BestGymEver();
    }
}
