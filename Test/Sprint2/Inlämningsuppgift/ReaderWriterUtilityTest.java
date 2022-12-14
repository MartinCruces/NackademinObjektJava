package Sprint2.Inlämningsuppgift;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReaderWriterUtilityTest {

    ReaderWriterUtility test = new ReaderWriterUtility();
    String fileToRead = "Test/Sprint2/Inlämningsuppgift/readTestFile.txt";
    String fileToWrite = "Test/Sprint2/Inlämningsuppgift/writeTestFile.txt";

    @Test
    public void fileReaderToListTest (){
        /*Information from readTestFile.txt:
        7703021234, Alhambra Aromes
        2022-07-01
        8204021234, Bear Belle
        2019-12-02*/
        List<Customer> customers = test.fileReaderToList(fileToRead);
        //Customer nr 2 in file have paydate 2019-12-02
        LocalDate testCustomer2 = LocalDate.of(2019, 12, 02);

        assertEquals(customers.size(), 2);
        assertEquals(customers.get(0).birthNumber, "7703021234");
        assertTrue(customers.get(1).paymentDate.equals(testCustomer2));
        assertFalse(customers.get(0).paymentDate.equals(testCustomer2));
        assertEquals(customers.get(1).fullName, "Bear Belle".toUpperCase());
        assertNotEquals(customers.get(1).fullName, "Alhambra Aromes".toUpperCase());
    }
    @Test
    public void fileWriterTest (){

        Customer testCustomer = new Customer("8510277690", "Maria Burk",
                LocalDate.of(2022,01,06));

        ReaderWriterUtility.fileWriter(fileToWrite, testCustomer);
    }

    @Test

    public final void filePrinterTest (){
        ReaderWriterUtility.filePrinter(fileToWrite);
    }
}