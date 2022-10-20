package Sprint2.Inlämningsuppgift;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class MethodHandler {

    public boolean checkPaymentDate(LocalDate payDate){
        boolean paymentValidation;

        LocalDate lastYearDate = LocalDate.now().minusYears(1).minusDays(1);
        if (payDate.isAfter(lastYearDate)){
            paymentValidation = true;
        }
        else paymentValidation = false;

        return paymentValidation;
    }
    public LocalDate parseStringToLocalDate(String date){

        return LocalDate.parse(date.trim());
    }

    public Customer checkCustomerExist(String input, List<Customer> customerList){

        for(Customer c : customerList){
            if (input.equals(c.fullName)) {

                return c;
            }
            else if (input.equals(c.birthNumber)){
                return c;
            }
        }
        return null;
    }
    public List<Customer> addPayingCustomer(String input, List<Customer> customerList){
        List<Customer> activeCustomer = new ArrayList<>();
        for(Customer c : customerList) {
            if (input.equals(c.fullName)) {
                if (checkPaymentDate(c.paymentDate) == true) {
                    activeCustomer.add(c);
                }
            } else if (input.equals(c.birthNumber)) {
                if (checkPaymentDate(c.paymentDate) == true) {
                    activeCustomer.add(c);
                }
            }
            else System.out.println("Kunden har inte betalt medlemsavgiften");
        }
        return activeCustomer;
    }
}
