public class ComplexNumber {

    // fields
    private double real;
    private double imaginary;

    // constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // getters
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    // method overloading
    public void add(double real, double imaginary) {
        this.real = this.real + real;
        this.imaginary = this.imaginary + imaginary;
        //System.out.println(this.real + " + " + this.imaginary);
    }

    public void add(ComplexNumber number) {
        this.real = this.real + number.real;
        this.imaginary = this.imaginary + number.imaginary;
        //System.out.println(this.real + " + " + this.imaginary);
    }

    public void subtract (double real, double imaginary) {
        this.real = this.real - real;
        this.imaginary = this.imaginary - imaginary;
        //System.out.println(this.real + " + " + this.imaginary);
    }

    public void subtract(ComplexNumber number) {
        this.real = this.real -+ number.real;
        this.imaginary = this.imaginary - number.imaginary;
        //System.out.println(this.real + " + " + this.imaginary);
    }

}
