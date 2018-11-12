/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vector;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kamrul All test case prepared for 2d & 3d vector
 */
public class VectorTest {

    @Test
    public void testDot() {
        System.out.println("dot");

        // 2D Vector
        Vector d1 = new Vector(2);
        d1.setComponent(0, 4);
        d1.setComponent(1, 5);

        Vector d2 = new Vector(2);
        d2.setComponent(0, 6);
        d2.setComponent(1, 7);

        double expResult = 59;
        double result = d1.dot(d2);
        assertEquals(expResult, result, 0.00001);

        // 3D Vector
        Vector d3 = new Vector(3);
        d3.setComponent(0, 4);
        d3.setComponent(1, 5);
        d3.setComponent(2, 6);

        Vector d4 = new Vector(3);
        d4.setComponent(0, 7);
        d4.setComponent(1, 8);
        d4.setComponent(2, 9);

        double expResult2 = 122;
        double result2 = d3.dot(d4);
        assertEquals(expResult2, result2, 0.00001);

    }

    @Test
    public void testCrossProduct() {
        System.out.println("crossProduct");

        // 3D Vector
        Vector d3 = new Vector(3);
        d3.setComponent(0, 4);
        d3.setComponent(1, 5);
        d3.setComponent(2, 6);

        Vector d4 = new Vector(3);
        d4.setComponent(0, 7);
        d4.setComponent(1, 8);
        d4.setComponent(2, 9);

        double expResult1 = -3;
        double expResult2 = 6;
        double expResult3 = -3;

        Vector result = d3.cross(d4);

        assertEquals(expResult1, result.components[0], 0.00001);
        assertEquals(expResult2, result.components[1], 0.00001);
        assertEquals(expResult3, result.components[2], 0.00001);
    }

    /**
     * Test of normal method, of class Vector.
     */
    @Test
    public void testNormal() {
        System.out.println("normal");

        // 2D Vector
        Vector d1 = new Vector(2);
        d1.setComponent(0, 4);
        d1.setComponent(1, 5);
        double expResult1 = 0.62;
        double expResult2 = 0.78;

        Vector result = d1.normal();
        assertEquals(expResult1, result.components[0], 0.01);
        assertEquals(expResult2, result.components[1], 0.01);

        Vector d2 = new Vector(3);
        d2.setComponent(0, 4);
        d2.setComponent(1, 5);
        d2.setComponent(2, 6);
        double expResult3 = 0.46;
        double expResult4 = 0.57;
        double expResult5 = 0.68;

        Vector result2 = d2.normal();
        assertEquals(expResult3, result2.components[0], 0.01);
        assertEquals(expResult4, result2.components[1], 0.01);
        assertEquals(expResult5, result2.components[2], 0.01);

    }

    /**
     * Test of mag method, of class Vector.
     */
    @Test
    public void testMag() {
        System.out.println("mag");
        // 2D Vector
        Vector d1 = new Vector(2);
        d1.setComponent(0, 4);
        d1.setComponent(1, 5);

        double expResult = 6.40312;
        double result = d1.mag();
        assertEquals(expResult, result, 0.00001);

        // 3D Vector
        Vector d3 = new Vector(3);
        d3.setComponent(0, 4);
        d3.setComponent(1, 5);
        d3.setComponent(2, 6);

        double expResult2 = 8.77496;
        double result2 = d3.mag();
        assertEquals(expResult2, result2, 0.00001);
    }

    /**
     * Test of pro method, of class Vector.
     */
    @Test
    public void testPro() {
        System.out.println("pro");

        // 2D Vector
        Vector d1 = new Vector(2);
        d1.setComponent(0, 4);
        d1.setComponent(1, 5);

        Vector d2 = new Vector(2);
        d2.setComponent(0, 6);
        d2.setComponent(1, 7);

        double expResult = 6.39;
        double result = d1.pro(d2);
        assertEquals(expResult, result, 0.01);

        // 3D Vector
        Vector d3 = new Vector(3);
        d3.setComponent(0, 4);
        d3.setComponent(1, 5);
        d3.setComponent(2, 6);

        Vector d4 = new Vector(3);
        d4.setComponent(0, 7);
        d4.setComponent(1, 8);
        d4.setComponent(2, 9);

        double expResult2 = 8.75;
        double result2 = d3.pro(d4);
        assertEquals(expResult2, result2, 0.01);

    }

    /**
     * Test of add method, of class Vector.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Vector d1 = new Vector(2);
        d1.setComponent(0, 4);
        d1.setComponent(1, 5);

        Vector d2 = new Vector(2);
        d2.setComponent(0, 6);
        d2.setComponent(1, 7);

        double expResult1 = 10;
        double expResult2= 12;
        
        Vector result = d1.add(d2);
        
        assertEquals(expResult1, result.components[0], 0.01);
        assertEquals(expResult2, result.components[1], 0.01);

        // 3D Vector
        Vector d3 = new Vector(3);
        d3.setComponent(0, 4);
        d3.setComponent(1, 5);
        d3.setComponent(2, 6);

        Vector d4 = new Vector(3);
        d4.setComponent(0, 7);
        d4.setComponent(1, 8);
        d4.setComponent(2, 9);

        double expResult3 = 11;
        double expResult4 = 13;
        double expResult5 = 15;
        Vector result2 = d3.add(d4);
        assertEquals(expResult3, result2.components[0], 0.01);
        assertEquals(expResult4, result2.components[1], 0.01);
        assertEquals(expResult5, result2.components[2], 0.01);
    }

    /**
     * Test of sub method, of class Vector.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        Vector d1 = new Vector(2);
        d1.setComponent(0, 4);
        d1.setComponent(1, 5);

        Vector d2 = new Vector(2);
        d2.setComponent(0, 6);
        d2.setComponent(1, 7);

        double expResult1 = -2;
        double expResult2= -2;
        
        Vector result = d1.sub(d2);
        
        assertEquals(expResult1, result.components[0], 0.01);
        assertEquals(expResult2, result.components[1], 0.01);

        // 3D Vector
        Vector d3 = new Vector(3);
        d3.setComponent(0, 4);
        d3.setComponent(1, 5);
        d3.setComponent(2, 6);

        Vector d4 = new Vector(3);
        d4.setComponent(0, 7);
        d4.setComponent(1, 8);
        d4.setComponent(2, 9);

        double expResult3 = -3;
        double expResult4 = -3;
        double expResult5 = -3;
        Vector result2 = d3.sub(d4);
        assertEquals(expResult3, result2.components[0], 0.01);
        assertEquals(expResult4, result2.components[1], 0.01);
        assertEquals(expResult5, result2.components[2], 0.01);
    }

    /**
     * Test of print method, of class Vector.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        Vector instance = new Vector(2);
        instance.setComponent(0, 4);
        instance.setComponent(1, 5);
        instance.print();

    }

}
