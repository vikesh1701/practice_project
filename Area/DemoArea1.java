class Room
{
 int length,breadth,height;

 Room(int length,int breadth,int height )
 {
  this.length=length;
  this.breadth=breadth;
  this.height=height;
 }
 void area()
 {
  System.out.println("area is :"+(length*breadth));
 }
}
class DemoArea1
{
  public static void main(String args[])
  {
   Room d=new Room(10,20,30);
  d.area();
  }
}