package nombre;

public class Complex 
{
    private double re;
    private double im;
    public Complex(double re, double im) 
    {
        this.re = re;
        this.im = im;
    }
    public double getIm() 
    {
        return im;
    }
    public double getReal()
    {
         return re;
    }
    // public Complex add(Complex c) {
    //     return new Complex(re + c.re, im + c.im);
    // }
    // public Complex sub(Complex c) {
    //     return new Complex(re - c.re, im - c.im);
    // }
    // public Complex mul(Complex c) {
    //     return new Complex(re * c.re - im * c.im, re * c.im + im * c.re);
    // }
    // public Complex div(Complex c) {
    //     double d = c.re * c.re + c.im * c.im;
    //     return new Complex((re * c.re + im * c.im) / d, (im * c.re - re * c.im) / d);
    // }
    public void setReal(double re)
    {
        this.re = re;
    }
    public void setIm(double im)
    {
        this.im = im;
    }
    public String toString() 
    {
        return re + " + " + im + "i";
    }
}