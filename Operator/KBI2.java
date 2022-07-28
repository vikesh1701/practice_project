import java.util.Scanner;
class KBI2
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   
   
   System.out.println("enter roll");
   int roll= sc.nextInt();
   System.out.println("roll no is:"+roll);
   System.out.println(sc.nextLine());
   
   System.out.println("enter full name");
   String name= sc.nextLine();
   System.out.println("welcom:"+name);
  
  sc.close();
 }
}