package vectorialOperation;

import nombre.*;
import operation.Arithmetic;
import algebreLin.Matrix;
import algebreLin.Vector;

public class AlgebreOperation 
{
    public AlgebreOperation() {}
    private Arithmetic a = new Arithmetic();
    
    public Vector sumVectorComplex(Vector a , Vector b) 
    {
        if (!a.getType().equals("Complex") || !b.getType().equals("Complex")) 
        {
            System.out.println("Both vectors must be of type Complex");
            return null;
        }
        if (a.getVectorComplex().length != b.getVectorComplex().length) 
        {
            System.out.println("Sum impossible: Vectors dimensions do not match");
            return null;
        }
        Vector result = new Vector(0, "Complex");
        Complex[] c = new Complex[a.getVectorComplex().length];
        for(int i = 0; i < a.getVectorComplex().length; i++) 
        {
            c[i] = this.a.sumComplex(a.getVectorComplex()[i], b.getVectorComplex()[i]);
        }
        result.setVectorComplex(c);
        return result;
    }
    
    public Vector sumVectorRationnal(Vector a , Vector b) 
    {
        if (!a.getType().equals("Rationnal") || !b.getType().equals("Rationnal")) 
        {
            System.out.println("Both vectors must be of type Rationnal");
            return null;
        }
        if (a.getVectorRationnal().length != b.getVectorRationnal().length) 
        {
            System.out.println("Sum impossible: Vectors dimensions do not match");
            return null;
        }
        Vector result = new Vector(a.getSize(), "Rationnal");
        Rationnal[] r = new Rationnal[a.getVectorRationnal().length];
        for(int i = 0; i < a.getVectorRationnal().length; i++) 
        {
            r[i] = this.a.sumRationnal(a.getVectorRationnal()[i], b.getVectorRationnal()[i]);
        }
        result.setVectorRationnal(r);
        return result;
    }
    
    public Vector sumVectorIrrationnal(Vector a, Vector b) 
    {
        if (!a.getType().equals("Irrationnal") || !b.getType().equals("Irrationnal")) 
        {
            System.out.println("Both vectors must be of type Irrationnal");
            return null;
        }
        if(a.getVeIrrationnal().length != b.getVeIrrationnal().length) 
        {
            System.out.println("Sum impossible: Vectors dimensions do not match");
            return null;
        }
        Vector result = new Vector(a.getSize(), "Irrationnal");
        Irrationnal[] i = new Irrationnal[a.getVeIrrationnal().length];
        for(int j = 0; j < a.getVeIrrationnal().length; j++) 
        {
            i[j] = this.a.sumIrrationnal(a.getVeIrrationnal()[j], b.getVeIrrationnal()[j]);
        }
        result.setVeIrrationnal(i);
        return result;
    }

    /* For Matrix */
    public Matrix sumMatrixComplex(Matrix a , Matrix b) 
    {
        if (!a.getType().equals("Complex") || !b.getType().equals("Complex")) 
        {
            System.out.println("Both matrices must be of type Complex");
            return null;
        }
        if (a.getMatrixC().length != b.getMatrixC().length || a.getMatrixC()[0].length != b.getMatrixC()[0].length) 
        {
            System.out.println("Sum impossible: Matrices dimensions do not match");
            return null;
        }
        Matrix result = new Matrix(a.getMatrixC().length , a.getMatrixC().length , "Complex");
        Complex[][] c = new Complex[a.getMatrixC().length][a.getMatrixC()[0].length];
        for(int i = 0; i < a.getMatrixC().length; i++) 
        {
            for(int j = 0; j < a.getMatrixC()[0].length; j++) 
            {
                c[i][j] = this.a.sumComplex(a.getMatrixC()[i][j], b.getMatrixC()[i][j]);
            }
        }
        result.setMatrixC(c);
        return result;
    }
    public Matrix sumMatrixRationnal(Matrix a , Matrix b) 
    {
        if (!a.getType().equals("Rationnal") || !b.getType().equals("Rationnal")) 
        {
            System.out.println("Both matrices must be of type Rationnal");
            return null;
        }
        if (a.getMatrixR().length != b.getMatrixR().length || a.getMatrixR()[0].length != b.getMatrixR()[0].length) 
        {
            System.out.println("Sum impossible: Matrices dimensions do not match");
            return null;
        }
        Matrix result = new Matrix(a.getMatrixR().length, a.getMatrixR()[0].length, "Rationnal");
        Rationnal[][] r = new Rationnal[a.getMatrixR().length][a.getMatrixR()[0].length];
        for(int i = 0; i < a.getMatrixR().length; i++) 
        {
            for(int j = 0; j < a.getMatrixR()[0].length; j++) 
            {
                r[i][j] = this.a.sumRationnal(a.getMatrixR()[i][j], b.getMatrixR()[i][j]);
            }
        }
        result.setMatrixR(r);
        return result;
    }
    public Matrix sumMatrixIrrationnal(Matrix a, Matrix b)
    {
        if (!a.getType().equals("Irrationnal") || !b.getType().equals("Irrationnal")) 
        {
            System.out.println("Both matrices must be of type Irrationnal");
            return null;
        }
        if (a.getMatrixI().length != b.getMatrixI().length || a.getMatrixI()[0].length != b.getMatrixI()[0].length) 
        {
            System.out.println("Sum impossible: Matrices dimensions do not match");
            return null;
        }
        Matrix result = new Matrix(a.getMatrixI().length,a.getMatrixI()[0].length, "Irrationnal");
        Irrationnal[][] i = new Irrationnal[a.getMatrixI().length][a.getMatrixI()[0].length];
        for(int j = 0; j < a.getMatrixI().length; j++) 
        {
            for(int k = 0; k < a.getMatrixI()[0].length; k++) 
            {
                i[j][k] = this.a.sumIrrationnal(a.getMatrixI()[j][k], b.getMatrixI()[j][k]);
            }
        }
        result.setMatrixI(i);
        return result;
    }
}
