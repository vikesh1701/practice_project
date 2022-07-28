import java.util.Scanner;
class FirstException
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("enter any non zero number:");
    int i=1,j=1;
	i=sc.nextInt();
	j=100/i;
	System.out.println("value of j is :"+j);
	sc.close();
	System.out.println("end of program");
	
  }
}