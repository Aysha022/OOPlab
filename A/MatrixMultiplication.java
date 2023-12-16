public class MatrixWithClass
{
    public static void main(String[] args) 
    {
        int m = 3, n = 2, p = 2, q = 3;
        int[][] arrA = {
                {1, 2},
                {3,4},
                {1,1}
        }, arrB = {
                {1, 0, 1},
                {1, 1, 2},
        };
    Matrix A = new Matrix(arrA, m, n);
    Matrix B = new Matrix(arrB, p, q);
    
    Matrix C = A.mult(B);

    C.display();
    }
}

class Matrix 
{
    int[][] arr;
    int m, n;
    public Matrix(int[][] arr, int m, int n) 
    {
        this.arr = arr;
        this.m = m;
        this.n = n;
    }

   Matrix mult(Matrix B) 
   {
    int[][] arrA=this.arr;
    int[][] arrB=B.arr;
    int[][] arrC= new int[this.m][B.n];

    for(int i=0; i<this.m; i++) 
    {
     for(int j=0; j<B.n; j++)
     {
       arrC[i][j] = 0;
       for(int k=0; k<this.n; k++)
       {
       arrC[i][j] = arrC[i][j]+this.arr[i][k] * B.arr[k][j];
       }
      }
    }
    return new Matrix(arrC, this.m, B.n);
    }
 public void display()
    {
        for(int i=0; i<this.m; i++)
        {
            for(int j=0; j<this.n; j++) 
            {
                System.out.print(this.arr[i][j] + " ");
            }
            System.out.println();
        }
    }
 }
