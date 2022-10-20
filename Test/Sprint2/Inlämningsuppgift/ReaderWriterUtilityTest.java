package Sprint2.Inlämningsuppgift;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReaderWriterUtilityTest {

    ReaderWriterUtility test = new ReaderWriterUtility();
    String fileToRead = "Test/Sprint2/Inlämningsuppgift/readTestFile.txt";
    String fileToWrite = "Test/Spring2/InlämningsUppgift/writeTestFile.txt";

    @Test
    public void fileReaderTest (){
        /*Information from readTestFile.txt:
        7703021234, Alhambra Aromes
        2022-07-01
        8204021234, Bear Belle
        2019-12-02*/
        List<Customer> customers = test.fileReader(fileToRead);
        //Customer nr 2 in file have paydate 2019-12-02
        LocalDate testCustomer2 = LocalDate.of(2019, 12, 02);

        assertEquals(customers.size(), 2);
        assertEquals(customers.get(0).birthNumber, "7703021234");
        assertTrue(customers.get(1).paymentDate.equals(testCustomer2));
        assertFalse(customers.get(0).paymentDate.equals(testCustomer2));
        assertEquals(customers.get(1).fullName, "Bear Belle");
        assertNotEquals(customers.get(1).fullName, "Alhambra Aromes");
    }

    public void filePrinterTest (){

    }

}