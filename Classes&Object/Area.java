//program 5

class Room
{  double length,breadth,height;
  void Setdata(double l,double b,double h)
  {
   length=l;
   breadth=b;
   height=h;
   System.out.println("length,breadth,height :"+l+"::"+b+"::"+h);
  }
 void area()
 {
   System.out.println("area is :"+(length*breadth));
 }
  void volume()
  {
  System.out.println("volume is :"+(length*breadth*height));
  } 
}
  class Area
  {
   public static void main(String args[])
   {
      Room r=new Room();
	  r.Setdata(10,20,30);
	  r.area();
	  r.volume();
   }
  }








