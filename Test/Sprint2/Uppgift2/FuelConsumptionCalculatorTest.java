package Sprint2.Uppgift2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuelConsumptionCalculatorTest {

    FuelConsumptionCalculator input1 = new FuelConsumptionCalculator(3000,5000,1000);


    @Test
    public void testConstructor(){

        assertEquals(input1.milesLastYear, 3000);
        assertEquals(input1.currentMiles, 5000 );
        assertEquals(input1.litre, 1000);
        assertNotEquals(input1.milesLastYear, 5000);
        assertNotEquals(input1.litre, 3000);
    }
    @Test
    public void testSubtractionCalMiles(){
        assertEquals(input1.calMiles(), 2000);
        assertNotEquals(input1.calMiles(), 8000);
        assertTrue(input1.calMiles() > 0);
    }
    @Test
    public void testCalMiles(){
        assertEquals(input1.calFuelConsumption(), 0.5);
        assertTrue(input1.calFuelConsumption() > 0);
    }

    @Test
    public void testPrintOut(){
        assertTrue(input1.printCalMiles().equals( "Antal körda mil: 2000.0"));
        assertTrue(input1.printLitre().equals( "Antal liter bränsle: 1000.0"));
        assertTrue(input1.printFuelConsumption().equals("Förbrukning per mil: 0.5"));


    }
}