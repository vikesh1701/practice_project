import java.util.Scanner;
class DemoSwitchChar
{
 public static void main(String args[])throws Exception
 {
  System.out.println("enter your choice:");
  System.out.println("a:airline,b:bus,c:car,t:train,s:ship");
  char ch=(char)System.in.read();
  
  
  System.out.println("------------------------------------------------");
  System.out.println("your option is : "+ch);
  switch(ch)
  {
     case 'a':
	 case 'A':
	 System.out.println("welcom to airline enquiry system");
     break;
  
     case 'b':
	 case 'B':
	 System.out.println("welcom to bus enquiry system");
     break;
	 
     case 'c':
	 case 'C':
	 System.out.println("welcom to car enquiry system");
     break;
	 
     case 't':
	 case 'T':
	 System.out.println("welcom to train enquiry system");
     break;
	 
	 case 's':
	 case 'S':
	 System.out.println("welcom to ship enquiry system");
     break;
  
     default:
	 System.out.println("no any enquiry system available");
  }
 }
}