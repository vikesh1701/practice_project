import java.util.Scanner;
class Practice
{
  public static void main(String args[])
  {
  int temp;
  int x=(int)(Math.random()*100);
  int y=(int)(Math.random()*100);
  
   System.out.println("value of x: "+x+" and   y: "+y+" before swappig");
  
   System.out.println("-------------------------------------------------------");
  
   temp=x;
   x=y;
   y=temp;
   System.out.println("-------------------------------------------------------");
  
   System.out.println("value of x after swappig:"+x);
   System.out.println("value of y after swapping:"+y);
  
  }
}