import java.util.*;
import java.io.*;

public class Main
{
  public static void main(String[] args)
  {
    int sum=0,num;
    BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
    
   System.out.println("Enter the number of integers: ");
   try
   {
   int n=Integer.parseInt(reader.readLine());
   System.out.println("Enter "+n+" integers");
   String s=reader.readLine();
   StringTokenizer str=new StringTokenizer(s," ");
   while(str.hasMoreTokens())
   {
    num=Integer.parseInt(str.nextToken());
    System.out.println(num);
    sum=sum+num;
   }
   System.out.println("Sum of integers is "+sum);
   }
   catch(IOException e)
   {
     System.out.println(" "+e.getMessage());
   }
  }
  }
