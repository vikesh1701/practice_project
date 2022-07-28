import java.util.Scanner;
class  FirstTryCatch
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("enter any nonzero number:");
	int i=1,j=1;
	i=sc.nextInt();
	try
	{
	  j=100/i;      //Arithematic Exception
	}
    catch(ArithmeticException e)
	{
	  System.out.println("----------------------------");
	   e.printStackTrace();
	  System.out.println("----------------------------");
	
	}
	System.out.println("value of j is :"+j);
	sc.close();
	System.out.println("end of the program");
  }
}