import java.util.Scanner;
class DemoChar2
{
  public static void main(String args[])
  {
   System.out.println("enter any char:");
   Scanner sc=new Scanner(System.in);
   String str=sc.nextLine();
   char ch=str.charAt(0);
   System.out.println(str + "::" + ch);
   sc.close();
  }
}