package tarun.basic;
import java.util.Scanner;
public class Multidimentional {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size ");
	    int size= sc.nextInt();
	int temp=0;
	int tem=0;
	    int a[][]=new int[size][size];
		
		for(int i=0;i<a.length;i++)
		{ 
			
			
			for(int j=0;j<a.length;j++)
			{
				System.out.println("Enter the nessesary array");
				 a[i][j]=sc.nextInt();
				 
			}
		
		}
			for(int i=0;i<a.length;i++)
			{
				
				for(int j=0;j<a.length;j++)
				{
				 if(i==j)
				 {
					 temp=temp+a[i][j];
				 }
				 
				}
				
				
				
			}
			System.out.println( "the diagnol line1 "+temp);
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length;j++)
				{
					
					 if(i+j==size-1)
					 {
						 tem=tem+a[i][j];
					 
				}
			}
		
			
			
		

	}
			System.out.println( "the diagnol line2 "+tem);
	}
}
	
	



