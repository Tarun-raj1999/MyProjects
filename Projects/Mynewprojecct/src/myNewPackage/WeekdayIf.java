package myNewPackage;

public class WeekdayIf {
public void week()
{
	int a=8;
	if(a>0 && a<=7)
	{
		if(a==1)
		{
			System.out.println("this is sunday");
		}
		else if(a==2)
		{
			System.out.println("this is monday");
		}
		else if (a==3)
		{
			System.out.println("this is tuesday");
		}
		else if(a==4)
		{
			System.out.println("this is wednesday");
		}
		else if(a==5)
		{
			System.out.println("this is thursday");
		}
		else if(a==6)
		{
			System.out.println("this is friday");
		}
		else if(a==7)
		{
			System.out.println("this is saturday");
		}
		
	}
	else
	{
		System.out.println("enter the valid input");
	}
}
	public static void main(String[] args) {
		WeekdayIf w=new WeekdayIf();
		w.week();

	}

}
