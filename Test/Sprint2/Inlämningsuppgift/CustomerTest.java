package Sprint2.Inlämningsuppgift;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {


    @Test

    public void setTestCustomer(){

        Customer testCustomer1 = new Customer("9507252361", "Mackan Mickelsson",
                LocalDate.of(2021, 10,07));
        Customer testCustomer2 = new Customer("0109248131", "Ana Santoz",
                LocalDate.of(2020, 05, 02));

        assertTrue(testCustomer1.fullName.equals("Mackan Mickelsson"));
        assertFalse(testCustomer1.fullName.equals("Ana Santoz"));
        assertTrue(testCustomer2.birthNumber.equals("0109248131"));
        assertFalse(testCustomer2.birthNumber.equals("9507252361"));
        assertTrue(testCustomer1.paymentDate.equals(LocalDate.of(2021, 10,07)));
        assertFalse(testCustomer1.paymentDate.equals(LocalDate.of(2020, 05, 02)));

    }
}