
package rationalnumberdemo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kmhasan
 */
public class RationalNumberTest {
    
    /**
     * Test of add method, of class RationalNumber.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        RationalNumber r2 = new RationalNumber(1, 3);
        RationalNumber r1 = new RationalNumber(2, 3);
        RationalNumber expResult = new RationalNumber(1, 1);
        RationalNumber result = r1.add(r2);
        assertEquals(expResult, result);

    }

    /**
     * Test of subtract method, of class RationalNumber.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        RationalNumber r1 = new RationalNumber(4, 7);
        RationalNumber r2 = new RationalNumber(2, 5);
        RationalNumber expResult = new RationalNumber(6, 35);
        RationalNumber result = r1.subtract(r2);
        assertEquals(expResult, result);
    }

    /**
     * Test of multiply method, of class RationalNumber.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        RationalNumber r1 = new RationalNumber(2, 3);
        RationalNumber r2 = new RationalNumber(17, 3);
        RationalNumber expResult = new RationalNumber(34, 9);
        RationalNumber result = r1.multiply(r2);
        assertEquals(expResult, result);
    }

    /**
     * Test of divide method, of class RationalNumber.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        RationalNumber r1 = new RationalNumber(9, 5);
        RationalNumber r2 = new RationalNumber(3, 4);
        RationalNumber expResult = new RationalNumber(36,15);
        RationalNumber result = r1.divide(r2);
        assertEquals(expResult, result);
    }

}
