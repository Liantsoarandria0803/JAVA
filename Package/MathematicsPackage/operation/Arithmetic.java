package operation;
import nombre.Complex;
import nombre.Irrationnal;
import nombre.Rationnal;

public class Arithmetic {
    public Arithmetic()
    {
        ;
    }
    public Rationnal sumRationnal(Rationnal a , Rationnal b)
    {
        Rationnal result = new Rationnal(0, 0) ;
        result.setNum(a.getNum() * b.getDen() + b.getNum() * a.getDen());
        result.setDen(a.getDen() * b.getDen());
        return result;
    }
    public Rationnal subRationnal(Rationnal a , Rationnal b)
    {
        Rationnal result = new Rationnal(0, 0) ;
        result.setNum(a.getNum() * b.getDen() - b.getNum() * a.getDen());
        result.setDen(a.getDen() * b.getDen());
        return result;
    }
    public Rationnal mulRationnal(Rationnal a , Rationnal b)
    {
        Rationnal result = new Rationnal(0, 0) ;
        result.setNum(a.getNum() * b.getNum());
        result.setDen(a.getDen() * b.getDen());
        return result;
    }
    public Rationnal divRationnal(Rationnal a , Rationnal b)
    {
        Rationnal result = new Rationnal(0, 0) ;
        result.setNum(a.getNum() * b.getDen());
        result.setDen(a.getDen() * b.getNum());
        return result;
    }

    /*                                               *                                        */

    public Irrationnal sumIrrationnal(Irrationnal a , Irrationnal b)
    {
        Irrationnal result = new Irrationnal(0) ;
        result = new Irrationnal(a.getValues() + b.getValues());
        return result;
    }
    public Irrationnal subIrrationnal(Irrationnal a , Irrationnal b)
    {
        Irrationnal result = new Irrationnal(0) ;
        result = new Irrationnal(a.getValues() - b.getValues());
        return result;
    }
    public Irrationnal mulIrrationnal(Irrationnal a , Irrationnal b)
    {
        Irrationnal result = new Irrationnal(0) ;
        result = new Irrationnal(a.getValues() * b.getValues());
        return result;
    }
    public Irrationnal divIrrationnal(Irrationnal a , Irrationnal b)
    {
        Irrationnal result = new Irrationnal(0) ;
        result = new Irrationnal(a.getValues() / b.getValues());
        return result;
    }
                /*                                                            */

    public Complex sumComplex(Complex a , Complex b)
    {
        Complex result = new Complex(0, 0) ;
        result.setReal(a.getReal() + b.getReal());
        result.setIm(a.getIm() + b.getIm());
        return result;
    }
    public Complex subComplex(Complex a , Complex b)
    {
        Complex result = new Complex(0, 0) ;
        result.setReal(a.getReal() - b.getReal());
        result.setIm(a.getIm() - b.getIm());
        System.out.println("The rest is : " + result.toString());
        return result;
    }
    public Complex mulComplex(Complex a , Complex b)
    {
        Complex result = new Complex(0, 0) ;
        result.setReal(a.getReal() * b.getReal() - a.getIm() * b.getIm());
        result.setIm(a.getReal() * b.getIm() + a.getIm() * b.getReal());
        return result;
    }
    /*                                                   */

    public Complex addComplexRationnal(Complex a , Rationnal b)
    {
        Complex result = new Complex(0, 0) ;
        result.setReal(a.getReal() + b.getValues());
        result.setIm(a.getIm());
        return result;
    }
    public Complex addComplexIrrationnal(Complex a , Irrationnal b)
    {
        Complex result = new Complex(0, 0) ;
        result.setReal(a.getReal() + b.getValues());
        result.setIm(a.getIm());
        return result;    
    }
    public Complex subComplexRationnal(Complex a , Rationnal b)
    {
        Complex result = new Complex(0, 0) ;
        result.setReal(a.getReal() - b.getValues());
        result.setIm(a.getIm());
        return result;
    }
    public Complex subComplexIrrationnal(Complex a , Irrationnal b)
    {
        Complex result = new Complex(0, 0) ;
        result.setReal(a.getReal() - b.getValues());
        result.setIm(a.getIm());
        return result;    
    }
}
