package Sprint1Inlämningsuppgift;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarnivorousTest {

    @Test
    void amountOfProteinHeight4(){
        Carnivorous c = new Carnivorous("Köttis", 4);
        assertEquals(0.9, c.amountOfProtein);
        assertNotEquals(4.3, c.amountOfProtein);
        assertNotEquals(0.18, c.amountOfProtein);
    }
}