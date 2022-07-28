import java.util.Scanner;
class DemoFinally
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter any non zero number");
  int a=0;
  int i=sc.nextInt();
  try
  {
    a=100/i;
	System.out.println("inside try");
  }
  catch(Exception e)
  {
    e.printStackTrace();
  }
  finally
  {
   System.out.println("value of a is:"+a);
   System.out.println("end of the program");
  }
  }
}