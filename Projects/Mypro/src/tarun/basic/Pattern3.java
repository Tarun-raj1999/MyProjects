package tarun.basic;

public class Pattern3 {

	public static void main(String[] args) {
		int n=7;
		
		for(int row=0;row<n;row++)
		{
			for(int space=0;space<row;space++)
			{
			System.out.print(" ");	
			}
			for(int col=n-row;col>0;col--)
			{
				System.out.print(col);
			}
			System.out.println("");
		}
		
		

	}

}