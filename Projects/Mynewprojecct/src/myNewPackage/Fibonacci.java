package myNewPackage;

public class Fibonacci {

	public void fib()
	{
		int temp=0;

		for(int i=0;i<1;i++)
		{ 
		 temp=temp+i;
		System.out.println(temp);
		   
		}
		
	}
	public static void main(String[] args) {
		Fibonacci f=new Fibonacci(); 
		f.fib();
	}
}
