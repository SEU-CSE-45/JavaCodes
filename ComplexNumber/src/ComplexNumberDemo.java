
public class ComplexNumberDemo {

    public ComplexNumberDemo() {

        ComplexNumber c = new ComplexNumber(3, 4);
        ComplexNumber d = new ComplexNumber(5, 8);
        ComplexNumber e;
        e = c.div(d);
        printComplex(e);

    }

    public static void main(String[] args) {
        new ComplexNumberDemo();
    }

    void printComplex(ComplexNumber that) {

        if (that.imaginaryPart < 0) {
            System.out.print("(" + that.realPart + "" + that.imaginaryPart + "i)");
        } else {
            System.out.print("(" + that.realPart + "+" + that.imaginaryPart + "i)");
        }

    }
}
