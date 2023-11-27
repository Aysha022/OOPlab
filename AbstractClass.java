abstract class Shape
{
    public int side;
    abstract int numberOfSides();
    
    
}

class rectangle extends Shape
{
    public int numberOfSides()
    {
       System.out.println("Number of sides of a rectangle is 4");
    }
}

class triangle extends Shape
{
    public int numberOfSides()
    {
       System.out.println("Number of sides of a triangle is 3");
    }
}

class hexagon extends Shape
{
    public int numberOfSides()
    {
       System.out.println("Number if sides of a hexagon is 6");
    }
}

public class Main
{
    public static void main (String[] args) 
    {
        rectangle r = new rectangle();
        triangle t = new triangle();
        hexagon h = new hexagon();
        r.numberOfSides();
        t.numberOfSides();
        h.numberOfSides(); 
    }
}
