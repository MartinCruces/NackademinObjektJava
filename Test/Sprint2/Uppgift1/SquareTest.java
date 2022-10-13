package Sprint2.Uppgift1;

import org.junit.jupiter.api.Test;



class SquareTest {

    Square s = new Square(6, 6);

    @Test
    public void testArea(){
        assert(s.getArea() == 36);
    }
    @Test
    public void testCircumference(){
        assert(s.getCircumference() == 24);
    }
}