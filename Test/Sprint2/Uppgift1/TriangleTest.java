package Sprint2.Uppgift1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



class TriangleTest {


    Triangle t1 = new Triangle(3, 8);

    @Test
    public void testGetArea(){
        ;
        assert(t1.getArea() == 12);
    }

    @Test
    public void testHypotenuse(){


        assertEquals(t1.hypotenuse(), 5);
        System.out.println(t1.hypotenuse());
    }

    @Test
    public void testGetCircumference(){

        assertEquals(t1.getCircumference(),18);
        System.out.println(t1.getCircumference());
    }
}