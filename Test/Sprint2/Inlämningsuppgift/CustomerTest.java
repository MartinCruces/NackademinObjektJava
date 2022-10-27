package Sprint2.Inlämningsuppgift;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

class CustomerTest {

    @Test

    public void setTestCustomer(){

        Customer testCustomer1 = new Customer("9507252361", "Mackan Mickelsson",
                LocalDate.of(2021, 10,7));
        Customer testCustomer2 = new Customer("0109248131", "Ana Santoz",
                LocalDate.of(2020, 5, 2));

        assert(testCustomer1.fullName.equals("Mackan Mickelsson"));
        assert(!testCustomer1.fullName.equals("Ana Santoz"));
        assert(testCustomer2.birthNumber.equals("0109248131"));
        assert(!testCustomer2.birthNumber.equals("9507252361"));
        assert(testCustomer1.paymentDate.equals(LocalDate.of(2021, 10,7)));
        assert(!testCustomer1.paymentDate.equals(LocalDate.of(2020, 5, 2)));
    }
}