package myNewPackage;
import java.util.Scanner;

public class Array {

	public void array()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		
		int c[]=new int[size];
		for(int i=0;i<size;i++)
		{
		  Scanner sc1=new Scanner(System.in);
		  System.out.println("Enter the numbers");
		 c[i] =sc1.nextInt();
		}
		for(int element:c)
		{
			if(element%2==0)
			{
				System.out.println(element+"is even");
			}
			else
			{
				System.out.println(element+"it is odd");
			}
		}
		
		

	}
	
  public static void main(String[] args) {
	  {
		  Array a=new Array();
		  a.array();
	  }
}
}
