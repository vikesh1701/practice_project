class A
{
  final int num=10;
  void getvalue()
  {
    for(int i=1;i<num;i++)
	{
	  System.out.println("total students :"+i);
	}
  }
}
class FirstUseOfFinal
{
  public static void main(String args[])
  {
  A oa=new A();
  System.out.println(oa.num);
  //oa.num=5;
  System.out.println(oa.num);
  oa.getvalue();
  
  }
}