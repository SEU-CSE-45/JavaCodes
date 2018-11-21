package rationalnumberdemo;

public class RationalNumber {

    public int numerator;
    public int denominator;

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public RationalNumber add(RationalNumber that) {
        int n = this.numerator * that.denominator
                + this.denominator * that.numerator;
        int d = this.denominator * that.denominator;
        RationalNumber result = new RationalNumber(n, d);
        return result;
    }

    public RationalNumber subtract(RationalNumber that) {
        int n = this.numerator * that.denominator
                - this.denominator * that.numerator;
        int d = this.denominator * that.denominator;
        RationalNumber result = new RationalNumber(n, d);
        return result;
    }

    public RationalNumber multiply(RationalNumber that) {
        int n = this.numerator  * that.numerator;
        int d = this.denominator * that.denominator;
        RationalNumber result = new RationalNumber(n, d);
        return result;
    }

    public RationalNumber divide(RationalNumber that) {
        int n = this.numerator  * that.denominator;
        int d = this.denominator * that.numerator;
        RationalNumber result = new RationalNumber(n, d);
        return result;
    }

    public void print() {
        System.out.printf("%d/%d\n", numerator, denominator);
    }

    @Override
    public boolean equals(Object o) {
        RationalNumber that = (RationalNumber) o;
        if (this.numerator * that.denominator
                == this.denominator * that.numerator) {
            return true;
        } else {
            return false;
        }
    }
}
