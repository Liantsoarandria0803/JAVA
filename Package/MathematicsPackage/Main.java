import algebreLin.*;
import vectorialOperation.*;
import nombre.*;

public class Main 
{
    public static void main(String[] args) 
    {

    /* Linear Algebre */
    /* MATRIX */
       Matrix m = new Matrix(2, 2, "Rationnal");
       Matrix m1 = new Matrix(2, 2, "Complex");
       Matrix m2 = new Matrix(2, 2, "Irrationnal");
       Rationnal [][] r = {{new Rationnal(1, 2), new Rationnal(1, 2)}, {new Rationnal(1, 2), new Rationnal(1, 3)}};
       Complex [][] c = {{new Complex(1, 2), new Complex(1, 2)}, {new Complex(1, 2), new Complex(1, 2)}};
       Irrationnal [][] i = {{new Irrationnal(Math.sqrt(3)), new Irrationnal(Math.sqrt(2))}, {new Irrationnal(Math.sqrt(3)), new Irrationnal(Math.sqrt(2))}};
        m.setMatrixR(r);
        m1.setMatrixC(c);
        m2.setMatrixI(i);
        System.out.println("Matrix Rationnal");
        m.Display();
        System.out.println("Matrix Complex");
        m1.Display();
        System.out.println("Matrix Irrationnal");
        m2.Display();
       AlgebreOperation ao = new AlgebreOperation();
       System.out.println("Le double du matrice m:");
       ao.sumMatrixRationnal(m, m).Display();
       System.out.println("Le double du matrice m1 :");
       ao.sumMatrixComplex(m1, m1).Display();
       System.out.println("Le double du matrice m2:");
       ao.sumMatrixIrrationnal(m2, m2).Display();


       System.out.println("");
       System.out.println("");
       /* VETCOR  */

       Vector v1R= new Vector(4, "Rationnal");
       Vector v1C= new Vector(4, "Complex");
       Vector v1I= new Vector(4, "Irrationnal");
       Irrationnal [] vecI={new Irrationnal(Math.sqrt(3)), new Irrationnal(Math.sqrt(2)), new Irrationnal(Math.sqrt(3)), new Irrationnal(Math.sqrt(2))};
       Rationnal [] vecR={new Rationnal(1, 2), new Rationnal(1, 2), new Rationnal(1, 2), new Rationnal(1, 3)};
       Complex [] vecC ={new Complex(1, 2), new Complex(1, 2), new Complex(1, 2), new Complex(1, 2)};
        v1R.setVectorRationnal(vecR);  
        v1I.setVeIrrationnal(vecI);
        v1C.setVectorComplex(vecC);
        System.out.println("Double of v1R");
        ao.sumVectorRationnal(v1R, v1R).Display();
        System.out.println("Double of v1C");
        ao.sumVectorComplex(v1C, v1C).Display();
        System.out.println("Double of v1I");
        ao.sumVectorIrrationnal(v1I, v1I).Display();
    }    
}
