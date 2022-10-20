package Sprint2.Inlämningsuppgift;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MethodHandlerTest {

    MethodHandler test = new MethodHandler();

    @Test
    public void checkPaymentDateTest(){

        LocalDate dateOK = LocalDate.now();
        LocalDate dateNotOK = LocalDate.of(2021, 04, 21);
        System.out.println(dateNotOK);

        assertTrue(test.checkPaymentDate(dateOK) == true);
        assertFalse(test.checkPaymentDate(dateNotOK) == true);
        assertTrue(test.checkPaymentDate(dateNotOK) == false);
        assertFalse(test.checkPaymentDate(dateOK) == false);
    }



    @Test
    public void checkCustomerExist(){
        String testName1 = "Alhambra Aromes";
        String testName2 = "Bear Belle";
        String testBirthNr1 = "7703021234";
        String testBirthNr2 = "8204021234";
        String testNameFalse = "Bertil Hansson";
        LocalDate testDate1 = LocalDate.of(2022,10,5);
        LocalDate testDate2 = LocalDate.of(2021,04,29);
        Customer testCustomer1 = new Customer(testBirthNr1,testName1, testDate1);
        Customer testCustomer2 = new Customer(testBirthNr2, testName2, testDate2);
        List<Customer> testCustomerList = new ArrayList<>();
        testCustomerList.add(testCustomer1);
        testCustomerList.add(testCustomer2);

        assertTrue(test.checkCustomerExist(testBirthNr1,testCustomerList) != null);
        assertTrue(test.checkCustomerExist(testName2, testCustomerList) != null);
        assertTrue(test.checkCustomerExist(testNameFalse, testCustomerList)== null);
        //assertFalse(test.checkCustomerExist(testNameFalse,testCustomerList). == true);
        //assertFalse(test.checkCustomerExist(testDate1.toString(), testCustomerList) == true);
    }
}