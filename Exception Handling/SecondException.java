import java.util.Scanner;
class SecondException
{
  public static void main(String args[])
  {
    int arr[]={22,33,44,55,66,77,88};
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array index(0-6):");
	int i=1;
	i=sc.nextInt();
	try
	{
	  System.out.println("value of array element is:"+arr[i]);
	}
	catch(Exception e)
	{
	  e.printStackTrace();
	}
    sc.close();
	System.out.println("end of program");
  }
}