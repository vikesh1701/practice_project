import java.util.*;
//import java.util.Scanner;
//import java.util.InputMismatchException;
class TryCatchPractice1
{
   public static void main(String args[])
   {
     int arr[]={22,33,44,55,66,77,88};
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter any index (0-6): ");
     int i=0;
     try
	 {
	 i=sc.nextInt();
	 }
	 catch(InputMismatchException e)
	 {
	  e.printStackTrace();
	 }
	 try
	 {
	 System.out.println("value of arr["+i+"] is:"+arr[i]);
	 }
	 catch(IndexOutOfBoundsException e)
	 {
	  e.printStackTrace();
	 }
	
	  sc.close();
	 System.out.println("end of program");
   }
}