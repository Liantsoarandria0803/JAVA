package algebreLin;
import nombre.*;

public class Matrix 
{
    private Rationnal[][] matrixR;
    private Complex[][] matrixC;
    private Irrationnal[][] matrixI;
    private double[][] matrix;
    private String type;
    private int rows;
    private int cols;
    
    public Matrix(int rows, int cols,String type) 
    {
        if (type == "Rationnal")
        {
            this.matrixR = new Rationnal[rows][cols];
        }
        else if (type == "Complex")
        {
            this.matrixC = new Complex[rows][cols];
        }
        else if (type == "Irrationnal")
        {
            this.matrixI = new Irrationnal[rows][cols];
        }
        else
        {
            this.matrix = new double[rows][cols];
        }
        this.rows = rows;
        this.cols = cols;
        this.type = type;
    }
    /*Getter */
    public double[][] getMatrix() 
    {
        return matrix;
    }
    public Rationnal[][] getMatrixR() 
    {
        return matrixR;
    }
    public Irrationnal[][] getMatrixI() 
    {
        return matrixI;
    }
    public Complex[][] getMatrixC() 
    {
        return matrixC;
    }
    /*Setter */
    public void setMatrix(double[][] matrix) 
    {
        this.matrix = matrix;
    }
    public void setMatrixR(Rationnal[][] matrixR) 
    {
        this.matrixR = matrixR;
    }
    public void setMatrixI(Irrationnal[][] matrixI) 
    {
        this.matrixI = matrixI;
    }
    public void setMatrixC(Complex[][] matrixC) 
    {
        this.matrixC = matrixC;
    }
    

    public String getType()
    {
        return type;
    }
    public int getRows()
    {
        return rows;
    }
    public int getCols()
    {
        return cols;
    }


    public void setType(String type)
    {
        this.type = type;
    }
    public void setRows(int rows)
    {
        this.rows = rows;
    }
    public void setCols(int cols)
    {
        this.cols = cols;
    }
    public void Display()
    {
        if (this.type == "Rationnal")
        {
            for (int i = 0; i < this.rows; i++)
            {
                for (int j = 0; j < this.cols; j++)
                {
                    System.out.print(this.matrixR[i][j].getValues() + " ");
                }
                System.out.println();
            }
        }
        else if (this.type == "Complex")
        {
            for (int i = 0; i < this.rows; i++)
            {
                for (int j = 0; j < this.cols; j++)
                {
                    System.out.print(this.matrixC[i][j].toString() + " ");
                }
                System.out.println();
            }
        }
        else if (this.type == "Irrationnal")
        {
            for (int i = 0; i < this.rows; i++)
            {
                for (int j = 0; j < this.cols; j++)
                {
                    System.out.print(this.matrixI[i][j].getValues() + " ");
                }
                System.out.println();
            }
        }
        else
        {
            for (int i = 0; i < this.rows; i++)
            {
                for (int j = 0; j < this.cols; j++)
                {
                    System.out.print(this.matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}