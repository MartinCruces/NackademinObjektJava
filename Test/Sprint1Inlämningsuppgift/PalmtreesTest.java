package Sprint1Inlämningsuppgift;

import Sprint1Inlämningsuppgift.Palmtrees;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmtreesTest {


    @Test
    void amountOfWaterHalfLitreMultiPBy2(){
        Palmtrees p = new Palmtrees("Palme", 2);
        assertEquals(1, p.amountWater);
        assertNotEquals(2.5, p.amountWater);

    }
    @Test
    void amountOfWaterHalfLitreMultiPby21(){
        Palmtrees p = new Palmtrees("Palme", 21);
        assertEquals(10.5, p.tapWater * p.getHeight());
        assertEquals("Palme", p.getNamePlant());
        assertNotEquals(null, p.getNamePlant());
    }
}