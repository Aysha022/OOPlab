public class Main
{
    public static void main(String[] args) 
    {
       char[] word={'m','a','d','a','m','\0'};
       Palindrome s=new Palindrome(word);
       s.findLength();
       s.checkPalindrome();
    }
}
 class Palindrome
{
   private char[] str;
   private int len=0;
   private int pal=1;
   
   public Palindrome(char[] word)
   {
       this.str=word;
   }
   
   protected void findLength()
   {
     int i;
     for(i=0;str[i]!='\0';i++)
     {
        len++;
     }
       
   }
  
   protected void checkPalindrome()
   {
     int l=0;
     int r;
     
     r=len-1;
     
     while(l<r)
     {
       if(str[l]!=str[r])
       {
         pal=0;
         break;
       }
       l++;
       r--;
     }
     
    if(pal==1)
    {
       System.out.println("String is palindrome");
    }
    else
    {
       System.out.println("String is not palindrome");
    }
    
 }
}
