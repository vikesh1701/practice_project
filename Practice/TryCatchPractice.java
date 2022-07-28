import java.util.Scanner;
class TryCatchPractice
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter any non zero number: ");
     int i=0,j=0;
	 
	 try
	 {
	 i=sc.nextInt();
	 }
	 catch(Exception e)
	 {
	   e.printStackTrace();
	 }
	 try
	 {
	 j=100/i;
	 }
	 catch(Exception e)
	 {
	   e.printStackTrace();
	 }
	 System.out.println("valueof j is:"+j);
	 sc.close();
	 System.out.println("end of program");
   }
}