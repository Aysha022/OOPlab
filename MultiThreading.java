import java.util.*;

public class Main
{
  
    public static void main(String[] args)
    {
        number_gen obj=new number_gen();
        even e=new even();
        odd o=new odd();

        obj.start();
        e.start();;
        o.start();

        try{
            obj.join();
            e.join();
            o.join();
        }
        catch(Exception ex){

        }
    }
 
}

class SharedData
{
    static int numgen;
    static boolean num_gen=false;
    static boolean isEven;

}

class number_gen extends Thread
{
    Random obj=new Random();
    public void run()
    {
        int num;
        int i=0;
        while(i<10)
        {
            num=obj.nextInt(10) + 1;
             synchronized(SharedData.class)
                {
           
                    SharedData.numgen=num;
                    SharedData.num_gen=true;

                    if(num % 2 ==0)
                    {
                        SharedData.isEven=true;
                        System.out.println("Number generated :" + num);
                    }
                    else
                    {
                        SharedData.isEven=false;
                        System.out.println("Number generated :" + num);
                    }
                    SharedData.class.notifyAll();
                 }
                 i++;

                 try{
                    Thread.sleep(1000);
                 }
                 catch(Exception e)
                 {
                    System.out.println("exception occured ...");
                 }
        }
        
    }
}

class even extends Thread{

    
    public void run()
    {
        while(true)
        {
            int n;
            synchronized(SharedData.class)
            {
            while(!SharedData.num_gen || !SharedData.isEven)
            {
                try{
                    SharedData.class.wait();
                }
                catch(Exception e)
                {

                }
            }
            n=SharedData.numgen;
            SharedData.num_gen=false;

        }

        int result=n*n;
        System.out.println("Even so square :" + result);


        }
    }
}

class odd extends Thread
{
    public void run()
    {
        while(true)
        {
            int val;
            synchronized(SharedData.class)
            {
                while(!SharedData.num_gen || SharedData.isEven)
                {
                    try{
                        SharedData.class.wait();
                    }
                    catch(Exception e){}
                }

                val=SharedData.numgen;
                SharedData.num_gen=false;
            }

            int res=val*val*val;
            System.out.println("Odd number so cube: " + res);
        }
    }
 }
          
