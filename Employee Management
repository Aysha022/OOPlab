public class Prgm4
{
   public static void main(String[] args)
   { 
    char[] name1={'A','l','b','e','r','t','\0'},name2={'k','e','v','i','n','\0'},address1={'K','o','t','t','a','y','a','m','\0'},address2={'A','l','a','p','p','u','z','h','a','\0'},spcls={'S','o','f','t','w','a','r','e','\0'},dep={'I','T','\0'};
    System.out.println("Officer details");
    Officer officer=new Officer(name1,22,9786,address1,10000,spcls);
    officer.printDetails();
    officer.printSalary();
    officer.printSpcl();
    System.out.println("_________________");
    System.out.println("Manager details");
    Manager manager=new Manager(name2,22,9567,address2,20000,dep);
    
    manager.printDetails();
    manager.printSalary();
    manager.printDep();
   }
}

class Employee
{
   char[] name;
   int age;
   int phone;
   char[] adr;
   int salary;
   
   public Employee(char[] name,int age,int phone,char[] adr,int salary) 
   {
     this.name=name;
     this.age=age;
     this.phone=phone;
     this.adr=adr;
     this.salary=salary;
   }
   
   void printDetails()
   {
     System.out.print("Name:");
     Employee.printitem(this.name);
     System.out.println("Age:"+this.age);
     System.out.println("Phone:"+this.phone);
     System.out.print("Addess:");
     Employee.printitem(this.adr);
   }
 
   void printSalary()
   {
     System.out.println("Salary:"+this.salary);  
   }
   
   static void printitem(char[] a)
   {
     int i;
     for(i=0;a[i]!='\0';i++)
     {
       System.out.print(a[i]);
     }
     System.out.println();
   }
}


class Officer extends Employee
{
 char[] specialisation;
   
 public Officer(char[] name,int age,int phone,char[] adr,int salary,char[] specialisation)
 {
  super(name,age,phone,adr,salary);
  this.specialisation=specialisation;
  }
  void printSpcl()
  {
    System.out.print("Specialisation:");
    Employee.printitem(this.specialisation);
  }
}

class Manager extends Employee
{
 char[] department;
 
 public Manager(char[] name,int age,int phone,char[] adr,int salary,char[] department) 
 {
   super(name,age,phone,adr,salary);
   this.department=department;
 }
 void printDep()
 {
   System.out.print("Department:");
   Employee.printitem(this.department);
 }
}
