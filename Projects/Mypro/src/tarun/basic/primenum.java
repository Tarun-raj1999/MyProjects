package tarun.basic;

public class primenum {

	public static void main(String[]args)
	{
		int userValue=10;
		int count=0;
		
		for(int i=1;i<=userValue;i++)//1 2 3
		{
			if(userValue%i==0)//2 5 10
			{ 
				 count++;
				
			 if(count>2) {
				System.out.println("it is not prime num");
			}
		
			
			 else 
				{
					System.out.println("it is  a primenum");
				}
					
			
			}

			
		
			
		
	}
	
}
}