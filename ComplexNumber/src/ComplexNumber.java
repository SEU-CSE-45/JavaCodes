
/**
 *
 * @author Kamrul
 */
public class ComplexNumber {

    double realPart, imaginaryPart;

    //Constrctor
    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    //All Function For add,sub,div,mal,equal 
    public ComplexNumber add(ComplexNumber that) {
        ComplexNumber add=new ComplexNumber(0,0);
        add.realPart = this.realPart + that.realPart;
        add.imaginaryPart = this.imaginaryPart + that.imaginaryPart;
        //System.out.println("Summation of 2 Complex Number is : (" + r + "+" + i + "i)");
        return add;
    }

    public ComplexNumber sub(ComplexNumber that) {
        ComplexNumber sub=new ComplexNumber(0,0);
        sub.realPart = this.realPart - that.realPart;
        sub.imaginaryPart = this.imaginaryPart - that.imaginaryPart;
        //System.out.println("Summation of 2 Complex Number is : (" + r + "+" + i + "i)");
        return sub;
    }
    
    public ComplexNumber mal(ComplexNumber that) {
        ComplexNumber mal=new ComplexNumber(0,0);
        mal.realPart = (this.realPart*that.realPart)-(this.imaginaryPart*that.imaginaryPart);
        mal.imaginaryPart = (this.imaginaryPart*that.realPart)+(this.realPart*that.imaginaryPart); 
        return mal;
    }
    
    public ComplexNumber div(ComplexNumber that) {
        ComplexNumber div=new ComplexNumber(0,0);
        div.realPart = ((this.realPart *that.realPart )+(this.imaginaryPart  *that.imaginaryPart ))/((that.realPart *that.realPart) + (that.imaginaryPart *that.imaginaryPart));
        div.imaginaryPart = ((this.imaginaryPart *that.realPart )-(this.realPart *that.imaginaryPart ))/((that.realPart *that.realPart) + (that.imaginaryPart *that.imaginaryPart));
        return div;      
    }
    
    public void equal(ComplexNumber that) {
        
        if (this.realPart ==that.realPart  && that.imaginaryPart ==this.imaginaryPart ) {
            System.out.println("Given 2 Complex Numet is Equal");
        } else {
            System.out.println("Given Complex Number is not equal");
        }

    }
}
