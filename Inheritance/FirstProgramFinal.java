// program 7: final keyword

class Demo
{
 final int num=100;
  void show()
 {
  //num=110;      //error final variable can not be modified
  System.out.println("total students is:"+num);  
 }
}
class FirstProgramFinal
{
  public static void main(String args[])
  {
    Demo d=new Demo();
	//d.num=-1;       //error final variable can not be modified
	d.show();
  }
}