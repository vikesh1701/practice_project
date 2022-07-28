import java.util.Scanner;
class DemoSwitch_String
{
 public static void main(String args[])
 {
  System.out.println("enter your choice:");
  System.out.println("airline,bus,car,train,ship");
  Scanner sc=new Scanner(System.in);
  String str=sc.next();
  System.out.println("------------------------------------------------");
  
  switch(str.toLowerCase())
  {
     case "airline":
	 System.out.println("welcom to airline enquiry system");
     break;
  
     case "bus":
	 System.out.println("welcom to bus enquiry system");
     break;
	 
     case "car":
	 System.out.println("welcom to car enquiry system");
     break;
	 
     case "train":
	 System.out.println("welcom to train enquiry system");
     break;
	 
	 case "ship":
	 System.out.println("welcom to ship enquiry system");
     break;
  
     default:
	 System.out.println("no any enquiry system available");
  }
 }
}