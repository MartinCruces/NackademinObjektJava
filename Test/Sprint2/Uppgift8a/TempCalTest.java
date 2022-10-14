package Sprint2.Uppgift8a;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static org.junit.jupiter.api.Assertions.*;

class TempCalTest {


    TempCal test = new TempCal();

    @Test
    public void parseStringToDouble(){
        String input = "22,5";
        assertTrue(test.parseStringToDouble(input) == 22.5);
        assertFalse(test.parseStringToDouble(input) == 22.6);

    }

    @Test
    public void generateListFromFileTest(){
        List<Double> tempList = test.generateListFromFile("Test/Sprint2/Uppgift8a/testTemp.txt");

        assertTrue(tempList.size() == 4);
        assertTrue(tempList.get(0) == 14.5);
        assertTrue(tempList.get(3) == 23.8);




    }

}