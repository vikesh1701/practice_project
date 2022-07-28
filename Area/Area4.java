 import java.util.Scanner;
 class Room
{
 int length,breadth,height;
 
 Room(int l,int b,int h)
 {
  length=l;
  breadth=b;
  height=h;
 }
 public void area()
 {
 System.out.println("area is :"+(length*breadth)); 
 } 
}
 class Area4
{
public static void main(String args [])
 {
 int len=args.length;
 System.out.println("command line argumant length :"+len); 
 if (len==0)
 {System.out.println("no command");}
 else
 {System.out.println("command are:");}
 for(int i=0;i<len;i++)
 {System.out.println(args[i]);}
 
 System.out.println("---------------------------");
 
   Room r=new Room(10,200 ,30);
   r.area();
  System.out.println("---------------------------");
 
 Scanner sc=new Scanner(System.in);
 System.out.println("enter full name:");
 String name=sc.nextLine();
 System.out.println("welcom:" + name + "\tji" );
 System.out.println("your sallary amount is::1,00,00,000(crore)");

System.out.println("---------------------------");
  }
}
