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
 class Area5
{
public static void main(String args [])
 {
   Room r=new Room(10,20,30);
   r.area();
   
  }
}




