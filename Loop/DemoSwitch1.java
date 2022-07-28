class DemoSwitch1
{
 public static void main(String args[])
 {
  int i=(int)(Math.random()*15);
  System.out.println("i is :"+i);
  
  switch(i)
  {
    case 1:
	case 2:
	case 3:
	System.out.println("1 st Q");
    break;
  
    case 4:
	case 5:
	case 6:
	System.out.println("2 nd Q");
	break;
	
    case 7:
	case 8:
	case 9:
	System.out.println("3 rd Q");
	break;
	
    case 10:
	case 11:
	case 12:
	System.out.println("4 th Q");
	break;
	
	default:
	System.out.println("no match found");
  }
 }

}