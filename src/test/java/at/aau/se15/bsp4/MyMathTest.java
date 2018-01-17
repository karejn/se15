//01561035 Königstorfer

package at.aau.se15.bsp4;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class MyMathTest {

    @Test
    public void basicMathCalculationTest() {
        Double x=10d;
        Double y=5d;
        MyMath myMath = new MyMath();

        Double add=myMath.add(x,y);
        assertTrue(add.equals(15d));

        Double sub=myMath.sub(x,y);
        assertTrue(sub.equals(5d));

        Double mul=myMath.mul(x,y);
        assertTrue(mul.equals(50d));

        Double div=myMath.div(x,y);
        assertTrue(div.equals(2d));


    }

    @Test
    public void reducingTest() {
        Fraction f = new Fraction(1,1);
        MyMath mm = new MyMath();
        Fraction reduced = mm.reduce(f);
        assertEquals(new Integer(1),reduced.getNumerator());
        assertEquals(new Integer(1),reduced.getDenumerator());

        f.setNumerator(10);
        f.setDenumerator(6);
        reduced = mm.reduce(f);
        assertEquals(new Integer(5),reduced.getNumerator());
        assertEquals(new Integer(3),reduced.getDenumerator());

        f.setNumerator(10);
        f.setDenumerator(5);
        reduced = mm.reduce(f);
        assertEquals(new Integer(2),reduced.getNumerator());
        assertEquals(new Integer(1),reduced.getDenumerator());

        f.setNumerator(10);
        f.setDenumerator(5);
        Double aDouble = mm.toDouble(f);
        assertEquals(new Double(2),aDouble);

        f.setNumerator(10);
        f.setDenumerator(4);
        aDouble = mm.toDouble(f);
        assertEquals(new Double(2.5d),aDouble);
    }
}
