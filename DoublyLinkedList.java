import java.util.*;
import java.io.*;

public class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
    DoublyLinkedList d=new DoublyLinkedList();
    int choice;
    System.out.println("1-Insert");
    System.out.println("2-Delete");
    System.out.println("3-Display");
    do
    {
      System.out.println("Enter your choice: ");
      choice=Integer.parseInt(reader.readLine());
      switch(choice)
      {
        case 1:System.out.println("Enter the value to be inserted: ");
        int num=Integer.parseInt(reader.readLine());
        d.Insert(num);
        break;
        case 2:System.out.println("Enter the node to be deleted: ");
        int del=Integer.parseInt(reader.readLine());
        d.Delete(del);
        break;
        case 3:d.Display();
              break;
        default:System.out.println("Invalid choice");
               break;
      }
    }
    while(choice<=3);
  }
}
class Node
{
  int data;
  Node prev;
  Node next;
  
  public Node(int data)
  {
    this.data=data;
    this.prev=null;
    this.next=null;
  }
}

class DoublyLinkedList
{
  Node head;
  
  public void Insert(int data)
  {
     Node newnode=new Node(data);
     if(head==null)
     {
       head=newnode;
     }
     else
     {
       Node current=head;
       while(current.next!=null)
       {
         current=current.next;
       }
       current.next=newnode;
       newnode.prev=current;
     }
  }
  
  public void Delete(int key)
  {
    Node current=head;
    while(current!=null&&current.data!=key)
    {
     current=current.next;   
    }
    if(current==null)
    {
      System.out.println(key+" is not present");
      return;
    }
    if(current.prev!=null)
    {
      current.prev.next=current.next;
    }
    else
    {
      head=current.next;
    }
    if(current.next!=null)
    {
      current.next.prev=current.prev;
    }
  }
  
  public void Display()
  {
   Node current=head;
   while(current!=null)
   {
    System.out.println(current.data);
    current=current.next;
   }
  }
  
                                                                   }
