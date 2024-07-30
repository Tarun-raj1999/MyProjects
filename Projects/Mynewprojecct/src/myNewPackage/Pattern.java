package myNewPackage;

public class Pattern {


 
	
	
	
	public static void main(String[] args) {
		 int line =5;
	
		for(int row=0;row<line;row++)
		{
			for(int col=0;(col+row)%2==0;col++)
			{
				System.out.print("*");
			}
			for(int space=0;(space+row)%2!=0;space++)
			{
				System.out.print(" ");
			}
	
		}
		System.out.println("");
		
	
		
	}

}
