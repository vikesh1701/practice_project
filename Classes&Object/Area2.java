// program 15:program without this keyword

class Room
{
  int length,breadth,height;
  Room(int length,int breadth,int height)
  {
   length=length;
   breadth=breadth;
   height=height;
   System.out.println("l,b,h :"+length+","+breadth+","+height);
  }
  void area()
  {System.out.println("area is :"+length*breadth);}

   void volume()
   {System.out.println("volume is :"+length*breadth*height);}
}
class Area2
{ 
  public static void main(String args[])
  {
   Room r=new Room(10,20,30);
   r.area();
   r.volume();
 }
}