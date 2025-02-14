package nombre ;
public class Rationnal 
{
    private int num;
    private int den;
    private double values;
    public Rationnal(int num, int den)
     {
        this.num = num;
        this.den = den;
    }
    public double getValues ()
    {
        values = (double) num / den;
        return values;
    }
    public int getNum()
    {
        return num;
    }
    public int getDen()
    {
        return den;
    }
    public void setNum(int num)
    {
        this.num = num;
    }
    public void setDen(int den)
    {
        if(den==0)
        {
            System.out.println("Error : Null denominator ");
        }
        else
        {
            this.den = den;
        }
    }
}