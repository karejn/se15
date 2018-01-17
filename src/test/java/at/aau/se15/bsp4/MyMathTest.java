package at.aau.se15.bsp4;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class MyMathTest {

    @Test
    public void x() {
        Double x=10d;
        Double y=5d;
        MyMath myMath = new MyMath();
        Double add=myMath.add(x,y);
        Double sub=myMath.sub(x,y);
        Double mul=myMath.mul(x,y);
        Double div=myMath.div(x,y);

        assertTrue(add.equals(new Double(15)));
        assertTrue(sub.equals(new Double(5)));
        assertTrue(mul.equals(new Double(50)));
        assertTrue(div.equals(new Double(2)));
    }

    @Test
    public void x2() {
        Fraction f = new Fraction(1,1);
        MyMath mm = new MyMath();
        Fraction reduced = mm.reduce(f);
        assertEquals(new Integer(1),reduced.getNumerator());
        assertEquals(new Integer(1),reduced.getDenumerator());

        f = new Fraction(10,6);
        mm = new MyMath();
        reduced = mm.reduce(f);
        assertEquals(new Integer(5),reduced.getNumerator());
        assertEquals(new Integer(3),reduced.getDenumerator());

        f = new Fraction(10,5);
        mm = new MyMath();
        reduced = mm.reduce(f);
        assertEquals(new Integer(2),reduced.getNumerator());
        assertEquals(new Integer(1),reduced.getDenumerator());

        f = new Fraction(10,5);
        mm = new MyMath();
        Double aDouble = mm.toDouble(f);
        assertEquals(new Double(2),aDouble);

        f = new Fraction(10,4);
        mm = new MyMath();
        aDouble = mm.toDouble(f);
        assertEquals(new Double(2.5d),aDouble);
    }
}
