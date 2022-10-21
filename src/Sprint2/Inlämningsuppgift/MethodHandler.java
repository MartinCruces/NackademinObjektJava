package Sprint2.Inlämningsuppgift;

import java.time.LocalDate;
import java.util.List;

public class MethodHandler {

    public boolean checkPaymentDate(LocalDate payDate) {
        boolean paymentValidation = false;

        LocalDate lastYearDate = LocalDate.now().minusYears(1).minusDays(1);
        if (payDate.isAfter(lastYearDate)) {
            paymentValidation = true;
            System.out.println("Medlemsavgiften är betald");
        } else if (payDate.isBefore(lastYearDate)) {
            paymentValidation = false;
            System.out.println(("Medlemsavgiften är inte betald"));
        }
        return paymentValidation;
    }
    public Customer checkCustomerExist(String input, List<Customer> customerList) {

        for (Customer c : customerList) {
            if (input.equals(c.fullName)) {

                return c;
            } else if (input.equals(c.birthNumber)) {
                return c;
            }
        }
        return null;
    }
}
