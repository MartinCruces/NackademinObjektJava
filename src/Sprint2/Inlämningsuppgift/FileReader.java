package Sprint2.Inlämningsuppgift;


import java.time.LocalDate;
import java.util.List;
public class FileReader {

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

    public boolean checkCustomerExist(String input, List<Customer> customerList){
        boolean check = false;
        for(Customer c : customerList){
            if (input.equals(c.fullName)) {
                check = true;
            }
            else if (input.equals(c.birtNumber)){
                check = true;
            }
        }
        return check;
    }



}
