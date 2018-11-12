package Vector;

/**
 * ID:2017000000248
 * @author Kamrul Jaman
 */
public class VectorDemo {

    public static void main(String[] args) {
        Vector d1 = new Vector(2);
        d1.setComponent(0, 4);
        d1.setComponent(1, 5);

        Vector d2 = new Vector(2);
        d2.setComponent(0, 6);
        d2.setComponent(1, 7);

        double expResult = d1.pro(d2);
        Vector d3 = new Vector(3);
        d3.setComponent(0, 4);
        d3.setComponent(1, 5);
        d3.setComponent(2, 6);

        Vector d4 = new Vector(3);
        d4.setComponent(0, 7);
        d4.setComponent(1, 8);
        d4.setComponent(2, 9);

        double expResult2 = d3.pro(d4);
        
        System.out.println(expResult2);

    }

}
