// program 6
 class Room
 {
   double area(double l,double b)
   {
   // System.out.println("area is :"+(l*b));
	return (l*b);   
   }
   double volume(double l,double b, double h)
   {
  // System.out.println("volume is :"+(l*b*h));
   return (l*b*h);
   }
 }
 class Area1
 {
  public static void main(String args[])
  {
    Room r=new Room();
	double value=r.area(10,20);
	System.out.println("area is :"+value);
	
	if(value>1000)
	   {System.out.println("big room");}
	else
	  {System.out.println("small room");}
	
	System.out.println("volume is :"+ r.volume(10,20,30));
	System.out.println("end of prg");
  }
 }