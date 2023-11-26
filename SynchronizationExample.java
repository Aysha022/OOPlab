import java.io.*;

public class Main
{
  public static void main(String[] args)
  {
    CallMe tar=new CallMe();
    Caller t1=new Caller(tar,"Hello");
    Caller t2=new Caller(tar,"Synchronized");
    Caller t3=new Caller(tar,"World");
    
    try
    {
      t1.t.join();
      t2.t.join();
      t3.t.join();
    }
    catch(InterruptedException ex)
    {
      System.out.println(ex);
    }
  }
}

class CallMe
{
  public void call(String msg)
  {
    System.out.print("["+msg);
    try
    {
       Thread.sleep(1000);
    }
    catch(InterruptedException ex)
    {
      System.out.println(ex);
    }
    System.out.println("]");
  }
}

class Caller implements Runnable
{
  String msg;
  CallMe target;
  Thread t;
  public Caller(CallMe target,String msg)
  {
    this.target=target;
    this.msg=msg;
    t=new Thread(this);
    t.start();
  }
  public void run()
  {
    synchronized(target)
    {
      target.call(msg);
    }
  }
}
