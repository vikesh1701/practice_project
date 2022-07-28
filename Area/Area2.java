class Room
{
float area(float length,float breadth)
{
  return (length*breadth);
}
}
 class Area2
 {
 public static void main(String args [])
 {
 Room r=new Room();
 float result=r.area(100.0f,20.0f);
 System.out.println("result is :"+result);
 if(result>500)
  { 
  System.out.println("big room");
  } 
 else
 {
 System.out.println("small room");
 }
 
 }
 }
