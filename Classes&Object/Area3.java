// program 16:program with this keyword

class Room
{
  int length,breadth,height;
  Room(int length,int breadth,int height)
  {
   this.length=length;
   this.breadth=breadth;
   this.height=height;
   System.out.println("l,b,h :"+length+","+breadth+","+height);
  }
  void area()
  {System.out.println("area is :"+length*breadth);}

   void volume()
   {System.out.println("volume is :"+length*breadth*height);}
}
class Area3
{ 
  public static void main(String args[])
  {
   Room r=new Room(10,20,30);
   r.area();
   r.volume();
 }
}