
package rationalnumberdemo;

public class RationalNumberDemo {

    public static void main(String[] args) {
      
        RationalNumber R1 = new RationalNumber(9,5);
        RationalNumber R2 = new RationalNumber(3,4);
        
        RationalNumber R3=R1.divide(R2);
        R3.print();
        
    }
    
}
