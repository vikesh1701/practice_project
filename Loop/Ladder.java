class Ladder
{
public static void main(String args[])
{  
 int marks=(int)(Math.random()*101);
 System.out.println("marks is:"+marks);
 
 
 if(marks>=80)
    System.out.println("A grade");
 else if(marks>=60)
	 System.out.println("B grade");
 else if(marks>=40)
	 System.out.println("C grade");
 else 
	 System.out.println("Fail");
}
}