public class Main
{
 public static void main(String[] args)
 {
   int num=19;
  System.out.println("Entered number is "+num);
   try
   {
     checknum(num);
   }
   catch(EvenException e)
   {
    System.out.println(""+e);
   }
   catch(OddException o)
   {
    System.out.println(""+o);
   }
 }
 public static void checknum(int n) throws EvenException,OddException
 {
   if(n%2==0)
   {
     throw new EvenException();
   }
   else
   {
     throw new OddException();
   }
 }
}
 
class EvenException extends Exception
{
  public String toString()
  {
    return "caught even exception";
  }
}
class OddException extends Exception
{
  public String toString()
  {
    return "caught odd exception";
  }
}
