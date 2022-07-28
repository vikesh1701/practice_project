import java.util.Scanner;
class KBI
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   
   System.out.println("enter first number:");
   int i=sc.nextInt();
  
     System.out.println("enter second  number:");
   int j=sc.nextInt();
   
   System.out.println("sum is:"+(i+j));
   sc.close();
  }

}