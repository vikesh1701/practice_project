class Room
{
 void area(int length,int breadth)
 {
  System.out.println("area of room is:"+(length*breadth));
 
 }
void volume(int length,int breadth,int height)
 {
  System.out.println("volume of room is:"+(length*breadth*height));
 }
}
class UseRoom1
{
 public static void main(String args[])
 {
    Room r=new Room();
	r.area(5,6);
	r.volume(5,6,2);
 System.out.println("--------------------");
 
 r.area(6,5);
 r.volume(6,7,2);
}
}