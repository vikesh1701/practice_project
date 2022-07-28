//WAP to print volume of sphere.
class PartAQ4
{
 public static void main(String[]args)
 {
  int r=(int)(Math.random()*10);
  System.out.println("radius of sphere is : "+r);
  
  double PI=3.14;
  double area=4*PI*r*r;
  System.out.println("area of the sphere is :"+area);
 
 double volume=(4*PI*r*r*r)/3;
 System.out.println("volume of the sphere is :"+ volume);
 
 }
}