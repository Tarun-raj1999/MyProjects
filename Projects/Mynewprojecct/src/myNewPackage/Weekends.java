package myNewPackage;

public class Weekends {

public void switchS()
{
	int day=3;
	
	switch (day) {
	case 1:
		System.out.println("this is sunday");
		break;
	case 2:
		System.out.println("this is monday");
		break;
	case 3:
		System.out.println("this is tuesday");
		break;
	case 4:
		System.out.println("this is wednesday");
		break;
	case 5:
		System.out.println("this is thursday");
		break;
	case 6:
		System.out.println("this is friday");
		break;
	case 7:
		System.out.println("this is saturday");
		break;
		default:
		System.out.println("enter the valid input");
			
		}

		
		
}
	
	



	
	public static void main(String[] args) {
		Weekends obj1=new Weekends();
	
		obj1.switchS();
		

	}
}

