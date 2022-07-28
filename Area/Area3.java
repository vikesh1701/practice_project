 class Room
{
 int length,breadth,height;
 
 
 Room()
 {
 
 }
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

 void Room()
 {
 int n=(int)(Math.random()*20);
 System.out.println("random number is:"+n);
 
 }
 
}
 class Area3
{
public static void main(String args [])
 {
   Room r=new Room(10,20,30);
   r.area();
   Room r1=new Room();
   Room r2=new Room();
   r2.Room();
  }
}




