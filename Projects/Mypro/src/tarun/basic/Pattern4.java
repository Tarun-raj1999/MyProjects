package tarun.basic;

public class Pattern4 {

	public static void main(String[] args) {
	int n=4;
	int j=1;//1,2,3,4
	int k=1;
		for(int row=0;row<n;row++)//0,1,2,3
		{
			for(int space=0;space<n-k;space++)
			{
			System.out.print(" ");
		}
			for(int col=1;col<=row+j;col++)
			{
				System.out.print(col);
			}
			System.out.println("");
			j++;
			k++;
	}

 }
}