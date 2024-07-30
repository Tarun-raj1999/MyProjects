package myNewPackage;

public class Eligibility {

	int a=8;
	public void eligibility()
	{
		if(a>=18)
		{
			System.out.println("you are eligible to vote");
		}
		else
		{
			System.out.println("you are not eligible to vote");
		}
	}
	public static void main(String[] args) {
		Eligibility obj1=new Eligibility();
		obj1.eligibility();

	}

}
