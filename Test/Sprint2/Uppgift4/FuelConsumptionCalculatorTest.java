package Sprint2.Uppgift4;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuelConsumptionCalculatorTest {

    Sprint2.Uppgift4.FuelConsumptionCalculator input1 = new Sprint2.Uppgift4.FuelConsumptionCalculator
            (3000,5000,1000);


    @Test
    public void testConstructor(){

        assertEquals(input1.milesLastYear, 3000);
        assertEquals(input1.currentMiles,5000 );
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
        assertEquals("Antal körda mil: 2000.0", input1.printCalMiles());
        assertEquals("Antal liter bränsle: 1000.0", input1.printLitre());
        assertEquals("Förbrukning liter/mil: 0.5", input1.printFuelConsumption());


    }
}