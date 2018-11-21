/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kamrul
 */
public class ComplexNumerTest {

    // TODO add test methods here.
    @Test
    public void testadd() {
        ComplexNumber c = new ComplexNumber(5, 6);
        ComplexNumber d = new ComplexNumber(3, 4);
        //Aspect results
        ComplexNumber as = new ComplexNumber(8, 10);
        ComplexNumber output;
        output = c.add(d);
        //Test Method
        assertEquals(as.realPart, output.realPart, 0.00001);
        assertEquals(as.imaginaryPart, output.imaginaryPart, 0.00001);
    }

    @Test
    public void testsub() {
        ComplexNumber c = new ComplexNumber(5, 6);
        ComplexNumber d = new ComplexNumber(3, 4);
        //Aspect results
        ComplexNumber as = new ComplexNumber(2, 2);
        ComplexNumber output;
        output = c.sub(d);
        assertEquals(as.realPart, output.realPart, 0.00001);
        assertEquals(as.imaginaryPart, output.imaginaryPart, 0.00001);
    }

    @Test
    public void testmal() {
        ComplexNumber c = new ComplexNumber(5, 6);
        ComplexNumber d = new ComplexNumber(3, 4);
        //Aspect Results
        ComplexNumber as = new ComplexNumber(-9, 38);
        ComplexNumber output;
        
        output = c.mal(d);
        assertEquals(as.realPart, output.realPart, 0.00001);
        assertEquals(as.imaginaryPart, output.imaginaryPart, 0.00001);
    }
     @Test
    public void testdiv() {
        ComplexNumber c = new ComplexNumber(5, 6);
        ComplexNumber d = new ComplexNumber(3, 4);
        //Aspect Results
        ComplexNumber as = new ComplexNumber(1.56, -0.08);
        ComplexNumber output;
        
        output = c.div(d);
        assertEquals(as.realPart, output.realPart, 0.00001);
        assertEquals(as.imaginaryPart, output.imaginaryPart, 0.00001);
    }
}
