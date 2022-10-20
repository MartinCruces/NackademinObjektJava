package Sprint2.Uppgift8b;

import Sprint2.Uppgift8a.TempCal;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TempCalTest {


    Sprint2.Uppgift8a.TempCal test = new TempCal();

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
    @Test
    public void calcHighestValueTest(){
        List<Double> tempList = Arrays.asList(13.4, 17.4, 15.6, 14.5);

        assertTrue(test.calcHighestValue(tempList) == 17.4);
        assertFalse(test.calcHighestValue(tempList) == 14.5);

    }
    @Test
    public void calcLowestValueTest(){
        List<Double> tempList = Arrays.asList(1.1, 2.2, 3.3, 4.4);
        System.out.println(test.calcLowestValue(tempList));
        assertTrue(test.calcLowestValue(tempList) == 1.1);
        assertFalse(test.calcLowestValue(tempList) == 4.5);
    }

    @Test
    public  void calcAverageTest(){
        List<Double> tempList = Arrays.asList(13.4, 17.4, 15.6, 14.5);
        System.out.println(test.calcAverage(tempList));
        assertTrue(test.calcAverage(tempList) == 15.225);

    }
}