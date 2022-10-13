package Sprint2.Uppgift1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    Circle c1 = new Circle(4);

    @Test

    public void testCircleArea(){

        assertTrue(c1.getArea() - 50.265 > 0);
        assertTrue(c1.getArea() - 50.266 < 0);
        System.out.println(c1.getArea());
    }
    @Test
    public void testCircleCircumference(){

        assertTrue(c1.getCircumference() - 25.132 > 0);
        assertTrue(c1.getCircumference() - 25.133 < 0);
    }
}
