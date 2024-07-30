package myNewPackage;

public class FibonnaciSeries {

	public void fib()
	{
	int n1=0;
	int n2=1;
	int n3;
	
		for(int i=0;i<10;i++)
		{
			n3=n1+n2;
		
		
		
			System.out.print(n3);
			n1=n2;
			n2=n3;
			
		
		}
		
	}
	public static void main(String[] args) {
	 
		FibonnaciSeries f=new FibonnaciSeries();
		f.fib();
		
	}

}
