package Sprint1Inlämningsuppgift;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreenestTest {
    Cactus igge = new Cactus("Igge", 20);
    String input = "Igge";


    @Test
    void main() {
        assert (igge.getNamePlant().equals("Igge"));
        assert (igge.getNamePlant().equals(input));
    }


}