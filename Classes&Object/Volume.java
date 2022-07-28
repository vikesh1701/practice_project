// program 2

class Room
{
  int length;
  int breadth;
  int height;
}
class Volume
{
  public static void main(String args[])
  {
     Room r=new Room();
	 r.length=10;
	 r.breadth=20;
	 r.height=40;
  System.out.println("volume is :"+(r.length*r.breadth*r.height));
  
    Room r1=new Room();
	r1.length=60;
	r1.breadth=70;
	r1.height=20;
	System.out.println("volume is :"+(r1.length*r1.breadth*r1.height));
   }
}

