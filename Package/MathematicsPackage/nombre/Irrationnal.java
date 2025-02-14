package nombre;

public class Irrationnal 
{
    private double num;
    public Irrationnal(double num)
    {
       this.num=num;
    }
    public boolean isIrrational(double number) {
        return !isRational(number);
    }

    private boolean isRational(double number) 
    {
        if (Double.isNaN(number) || Double.isInfinite(number)) 
        {
            return false;
        }
        double tolerance = 1e-9;
        for (int denominator = 1; denominator <= 1000000; denominator++) 
        {
            double numerator = number * denominator;
            if (Math.abs(numerator - Math.round(numerator)) < tolerance) 
            {
                return true;
            }
        }
        return false;
    }
    public double getValues ()
    {
        return this.num;
    }  
    public void setValues(double num)
    {   
        if (isIrrational(num))
        {
            this.num = num;
        }
        else
        {
            System.out.println("Error : Rationnal values");
        }
    }
}
