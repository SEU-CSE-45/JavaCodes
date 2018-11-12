package Vector;

/**
 * ID:2017000000248
 *
 * @author Kamrul Jaman
 */
public class Vector {

    public double[] components;

    public Vector(int dimension) {
        components = new double[dimension];
    }

    public void setComponent(int index, double component) {
        components[index] = component;
    }

    // Dot Product
    public double dot(Vector that) {
        double sum = 0.0;
        try {
            if (this.components.length == that.components.length) {
                for (int i = 0; i < this.components.length; i++) {
                    sum = sum + this.components[i] * that.components[i];
                }
            } else {
                int C = 40 / 0;
            }
        } catch (Exception e) {
            System.out.println("Dot Product Possible Only With 2 Same dimensional vector");
        }

        return sum;
    }

    //Cross 2 
    public Vector cross(Vector that) {
        Vector f = new Vector(3);
        try {
            if (that.components.length == 3 && this.components.length == 3) {
                //f = new Vector(3);
                f.components[0] = this.components[1] * that.components[2] - this.components[2] * that.components[1];
                f.components[1] = this.components[2] * that.components[0] - this.components[0] * that.components[2];
                f.components[2] = this.components[0] * that.components[1] - this.components[1] * that.components[0];
            } else {
                int C = 40 / 0;
            }

        } catch (Exception e) {
            System.err.println("Cross Vector Possible Only With between Two 3D vector");
        }
        return f;
    }

    //Normalization
    public Vector normal() {
        Vector r = new Vector(this.components.length);
        double mag = mag();

        for (int i = 0; i < this.components.length; i++) {
            r.components[i] = this.components[i] / mag;
        }

        return r;

    }

    //Magnitude Calculation
    public double mag() {
        double mag, sum = 0;

        for (int i = 0; i < this.components.length; i++) {

            sum = sum + (this.components[i] * this.components[i]);

        }
        mag = Math.sqrt(sum);

        return mag;
    }

    //Vector Projection
    public double pro(Vector that) {
        double AB, mag, pro;

        AB = this.dot(that);
        mag = that.mag();
        pro = AB / mag;

        return pro;
    }

    // Addition
    public Vector add(Vector that) {
        // HW: How will we handle cases where the user
        // tries to add a 2D vector with a 3D vector?
        Vector r = new Vector(this.components.length);

        try {
            if (this.components.length == that.components.length) {
                for (int i = 0; i < this.components.length; i++) {
                    r.setComponent(i, this.components[i] + that.components[i]);
                }

            } else {
                int C = 40 / 0;
            }
        } catch (Exception e) {
            System.err.println("Addition Possible Only With 2 Same dimensional vector");
        }

        return r;
    }

    // Subtraction
    public Vector sub(Vector that) {
        Vector r = new Vector(this.components.length);
        try {
            if (this.components.length == that.components.length) {
                for (int i = 0; i < this.components.length; i++) {
                    r.setComponent(i, this.components[i] - that.components[i]);
                }

            } else {
                int C = 40 / 0;
            }
        } catch (Exception e) {
            System.err.println("Subtraction Possible Only With 2 Same dimensional vector");
        }

        return r;
    }

    //Print Vector
    public void print() {
        System.out.print("(");
        for (int i = 0; i < components.length; i++) {
            if (i == 0) {
                System.out.printf("%.2f", components[i]);
            } else {
                System.out.printf(", %.2f", components[i]);
            }
        }
        System.out.print(")\n");
    }

    // I can't find out what is  verctor construction !!
}
