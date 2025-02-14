package algebreLin;
import nombre.*;

public class Vector 
{
    private double[] vector;
    private Rationnal[] vectorRationnal;
    private Irrationnal[] veIrrationnal;
    private Complex[] vectorComplex;
    private String type;
    private int size;
    public Vector(int size,String type) 
    {
        this.size = size;
        this.type = type;
        if(type == "Rationnal")
        {
            this.vectorRationnal = new Rationnal[size];
        }
        else if(type == "Complex")
        {
            this.vectorComplex = new Complex[size];
        }
        else if(type == "Irrationnal")
        {
            this.veIrrationnal = new Irrationnal[size];
        }
        else
        {
            this.vector = new double[size];
        }
    }
    /*getter */   
    public double[] getVector() 
    {
        return vector;
    }
    public Rationnal[] getVectorRationnal() 
    {
        return vectorRationnal;
    }
    public Irrationnal[] getVeIrrationnal() 
    {
        return veIrrationnal;
    }
    public Complex[] getVectorComplex() 
    {
        return vectorComplex;
    }
    /*setter */
    public void setVector(double[] vector) 
    {
        this.vector = vector;
    }
    public void setVectorRationnal(Rationnal[] vectorRationnal) 
    {
        this.vectorRationnal = vectorRationnal;
    }
    public void setVeIrrationnal(Irrationnal[] veIrrationnal) 
    {
        this.veIrrationnal = veIrrationnal;
    }
    public void setVectorComplex(Complex[] vectorComplex) 
    {
        this.vectorComplex = vectorComplex;
    }
    public String getType() 
    {
        return type;
    }
    public void setType(String type) 
    {
        this.type = type;
    }
    public int getSize() 
    {
        return size;
    }
    public void setSize(int size) 
    {
        this.size = size;
    }
    public void Display()
    {
        if (this.type == "Rationnal")
        {
            for(int i = 0; i < this.vectorRationnal.length; i++)
            {
                System.out.println(this.vectorRationnal[i].getValues());
            }
        }
        else if (this.type == "Complex")
        {
            for(int i = 0; i < this.vectorComplex.length; i++)
            {
                System.out.println(this.vectorComplex[i]);
            }
        }
        else if (this.type == "Irrationnal")
        {
            for(int i = 0; i < this.veIrrationnal.length; i++)
            {
                System.out.println(this.veIrrationnal[i].getValues());
            }
        }
        else
        {
            for(int i = 0; i < this.vector.length; i++)
            {
                System.out.println(this.vector[i]);
            }
        }
    }
}
