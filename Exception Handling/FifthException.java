import java.util.*;
//import java.util.Scanner;
//import java.util.InputMismatchException;
class FifthException
{
  public static void main(String args[])
  {
    int arr[]={22,33,44,55,66,77,88};
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array index(0-6):");
	int i=1;
	try
	{
	  i=sc.nextInt();
	  System.out.println("value of array element is:"+arr[i]);
	}
	catch(InputMismatchException|ArrayIndexOutOfBoundsException e)
	{
	  e.printStackTrace();
	}
	
    sc.close();
	System.out.println("end of program");
  }
}