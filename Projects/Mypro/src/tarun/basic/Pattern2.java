package tarun.basic;

public class Pattern2 {

	public static void main(String[] args) {
		int n=4;
		for(int row=0;row<n;row++)
		{
			for(int space=0;space<row;space++)//
			{
				System.out.print(" ");
			}
			for(int col=4;col>row;col--)
			{
				System.out.print("*");
				
			}
			System.out.println("");
		}

	}

}