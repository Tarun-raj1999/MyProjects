package tarun.basic;
import java.util.Scanner;


public class Evennum {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the array size");
		int size=sc.nextInt();
	
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			
			System.out.println("Enter the values");
			 a[i]=sc.nextInt();
			
		}
		int evenvalue=0;
		 int oddvalue=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0) {
			
				evenvalue+=a[i];
				
					
				}
			else
			{
				
				oddvalue+=a[i];
				
						
			}
				
		}
		System.out.println("Sum of the evenindex "+"="+evenvalue);
		System.out.println(" Sum of the oddindex"+"="+oddvalue);
	}

}